import random

class Battle:
    def __init__(self, player, enemy):
        self.player = player
        self.enemy = enemy
        self.turn = "player"

    def player_turn(self):
        print(f"\n{self.player.name}'s turn:")
        print("Choose an action:")
        print("1. Attack")
        print("2. Defend")
        print("3. Use Magic")
        print("4. Use Item")

        choice = input("> ")
        if choice == "1":
            damage = self.player.attack_enemy(self.enemy)
            print(f"You dealt {damage} damage to {self.enemy.name}.")
        elif choice == "2":
            self.player.defend()
            print("You defend and increase your defense for this turn.")
        elif choice == "3":
            damage = self.player.use_magic(self.enemy)
            print(f"You used magic and dealt {damage} damage to {self.enemy.name}.")
        elif choice == "4":
            item = input("Enter the item name: ")
            self.player.use_item(item)

    def enemy_turn(self):
        print(f"\n{self.enemy.name}'s turn:")
        action = self.enemy.choose_action()
        if action == "attack":
            damage = self.enemy.attack_player(self.player)
            print(f"{self.enemy.name} dealt {damage} damage to you.")

    def apply_status_effects(self):
        pass  # Implement status effects if needed

    def is_battle_over(self):
        if self.player.health <= 0:
            print("You have been defeated!")
            return True
        elif self.enemy.health <= 0:
            print(f"You have defeated the {self.enemy.name}!")
            return True
        return False

    def start_battle(self):
        print(f"A wild {self.enemy.name} appeared!")
        while not self.is_battle_over():
            if self.turn == "player":
                self.player_turn()
                self.turn = "enemy"
            else:
                self.enemy_turn()
                self.turn = "player"
            self.apply_status_effects()
            self.player.reset_defense()  # Reset defense to the original value after each turn
            print(f"Player Health: {self.player.health}, Enemy Health: {self.enemy.health}")

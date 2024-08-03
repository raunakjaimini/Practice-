from player import Player
from enemy import Enemy
from battle import Battle
import random

def main():
    print("Welcome to RPG Battle!")
    name = input("Enter your character's name: ")
    print("Choose your class: 1. Warrior 2. Mage 3. Archer")
    class_choice = input("> ")

    if class_choice == "1":
        player_class = "Warrior"
    elif class_choice == "2":
        player_class = "Mage"
    elif class_choice == "3":
        player_class = "Archer"
    else:
        print("Invalid choice. Defaulting to Warrior.")
        player_class = "Warrior"

    player = Player(name, player_class)

    enemies = ["Goblin", "Orc", "Dragon"]
    enemy_type = random.choice(enemies)
    enemy = Enemy("Wild " + enemy_type, enemy_type)

    battle = Battle(player, enemy)
    battle.start_battle()

if __name__ == "__main__":
    main()

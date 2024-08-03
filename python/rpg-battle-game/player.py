class Player:
    def __init__(self, name, player_class):
        self.name = name
        self.player_class = player_class
        self.inventory = Inventory()
        if player_class == "Warrior":
            self.health = 100
            self.attack = 15
            self.defense = 10
            self.magic = 5
        elif player_class == "Mage":
            self.health = 80
            self.attack = 10
            self.defense = 5
            self.magic = 20
        elif player_class == "Archer":
            self.health = 90
            self.attack = 12
            self.defense = 7
            self.magic = 10
        self.original_defense = self.defense  # Keep track of the original defense value

    def attack_enemy(self, enemy):
        damage = self.attack - enemy.defense
        damage = max(damage, 0)
        enemy.health -= damage
        return damage

    def defend(self):
        self.defense *= 2

    def use_magic(self, enemy):
        damage = self.magic * 2 - enemy.defense
        damage = max(damage, 0)
        enemy.health -= damage
        return damage

    def use_item(self, item_name):
        item = self.inventory.use_item(item_name)
        if item:
            if item_name == "Health Potion":
                self.health += 20
            elif item_name == "Mana Potion":
                self.magic += 10

    def reset_defense(self):
        self.defense = self.original_defense

class Inventory:
    def __init__(self):
        self.items = {
            "Health Potion": 3,
            "Mana Potion": 2
        }

    def add_item(self, item_name, quantity=1):
        if item_name in self.items:
            self.items[item_name] += quantity
        else:
            self.items[item_name] = quantity

    def use_item(self, item_name):
        if item_name in self.items and self.items[item_name] > 0:
            self.items[item_name] -= 1
            return item_name
        else:
            print(f"No {item_name} left!")
            return None

    def __str__(self):
        return str(self.items)

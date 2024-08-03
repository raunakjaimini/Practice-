import random

class Enemy:
    def __init__(self, name, enemy_type):
        self.name = name
        self.enemy_type = enemy_type
        if enemy_type == "Goblin":
            self.health = 50
            self.attack = 10
            self.defense = 5
        elif enemy_type == "Orc":
            self.health = 80
            self.attack = 15
            self.defense = 10
        elif enemy_type == "Dragon":
            self.health = 150
            self.attack = 20
            self.defense = 15

    def attack_player(self, player):
        damage = self.attack - player.defense
        damage = max(damage, 0)
        player.health -= damage
        return damage

    def choose_action(self):
        return "attack"

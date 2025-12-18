# Project: RPG Character System

## Overview
Design and implement a complete RPG character system with classes for Player, Enemy, and Item.

## Requirements

### Part 1: Character Base Class
Create a Character class with:
- name, health, maxHealth, x, y
- takeDamage(int), heal(int), isAlive()
- move(double dx, double dy)

### Part 2: Player Class
Extends Character with:
- experience, level, inventory
- gainExperience(int)
- levelUp()
- addItem(String)

### Part 3: Enemy Class  
Extends Character with:
- enemyType, attackPower, goldDrop
- attack()
- dropLoot()

### Part 4: Combat System
Implement battle mechanics:
- Turn-based combat
- Damage calculation
- Victory/defeat conditions

## Grading: 100 points
- Character class: 20 pts
- Player class: 25 pts
- Enemy class: 25 pts
- Combat system: 30 pts

## Testing
Create multiple characters and simulate battles demonstrating all features.

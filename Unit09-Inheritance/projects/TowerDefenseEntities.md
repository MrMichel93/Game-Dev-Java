# Project: Tower Defense Entity System

## Overview
Design an inheritance hierarchy for a tower defense game with towers, enemies, and projectiles.

## Requirements

### Part 1: Entity Base Class
- position (x, y)
- health
- isAlive()
- update()

### Part 2: Tower Hierarchy
- Tower base class extends Entity
- BasicTower, SniperTower, SplashTower subclasses
- Each with unique attack patterns

### Part 3: Enemy Hierarchy
- Enemy base class extends Entity
- FastEnemy, TankEnemy, FlyingEnemy subclasses
- Each with unique movement/health

### Part 4: Polymorphism
- Store different types in same array/list
- Call methods polymorphically

## Grading: 100 points
- Entity base: 20 pts
- Tower hierarchy: 25 pts
- Enemy hierarchy: 25 pts
- Polymorphism: 30 pts

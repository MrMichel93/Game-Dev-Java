# Unit 5: Writing Classes - Complete Game Entities

## Unit Overview

Learn to design and implement complete Java classes with proper encapsulation. Create Player, Enemy, and other game entity classes following OOP principles.

## AP CS A Alignment

- **Topic 5.1:** Anatomy of a Class
- **Topic 5.2:** Constructors
- **Topic 5.3:** Documentation with Comments
- **Topic 5.4:** Accessor Methods
- **Topic 5.5:** Mutator Methods
- **Topic 5.6:** Writing Methods
- **Topic 5.7:** Scope and Access
- **Topic 5.8:** this Keyword
- **Topic 5.9:** Static Variables and Methods
- **Topic 5.10:** this Keyword (continued)

## Learning Objectives

1. Design complete classes with instance variables and methods
2. Write constructors to initialize objects
3. Implement accessor (getter) and mutator (setter) methods
4. Apply encapsulation using private/public modifiers
5. Use the `this` keyword appropriately
6. Distinguish between static and instance members

## Key Concepts

### Class Structure
```java
public class Player {
    // Instance variables (private)
    private int x, y;
    private int health;
    private String name;
    
    // Constructor
    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.health = 100;
    }
    
    // Methods
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    // Accessors
    public int getHealth() { return health; }
    public String getName() { return name; }
}
```

### Encapsulation Principle
- **Private data:** Instance variables should be private
- **Public interface:** Methods provide controlled access
- **Validation:** Methods can enforce constraints
- **Flexibility:** Internal implementation can change

## Game Applications
- **Player Class:** Complete character representation
- **Enemy Class:** AI-controlled entities
- **Projectile Class:** Bullets, missiles, etc.
- **PowerUp Class:** Collectible items

## Unit Contents

### Lessons
- [Lesson 1: Writing the Player Class](lessons/Lesson1-Player-Class.md) ✓ Available

### Practice Problems
1. [Weapon Class](practice-problems/Problem1_WeaponClass.java)
2. [Inventory Class](practice-problems/Problem2_InventoryClass.java)
3. [Enemy Class](practice-problems/Problem3_EnemyClass.java)

### Projects
- [RPG Character System](projects/RPGCharacterSystem.md)

## Prerequisites

- Completed Units 1-4
- Understanding of variables, methods, and objects

## Next Unit

After mastering class design, proceed to [Unit 6: Array](../Unit06-Array/README.md) to learn about collections.

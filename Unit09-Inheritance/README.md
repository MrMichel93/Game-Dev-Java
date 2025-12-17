# Unit 9: Inheritance - Enemy Hierarchies

## Unit Overview

Master inheritance to create class hierarchies. Build enemy type systems, weapon hierarchies, and power-up families using superclass/subclass relationships.

## AP CS A Alignment

- **Topic 9.1:** Creating Superclasses and Subclasses
- **Topic 9.2:** Writing Constructors for Subclasses
- **Topic 9.3:** Overriding Methods
- **Topic 9.4:** super Keyword
- **Topic 9.5:** Creating References Using Inheritance Hierarchies
- **Topic 9.6:** Polymorphism
- **Topic 9.7:** Object Superclass

## Learning Objectives

1. Create superclass and subclass relationships using `extends`
2. Write constructors that use `super()`
3. Override methods in subclasses
4. Use the `super` keyword to call parent methods
5. Apply polymorphism with superclass references
6. Understand the Object class as ultimate superclass

## Key Concepts

### Inheritance Syntax
```java
// Superclass
public class Enemy {
    protected int x, y, health;
    
    public Enemy(int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
    }
    
    public void move() {
        y += 1;
    }
}

// Subclass
public class FastEnemy extends Enemy {
    public FastEnemy(int x, int y) {
        super(x, y, 50);  // Call parent constructor
    }
    
    @Override
    public void move() {
        y += 3;  // Faster movement
    }
}
```

### Polymorphism
```java
// Superclass reference, subclass objects
Enemy e1 = new BasicEnemy(100, 0);
Enemy e2 = new FastEnemy(200, 0);
Enemy e3 = new BossEnemy(300, 0);

// Array of different enemy types
Enemy[] enemies = {e1, e2, e3};

for (Enemy e : enemies) {
    e.move();  // Each calls its own version!
}
```

## Game Applications
- **Enemy Hierarchies:** Enemy → BasicEnemy, FastEnemy, BossEnemy
- **Weapon Systems:** Weapon → Sword, Bow, MagicStaff
- **Power-Ups:** PowerUp → SpeedBoost, HealthPack, Shield
- **Projectiles:** Projectile → Bullet, Laser, Missile

## Unit Contents

### Lessons
- [Lesson 1: Enemy Hierarchies with Inheritance](lessons/Lesson1-Enemy-Hierarchies.md) ✓ Available

### Practice Problems
Coming soon: 3 problems on inheritance, overriding, and polymorphism

### Projects
Coming soon: Complete RPG enemy system with inheritance

## Prerequisites

- Completed Units 1-8
- Strong understanding of class design

## Next Unit

Complete the course with [Unit 10: Recursion](../Unit10-Recursion/README.md)!

# Unit 7: ArrayList - Dynamic Entity Management

## Unit Overview

Master ArrayList for dynamic collections that grow and shrink. Implement enemy spawning systems, projectile management, and dynamic game objects.

## AP CS A Alignment

- **Topic 7.1:** Introduction to ArrayList
- **Topic 7.2:** ArrayList Methods
- **Topic 7.3:** Traversing ArrayLists
- **Topic 7.4:** Developing Algorithms Using ArrayLists
- **Topic 7.5:** Searching
- **Topic 7.6:** Sorting

## Learning Objectives

1. Create and use ArrayList objects
2. Add, remove, and access elements
3. Traverse ArrayLists with loops
4. Implement dynamic game systems
5. Search and sort ArrayLists
6. Apply polymorphism with ArrayLists

## Key Concepts

### ArrayList Basics
```java
// Import
import java.util.ArrayList;

// Creation
ArrayList<Enemy> enemies = new ArrayList<Enemy>();
ArrayList<Projectile> bullets = new ArrayList<Projectile>();

// Adding elements
enemies.add(new Enemy("Goblin", 100, 200));
bullets.add(new Bullet(playerX, playerY));

// Accessing
Enemy first = enemies.get(0);
int count = enemies.size();

// Removing
enemies.remove(0);  // Remove by index
bullets.remove(bullet);  // Remove by reference
```

### Dynamic Management
```java
// Update and remove inactive projectiles
for (int i = bullets.size() - 1; i >= 0; i--) {
    bullets.get(i).update();
    if (!bullets.get(i).isActive()) {
        bullets.remove(i);
    }
}
```

## Game Applications
- **Dynamic Enemy Spawning:** Add enemies during gameplay
- **Projectile Systems:** Bullets that appear and disappear
- **Particle Effects:** Dynamic particle lists
- **Inventory:** Items that can be added/removed

## Coming Soon

Complete lessons and materials are in development!

## Prerequisites

- Completed Units 1-6
- Understanding of arrays

## Next Unit

Proceed to [Unit 8: 2D Array](../Unit08-2D-Array/README.md) for grid-based systems.

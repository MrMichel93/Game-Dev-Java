# Unit 6: Array - Managing Entity Collections

## Unit Overview

Learn to use arrays to manage collections of game entities. Store multiple enemies, high scores, grid tiles, and more using fixed-size arrays.

## AP CS A Alignment

- **Topic 6.1:** Array Creation and Access
- **Topic 6.2:** Traversing Arrays
- **Topic 6.3:** Enhanced for Loop for Arrays
- **Topic 6.4:** Developing Algorithms Using Arrays

## Learning Objectives

1. Declare and initialize arrays
2. Access array elements using indices
3. Traverse arrays with loops
4. Use enhanced for-each loops
5. Implement array algorithms (search, find max, etc.)
6. Manage collections of game objects

## Key Concepts

### Array Basics
```java
// Declaration and initialization
int[] scores = new int[10];
Enemy[] enemies = new Enemy[5];

// Initialization with values
int[] highScores = {1000, 950, 900, 850, 800};

// Access and modify
scores[0] = 100;
enemies[2] = new Enemy("Goblin", 100, 200);
```

### Traversal
```java
// Standard for loop
for (int i = 0; i < enemies.length; i++) {
    enemies[i].update();
}

// Enhanced for loop
for (Enemy e : enemies) {
    e.draw();
}
```

## Game Applications
- **Enemy Arrays:** Fixed number of enemies
- **High Score Tables:** Top 10 scores
- **Inventory Systems:** Item slots
- **Grid Rows:** Single row of tiles

## Coming Soon

Complete lessons and materials are in development!

## Prerequisites

- Completed Units 1-5
- Understanding of classes and objects

## Next Unit

Proceed to [Unit 7: ArrayList](../Unit07-ArrayList/README.md) for dynamic collections.

## Unit Contents

### Lessons
- [Lesson 1: Arrays](lessons/Lesson1-Arrays.md)

### Practice Problems
1. [High Scores](practice-problems/Problem1_HighScores.java)
2. [Enemy Manager](practice-problems/Problem2_EnemyManager.java)
3. [Inventory Search](practice-problems/Problem3_InventorySearch.java)

### Code Examples
- [GameInventory.java](code-examples/GameInventory.java)

### Projects
- [Level System](projects/LevelSystem.md)

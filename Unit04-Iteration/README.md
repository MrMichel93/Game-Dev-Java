# Unit 4: Iteration - Game Loops and Updates

## Unit Overview

Master loops to create game loops, update multiple entities, and process collections. Learn while loops, for loops, and nested iteration patterns.

## AP CS A Alignment

- **Topic 4.1:** while Loops
- **Topic 4.2:** for Loops
- **Topic 4.3:** Developing Algorithms Using Strings
- **Topic 4.4:** Nested Iteration
- **Topic 4.5:** Informal Code Analysis

## Learning Objectives

1. Use while loops for game loop patterns
2. Use for loops to iterate over arrays
3. Implement nested loops for grid-based games
4. Update multiple game entities efficiently
5. Process strings character-by-character
6. Analyze algorithm efficiency

## Key Concepts

### Game Loop Pattern
```java
boolean running = true;
while (running) {
    handleInput();
    updateGame();
    render();
}
```

### Updating Entities
```java
for (int i = 0; i < enemies.length; i++) {
    enemies[i].move();
    enemies[i].update();
}
```

### Grid Processing
```java
for (int row = 0; row < grid.length; row++) {
    for (int col = 0; col < grid[row].length; col++) {
        updateCell(row, col);
    }
}
```

## Game Applications
- **Main Game Loop:** while loop for continuous updates
- **Entity Updates:** for loop over collections
- **Animation Frames:** iterating through sprite frames
- **Grid Games:** nested loops for tile-based systems

## Unit Contents

### Lessons
- [Lesson 1: Loops and Iteration](lessons/Lesson1-Loops-and-Iteration.md)

### Practice Problems
1. [Enemy Spawner](practice-problems/Problem1_EnemySpawner.java)
2. [Grid Generator](practice-problems/Problem2_GridGenerator.java)
3. [Collision Loop](practice-problems/Problem3_CollisionLoop.java)

### Code Examples
- [GameLoop.java](code-examples/GameLoop.java)

### Projects
- [Particle System](projects/ParticleSystem.md)

## Prerequisites

- Completed Units 1-3
- Understanding of conditionals

## Next Unit

Proceed to [Unit 5: Writing Classes](../Unit05-Writing-Classes/README.md) to learn OOP!

# Lesson 1: Loops and Iteration

## Learning Objective
Master loops (for, while, do-while) to implement game updates, animations, and repetitive game logic.

## for Loops
```java
// Basic for loop
for (int i = 0; i < 10; i++) {
    System.out.println("Frame: " + i);
}

// Spawn multiple enemies
for (int i = 0; i < enemyCount; i++) {
    spawnEnemy();
}
```

## while Loops
```java
// Game loop
while (!gameOver) {
    updateGame();
    checkCollisions();
    render();
}

// Countdown
int time = 60;
while (time > 0) {
    displayTime(time);
    time--;
}
```

## Nested Loops
```java
// 2D grid
for (int row = 0; row < rows; row++) {
    for (int col = 0; col < cols; col++) {
        grid[row][col] = createTile();
    }
}
```

## Common Patterns
- Iterate over game objects
- Update all enemies
- Check all collisions
- Generate level layouts
- Animate sequences

## AP Exam Tips
- Remember loop bounds (< vs <=)
- Off-by-one errors are common
- Nested loops: outer runs once per inner complete execution

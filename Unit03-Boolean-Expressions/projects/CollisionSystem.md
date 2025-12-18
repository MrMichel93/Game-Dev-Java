# Project: Collision Detection System

## Project Overview
Build a comprehensive collision detection system for a game that demonstrates boolean expressions, conditional logic, and multiple collision algorithms.

## Learning Objectives
- Implement multiple collision detection algorithms
- Use compound boolean expressions
- Apply if-else chains for game logic
- Handle boundary checking and object interactions

## Requirements

### Part 1: Collision Methods (Required)
Implement these collision detection methods:
1. Rectangle-Rectangle (AABB)
2. Circle-Circle
3. Point-in-Rectangle
4. Point-in-Circle

### Part 2: Game Objects (Required)
Create classes for:
- Player (rectangle)
- Enemy (circle)
- Coin (point or small circle)
- Wall (rectangle)

### Part 3: Collision Response (Required)
When collisions occur:
- Player-Enemy: Reduce player health
- Player-Coin: Increase score
- Player-Wall: Prevent movement
- Enemy-Boundary: Bounce back

### Part 4: Game State (Required)
Track and display:
- Player health
- Score
- Game over condition
- Win condition (collect all coins)

### Part 5: Boundaries (Required)
- Keep player within screen bounds
- Bounce enemies off boundaries
- Detect when objects leave screen

## Starter Code

```java
public class CollisionSystem {
    // Game objects
    static Player player;
    static Enemy enemy1, enemy2;
    static Coin[] coins;
    static Wall[] walls;
    
    // Game state
    static int score = 0;
    static boolean gameOver = false;
    
    public static void main(String[] args) {
        initializeGame();
        
        // Simulate game loop
        for (int frame = 0; frame < 100 && !gameOver; frame++) {
            updateGame();
            checkCollisions();
            displayState();
        }
    }
    
    // TODO: Implement all methods
}

class Player {
    int x, y, width, height, health;
    // TODO: Constructor and methods
}

class Enemy {
    double x, y, radius;
    // TODO: Constructor and methods
}
```

## Testing Checklist
- [ ] AABB collision works correctly
- [ ] Circle collision works correctly
- [ ] Point collision works correctly
- [ ] Player-Enemy collision reduces health
- [ ] Player-Coin collision increases score
- [ ] Boundaries prevent player from leaving screen
- [ ] Game over when health <= 0
- [ ] Win condition when all coins collected

## Grading Rubric
| Category | Points |
|----------|--------|
| Collision Methods | 30 |
| Game Objects | 20 |
| Collision Response | 25 |
| Game State Logic | 15 |
| Boundary Handling | 10 |

**Total: 100 points**

## AP CS A Connection
- Topic 3.1-3.6: Boolean expressions and conditionals
- Common FRQ pattern: Collision detection algorithms

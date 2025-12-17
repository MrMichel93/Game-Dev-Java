# Lesson 1: Variables and Game State

## Learning Objective
Understand how variables represent game state and use primitive data types (int, double, boolean) to track player attributes, positions, and scores.

## Introduction

In games, **state** is everything the game needs to remember: player position, score, health, level, etc. In Java, we use **variables** to store this state. Unlike Python's dynamic typing, Java requires us to declare the **type** of each variable.

### Python vs Java: Variable Declaration

**Python:**
```python
score = 0
player_x = 100.5
is_alive = True
player_name = "Hero"
```

**Java:**
```java
int score = 0;
double playerX = 100.5;
boolean isAlive = true;
String playerName = "Hero";
```

**Key Differences:**
- Java requires explicit type declaration (`int`, `double`, etc.)
- Java uses semicolons to end statements
- Java uses camelCase for variable names (not snake_case)
- Java has primitive types (lowercase) and reference types (capitalized)

## Primitive Data Types in Java

Java has 8 primitive types, but we'll focus on the most common ones for game development:

| Type | Size | Range | Use in Games |
|------|------|-------|--------------|
| `int` | 32-bit | -2³¹ to 2³¹-1 | Score, health, item count, enemy count |
| `double` | 64-bit | ~15 decimal digits | Precise position (x, y), velocity, rotation |
| `boolean` | 1-bit | true or false | Game state flags (isJumping, isPaused, gameOver) |
| `char` | 16-bit | Unicode character | Keyboard input, grid tiles |

### Additional Types (Less Common in Games)
- `byte` (8-bit): Very small numbers, save memory in large arrays
- `short` (16-bit): Small numbers, less common
- `long` (64-bit): Very large numbers, timestamps
- `float` (32-bit): Less precise decimals, sometimes used for graphics

## Class Design: Game Variables

Let's think about what variables a simple game needs:

```java
// Player position and movement
int playerX = 100;
int playerY = 200;
int playerSpeed = 5;

// Player attributes
int playerHealth = 100;
int playerScore = 0;
int playerLives = 3;

// Enemy data
int enemyX = 500;
int enemyY = 300;
int enemySpeed = 3;

// Game state
boolean gameOver = false;
boolean isPaused = false;
int currentLevel = 1;
```

**Design Principle:** Group related variables together conceptually. Later, these will become **instance variables** in classes like `Player` and `Enemy`.

## OOP Principle: Data vs. Behavior

In procedural programming (like early C or scripting), we work with loose variables and functions:

```java
// Procedural style (what we're learning now)
int playerX = 100;
int playerY = 100;

void movePlayer(int dx, int dy) {
    playerX += dx;
    playerY += dy;
}
```

In Object-Oriented Programming (coming in Unit 5), we encapsulate data WITH behavior:

```java
// OOP style (coming soon)
class Player {
    private int x = 100;  // Data
    private int y = 100;
    
    public void move(int dx, int dy) {  // Behavior
        x += dx;
        y += dy;
    }
}
```

**For now:** We're learning the foundation. Understanding individual variables helps us appreciate why objects are powerful.

## Coding Lab: Score Tracking System

**Goal:** Create a score tracking system for a simple game using primitive types.

### Setup (Processing)

Create a new Processing sketch called `ScoreTracker`:

```java
// Game variables - PRIMITIVE TYPES
int score = 0;
int multiplier = 1;
int scoreThreshold = 100;
boolean bonusActive = false;

void setup() {
    size(600, 400);
    textSize(32);
}

void draw() {
    background(50);
    
    // Display score
    fill(255);
    text("Score: " + score, 20, 50);
    text("Multiplier: x" + multiplier, 20, 100);
    
    // Display bonus status
    if (bonusActive) {
        fill(255, 200, 0);
        text("BONUS ACTIVE!", 20, 150);
    }
    
    // Instructions
    fill(200);
    textSize(16);
    text("Press SPACE to add points", 20, 350);
    text("Press 'B' to toggle bonus", 20, 375);
}

void keyPressed() {
    if (key == ' ') {
        // TODO: Add points to score
        // If bonusActive, use multiplier
    }
    
    if (key == 'b' || key == 'B') {
        // TODO: Toggle bonusActive
    }
}
```

### Your Task

Implement the TODO sections:

1. **Add Points:** When SPACE is pressed:
   - If `bonusActive` is true, add `10 * multiplier` to score
   - Otherwise, add `10` to score
   - Check if score crosses `scoreThreshold`

2. **Threshold Check:** When score exceeds threshold:
   - Increase `multiplier` by 1
   - Increase `scoreThreshold` by 100
   - Print message to console

3. **Bonus Toggle:** When 'B' is pressed:
   - Toggle `bonusActive` between true and false

### Solution

<details>
<summary>Click to reveal solution</summary>

```java
void keyPressed() {
    if (key == ' ') {
        // Add points based on bonus status
        if (bonusActive) {
            score += 10 * multiplier;
        } else {
            score += 10;
        }
        
        // Check if threshold crossed
        if (score >= scoreThreshold) {
            multiplier++;
            scoreThreshold += 100;
            println("Level up! Multiplier now: x" + multiplier);
        }
    }
    
    if (key == 'b' || key == 'B') {
        bonusActive = !bonusActive;  // Toggle
        println("Bonus: " + bonusActive);
    }
}
```
</details>

## AP Exam Tip: Variable Declarations

**Common FRQ Pattern:** You'll often need to declare variables within methods or classes.

**Example FRQ snippet:**
```java
// Declare a variable to track the maximum score found in an array
```

**Correct answer:**
```java
int maxScore = 0;  // or Integer.MIN_VALUE for safer initialization
```

**Common mistakes:**
- Forgetting the type: `maxScore = 0;` ❌
- Using Python syntax: `max_score = 0` ❌
- Wrong type: `double maxScore = 0;` when array is `int[]` ❌

**Pro Tip:** On the AP exam:
- Always declare the correct primitive type
- Initialize variables if you're using them in comparisons
- Use meaningful variable names (points awarded for readability)

## Practice Problems

### Problem 1: Health System (Write Code)

**Task:** Write a Java program that simulates a player health system.

**Requirements:**
- Create variables: `maxHealth` (100), `currentHealth` (100), `armor` (50)
- Implement a method `takeDamage(int damage)` that:
  - Reduces damage by armor percentage (armor/100)
  - Subtracts remaining damage from currentHealth
  - Ensures health never goes below 0
  - Prints current health after each hit
- Create a method `heal(int amount)` that:
  - Adds amount to currentHealth
  - Never exceeds maxHealth

**Test your code:**
```java
takeDamage(30);  // Should print: Health: 85 (30 - 15 armor reduction)
heal(20);        // Should print: Health: 100 (capped at max)
takeDamage(150); // Should print: Health: 0 (not negative)
```

### Problem 2: Debug Position System (Debug Code)

**Task:** The following code is supposed to keep a player within screen bounds, but it has bugs. Find and fix them.

```java
int playerX = 100;
int playerY = 100;
int screenWidth = 800;
int screenHeight = 600;

void movePlayer(int dx, int dy) {
    playerX += dx;
    playerY += dy;
    
    // Keep player in bounds
    if (playerX < 0) {
        playerX == 0;  // Bug!
    }
    if (playerX > screenWidth) {
        playerX = screenHeight;  // Bug!
    }
    if (PlayerY < 0) {  // Bug!
        playerY = 0;
    }
    if (playerY > screenHeight) {
        playerY = screenHeight;
    }
}
```

**Hint:** There are 3 bugs. Look for:
- Assignment vs comparison operators
- Variable naming consistency  
- Logic errors in boundary checks

### Problem 3: Enhanced Scoring (Add to Existing Code)

**Task:** Given this basic score system, add combo tracking.

**Starting code:**
```java
int score = 0;
int enemiesDefeated = 0;

void defeatEnemy() {
    score += 10;
    enemiesDefeated++;
}
```

**Add these features:**
- Variable `comboCount` - tracks consecutive enemy defeats
- Variable `comboTimer` - counts frames since last defeat
- Variable `maxComboTime` - set to 60 (about 1 second at 60fps)
- If enemy defeated within `maxComboTime`, increase combo
- Add bonus points: `score += 10 * comboCount`
- If timer expires, reset combo to 0
- Update timer each frame in `draw()`

## Project Task: Create a Stat Display

**Project Goal:** Build a game statistics display panel showing multiple primitive variables.

**Requirements:**

Create a Processing sketch that displays:
1. Player stats: `health`, `armor`, `level`, `experience`
2. Game stats: `score`, `timeElapsed`, `enemiesDefeated`
3. Use different colors for different stat types
4. Update `timeElapsed` every frame (use `frameCount`)
5. Add keyboard controls to modify stats for testing:
   - Arrow keys: change level (up/down)
   - 'H': decrease health by 10
   - 'E': increase experience by 25
   - 'S': increase score by 100

**Bonus Challenge:**
- Create a health bar that visually shows `currentHealth / maxHealth`
- Make text flash red when health is below 25%
- Display "LEVEL UP!" when experience reaches 100 (then reset XP)

**Example Output:**
```
╔════════════════════════════╗
║     PLAYER STATS           ║
║  Health: 85 / 100          ║
║  Armor: 50                 ║
║  Level: 5                  ║
║  XP: 45 / 100              ║
║                            ║
║     GAME STATS             ║
║  Score: 1250               ║
║  Time: 45s                 ║
║  Enemies: 23               ║
╚════════════════════════════╝
```

## Next Steps

In Lesson 2, we'll learn about **operators** and **expressions** to perform calculations with these variables (damage calculations, movement formulas, score multipliers).

Then in Unit 2, we'll see how **Objects** can bundle these variables together into meaningful game entities like `Player` and `Enemy` objects!

## Summary

**Key Concepts:**
- Java uses primitive types: `int`, `double`, `boolean`
- Variables must be declared with a type
- Game state is stored in variables
- Variables are the foundation for object instance variables

**AP CS A Coverage:**
- Topic 1.1: Primitive Types
- Topic 1.2: Variables and Assignments
- Topic 1.3: Expressions and Assignment Statements

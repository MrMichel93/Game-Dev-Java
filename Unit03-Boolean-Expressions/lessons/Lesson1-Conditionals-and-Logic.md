# Lesson 1: Conditionals and Game Logic

## Learning Objective
Master boolean expressions and conditional statements to implement game logic, collision detection, and decision-making systems.

## Boolean Expressions

A **boolean expression** evaluates to either `true` or `false`.

### Relational Operators

```java
int health = 75;
int maxHealth = 100;
int score = 500;

// Comparisons
boolean isHealthy = health > 50;           // true
boolean isFullHealth = health == maxHealth; // false
boolean isLowHealth = health < 25;         // false
boolean isGameOver = health <= 0;          // false
boolean hasScore = score != 0;             // true
```

### Logical Operators

**AND (`&&`)** - Both conditions must be true
```java
boolean canShoot = ammo > 0 && !isReloading;
boolean inBounds = x >= 0 && x < 800 && y >= 0 && y < 600;
```

**OR (`||`)** - At least one condition must be true
```java
boolean gameOver = health <= 0 || lives <= 0;
boolean canMove = onGround || inWater;
```

**NOT (`!`)** - Inverts the boolean value
```java
boolean isAlive = !isDead;
boolean cannotShoot = !canShoot;
```

### Compound Expressions

```java
// Complex game logic
boolean canAttack = isAlive && !isStunned && (ammo > 0 || hasMelee);
boolean needsHealing = health < maxHealth * 0.5 && !isHealing;
```

## if Statements

Execute code based on conditions.

### Basic if

```java
if (health < 25) {
    System.out.println("WARNING: Low health!");
}
```

### if-else

```java
if (score > highScore) {
    System.out.println("New high score!");
    highScore = score;
} else {
    System.out.println("Try again!");
}
```

### if-else-if Chains

```java
if (health <= 0) {
    System.out.println("Game Over");
} else if (health < 25) {
    System.out.println("Critical!");
} else if (health < 50) {
    System.out.println("Caution");
} else {
    System.out.println("Healthy");
}
```

## Collision Detection

### Rectangle (AABB) Collision

```java
boolean checkCollision(int x1, int y1, int w1, int h1,
                       int x2, int y2, int w2, int h2) {
    return x1 < x2 + w2 &&
           x1 + w1 > x2 &&
           y1 < y2 + h2 &&
           y1 + h1 > y2;
}
```

### Circle Collision

```java
boolean checkCircleCollision(double x1, double y1, double r1,
                              double x2, double y2, double r2) {
    double dx = x2 - x1;
    double dy = y2 - y1;
    double distance = Math.sqrt(dx * dx + dy * dy);
    return distance < r1 + r2;
}
```

### Point in Rectangle

```java
boolean pointInRect(int px, int py, int rx, int ry, int rw, int rh) {
    return px >= rx && px < rx + rw && py >= ry && py < ry + rh;
}
```

## Common Patterns

### Boundary Checking
```java
// Keep player in bounds
if (playerX < 0) playerX = 0;
if (playerX > 800) playerX = 800;
if (playerY < 0) playerY = 0;
if (playerY > 600) playerY = 600;
```

### Range Checking
```java
// Check if value is in range
boolean inRange = value >= min && value <= max;
```

### State Machine
```java
if (state.equals("MENU")) {
    displayMenu();
} else if (state.equals("PLAYING")) {
    updateGame();
} else if (state.equals("PAUSED")) {
    displayPause();
} else if (state.equals("GAME_OVER")) {
    displayGameOver();
}
```

## AP Exam Tips

### De Morgan's Laws
```java
// These are equivalent:
!(a && b) == !a || !b
!(a || b) == !a && !b

// Example:
!(isAlive && hasAmmo) == !isAlive || !hasAmmo
```

### Short-Circuit Evaluation
```java
// && stops evaluating if first condition is false
if (sprite != null && sprite.isAlive()) {
    // Safe - sprite is not null
}

// || stops evaluating if first condition is true
if (health <= 0 || lives <= 0) {
    gameOver = true;
}
```

### Common Mistakes
```java
// WRONG: Assignment instead of comparison
if (health = 0) { }  // Compilation error

// WRONG: Using == for String comparison
if (name == "Player") { }  // Use .equals()

// CORRECT:
if (name.equals("Player")) { }
```

## Summary

**Key Concepts:**
- Boolean expressions evaluate to true/false
- Logical operators: && (and), || (or), ! (not)
- if-else statements control program flow
- Collision detection uses compound boolean expressions
- Short-circuit evaluation can prevent errors

**AP CS A Coverage:**
- Topic 3.1-3.6: Boolean expressions and conditionals
- Common FRQ patterns: Collision detection, boundary checking, state validation

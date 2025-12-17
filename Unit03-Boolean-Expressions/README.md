# Unit 3: Boolean Expressions and if Statements - Game Logic

## Unit Overview

Learn to add decision-making to your games using boolean expressions and conditional statements. Implement collision detection, win/lose conditions, and AI behaviors.

## AP CS A Alignment

- **Topic 3.1:** Boolean Expressions
- **Topic 3.2:** if Statements and Control Flow
- **Topic 3.3:** if-else Statements
- **Topic 3.4:** else if Statements
- **Topic 3.5:** Compound Boolean Expressions
- **Topic 3.6:** Equivalent Boolean Expressions
- **Topic 3.7:** Comparing Objects

## Learning Objectives

1. Write and evaluate boolean expressions
2. Use if, if-else, and else-if statements
3. Apply logical operators (&&, ||, !)
4. Implement collision detection algorithms
5. Create game state conditions (win/lose/pause)
6. Compare objects using equals() method

## Key Concepts

### Boolean Expressions
```java
boolean isColliding = (playerX < enemyX + 50) && (playerX + 50 > enemyX);
boolean gameOver = (health <= 0) || (time >= 300);
boolean canShoot = !isReloading && (ammo > 0);
```

### Conditional Statements
```java
if (health < 25) {
    displayWarning();
} else if (health < 50) {
    displayCaution();
} else {
    displayNormal();
}
```

### Game Applications
- **Collision Detection:** AABB, circle, point-in-rectangle
- **Win/Lose Conditions:** Check game state
- **Power-up Effects:** Conditional bonuses
- **AI Decision Making:** Enemy behavior based on conditions

## Coming Soon

Complete lessons and materials are in development!

## Prerequisites

- Completed Units 1-2
- Understanding of boolean type and relational operators

## Next Unit

Proceed to [Unit 4: Iteration](../Unit04-Iteration/README.md) to learn loops for game updates.

# Unit 2: Using Objects - Introducing Game Entities

## Unit Overview

This unit teaches you how to use pre-existing classes and create objects. You'll learn about object references, method calls, and the String class while working with game sprites and entities.

## AP CS A Alignment

- **Topic 2.1:** Objects - Instances of Classes
- **Topic 2.2:** Creating and Storing Objects (Instantiation)
- **Topic 2.3:** Calling a Void Method
- **Topic 2.4:** Calling a Void Method with Parameters
- **Topic 2.5:** Calling a Non-void Method
- **Topic 2.6:** String Objects
- **Topic 2.7:** String Methods
- **Topic 2.8:** Wrapper Classes (Integer, Double)
- **Topic 2.9:** Using the Math Class

## Learning Objectives

By the end of this unit, you will be able to:
1. Instantiate objects using the `new` keyword
2. Call methods on objects (void and non-void methods)
3. Understand object references vs primitive values
4. Use String methods for text manipulation in games
5. Apply Math class methods for game calculations
6. Work with wrapper classes (Integer, Double)

## Key Concepts

### Object Instantiation
```java
// Creating objects
Player hero = new Player("Hero", 100, 100);
Enemy goblin = new Enemy("Goblin", 500, 200);
String message = new String("Game Over!");
```

### Method Calls
```java
// Void methods (perform actions)
hero.move(10, 0);
enemy.takeDamage(25);

// Non-void methods (return values)
int health = hero.getHealth();
boolean alive = enemy.isAlive();
String name = hero.getName();
```

### String Operations
```java
String title = "GAME";
String full = title + " OVER";  // Concatenation
int len = full.length();        // 9
String sub = full.substring(0, 4);  // "GAME"
boolean equal = title.equals("GAME");  // true
```

### Math Class
```java
// Random numbers for games
int randomX = (int)(Math.random() * 800);
double angle = Math.toRadians(45);
double distance = Math.sqrt(dx*dx + dy*dy);
int rounded = (int)Math.round(value);
```

## Game Applications

- **Sprite Objects:** Creating and managing game entities
- **Position Systems:** Using Point2D or custom position objects
- **Random Generation:** Math.random() for procedural content
- **Text Display:** String manipulation for game messages
- **Coordinate Math:** Distance, angles, trigonometry

## AP Exam Connection

### Common FRQ Patterns
- Creating objects and calling methods
- String manipulation and comparison
- Using Math class for calculations
- Understanding object references vs values
- null references and NullPointerException

## Unit Contents

### Lessons
- [Lesson 1: Objects and Methods](lessons/Lesson1-Objects-and-Methods.md)
  - Object instantiation and the new keyword
  - Calling void and non-void methods
  - String class and methods
  - Math class for game calculations
  - Object references vs primitives

### Practice Problems
1. [Name Formatter](practice-problems/Problem1_NameFormatter.java) - String manipulation with title case
2. [Item Spawner](practice-problems/Problem2_ItemSpawner.java) - Random positioning with Math class
3. [String Comparison Debug](practice-problems/Problem3_StringComparison.java) - Fix String comparison bugs

### Code Examples
- [SpriteManager.java](code-examples/SpriteManager.java) - Complete example of object usage

### Projects
- [Interactive Sprite System](projects/SpriteSystem.md) - Build a sprite management system

## Prerequisites

- Completed Unit 1: Primitive Types
- Understanding of variables and basic operations

## Next Unit

After completing Unit 2, proceed to [Unit 3: Boolean Expressions and if Statements](../Unit03-Boolean-Expressions/README.md) to add decision-making logic to your games.

# Lesson 1: Objects and Methods

## Learning Objective
Understand how to create and use objects, call methods, and work with String and Math classes in the context of game development.

## Introduction

In Unit 1, we worked with **primitive types** (int, double, boolean) - simple values. Now we'll work with **objects** - complex data structures that bundle data and behavior together.

### Python vs Java: Objects

**Python:**
```python
# Python has objects too!
sprite = Sprite("Player", 100, 100)
sprite.move(10, 5)
name = sprite.name
```

**Java:**
```java
// Java requires explicit types
Sprite sprite = new Sprite("Player", 100, 100);
sprite.move(10, 5);
String name = sprite.getName();
```

**Key Differences:**
- Java uses `new` keyword to create objects
- Java typically uses getter methods instead of direct field access
- Java requires type declaration for object variables

## What is an Object?

An **object** is an instance of a **class**. Think of a class as a blueprint, and an object as a specific thing built from that blueprint.

**Game Analogy:**
- **Class:** "Enemy" blueprint (what all enemies have)
- **Objects:** Specific enemies: goblin1, goblin2, dragon

```java
// Creating objects (instantiation)
Enemy goblin1 = new Enemy("Goblin", 50);
Enemy goblin2 = new Enemy("Goblin", 50);
Enemy dragon = new Enemy("Dragon", 200);

// Each is a separate object with its own data
```

## Object Instantiation

**Syntax:** `ClassName variableName = new ClassName(arguments);`

```java
// Creating a String object
String message = new String("Hello");
String message2 = "Hello";  // Shortcut for String

// Creating game objects
Player hero = new Player("Hero", 100, 100);
Enemy boss = new Enemy("Boss", 500, 300, 500);
```

**Parts:**
1. **Type declaration:** `Player` (what kind of object)
2. **Variable name:** `hero` (name to refer to it)
3. **new keyword:** Creates the object
4. **Constructor call:** `Player(...)` (initializes the object)

## Calling Methods

Objects have **methods** - actions they can perform or information they can provide.

### Void Methods (Perform Actions)

```java
Player hero = new Player("Hero", 100, 100);

// Call methods that DO something
hero.move(10, 0);      // Move right
hero.takeDamage(25);   // Take damage
hero.heal(50);         // Heal
hero.display();        // Show on screen
```

**Syntax:** `objectName.methodName(arguments);`

### Non-Void Methods (Return Values)

```java
// Call methods that RETURN information
int health = hero.getHealth();
String name = hero.getName();
boolean alive = hero.isAlive();
double x = hero.getX();

// Use the returned value
System.out.println("Player: " + name);
System.out.println("Health: " + health);
```

**You must store or use the return value:**
```java
// Good - storing return value
int health = hero.getHealth();

// Good - using return value directly
System.out.println("Health: " + hero.getHealth());

// Wasteful - calling but ignoring return value
hero.getHealth();  // Why call this if you don't use it?
```

## String Objects

Strings are objects in Java, with many useful methods.

### Common String Methods

```java
String title = "Game Over";

// Getting information
int length = title.length();           // 9
char first = title.charAt(0);          // 'G'
boolean empty = title.isEmpty();       // false

// Extracting parts
String sub = title.substring(0, 4);    // "Game"
String sub2 = title.substring(5);      // "Over"

// Searching
int index = title.indexOf("Over");     // 5
boolean contains = title.contains("Game");  // true
boolean starts = title.startsWith("Game");  // true
boolean ends = title.endsWith("Over");      // true

// Transforming
String upper = title.toUpperCase();    // "GAME OVER"
String lower = title.toLowerCase();    // "game over"
String trimmed = "  hi  ".trim();      // "hi"

// Comparing
boolean same = title.equals("Game Over");      // true
boolean sameIgnoreCase = title.equalsIgnoreCase("GAME OVER");  // true
```

### String Concatenation

```java
// Using + operator
String first = "Score: ";
String second = "1000";
String result = first + second;  // "Score: 1000"

// Concatenating with numbers
int score = 1000;
String message = "Score: " + score;  // "Score: 1000"

// Multiple concatenations
String full = "Player: " + name + ", Score: " + score;
```

### Important: String Comparison

**⚠️ NEVER use == to compare Strings:**

```java
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

// WRONG - compares memory addresses
if (s1 == s2) { }  // May be true or false - unreliable!

// CORRECT - compares actual content
if (s1.equals(s2)) { }  // Always correctly compares content
```

## Math Class

The `Math` class provides mathematical functions useful for games.

### Random Numbers

```java
// Random double from 0.0 to 1.0 (exclusive)
double rand = Math.random();

// Random int from 0 to 9
int randInt = (int)(Math.random() * 10);

// Random int from min to max (inclusive)
int min = 50;
int max = 100;
int value = (int)(Math.random() * (max - min + 1)) + min;

// Random spawn position
int x = (int)(Math.random() * 800);  // 0 to 799
int y = (int)(Math.random() * 600);  // 0 to 599
```

### Common Math Methods

```java
// Absolute value
int abs = Math.abs(-10);  // 10

// Power
double squared = Math.pow(5, 2);  // 25.0

// Square root (for distance)
double distance = Math.sqrt(dx*dx + dy*dy);

// Rounding
double value = 3.7;
long rounded = Math.round(value);  // 4
double ceiling = Math.ceil(value);  // 4.0
double floor = Math.floor(value);   // 3.0

// Min/Max
int min = Math.min(10, 20);  // 10
int max = Math.max(10, 20);  // 20

// Trigonometry (for angles)
double radians = Math.toRadians(45);
double degrees = Math.toDegrees(Math.PI);
double sine = Math.sin(radians);
double cosine = Math.cos(radians);
```

### Distance Calculation

```java
// Distance between two points
double x1 = 100, y1 = 100;
double x2 = 400, y2 = 300;

double dx = x2 - x1;
double dy = y2 - y1;
double distance = Math.sqrt(dx*dx + dy*dy);

System.out.println("Distance: " + distance);  // ~360.56
```

## Object References

**Important concept:** Object variables store **references** (memory addresses), not the actual object.

```java
// Create first sprite
Sprite s1 = new Sprite("Hero", 100, 100);

// s2 references the SAME object as s1
Sprite s2 = s1;

// s3 is a NEW object (different memory)
Sprite s3 = new Sprite("Hero", 100, 100);

// Moving s2 also moves s1 (same object!)
s2.move(50, 0);
System.out.println(s1.getX());  // 150 (changed!)

// Moving s3 doesn't affect s1
s3.move(50, 0);
System.out.println(s1.getX());  // Still 150

// Comparing references
System.out.println(s1 == s2);  // true (same object)
System.out.println(s1 == s3);  // false (different objects)
```

## Null References

A reference variable can be **null** (no object).

```java
Sprite sprite = null;  // No object yet

// This would cause NullPointerException!
// sprite.move(10, 0);  // ERROR!

// Check for null first
if (sprite != null) {
    sprite.move(10, 0);
} else {
    System.out.println("No sprite to move!");
}
```

## Practice Problems

### Problem 1: String Manipulation (Write Code)

**Task:** Write a program that formats player names for display.

**Requirements:**
- Read a player name (e.g., "john smith")
- Convert to title case (e.g., "John Smith")
- Display formatted name
- Show name length and if it contains spaces

**Hint:** Use `substring()`, `toUpperCase()`, `toLowerCase()`, `indexOf()`, `length()`, `contains()`

### Problem 2: Random Item Spawner (Write Code)

**Task:** Create a random item spawner for a game.

**Requirements:**
- Generate 5 random spawn positions (x, y) within 800x600 screen
- For each position, randomly choose an item type: "COIN", "HEALTH", "WEAPON"
- Display spawn information for each item
- Calculate total distance from origin (0, 0) to each spawn point

### Problem 3: Debug String Comparisons (Debug Code)

**Task:** Find and fix bugs in this code:

```java
public class GameMenu {
    public static void processCommand(String command) {
        if (command == "start") {  // Bug!
            System.out.println("Starting game...");
        }
        
        if (command.substring(0, 4) == "quit") {  // Bug!
            System.out.println("Quitting...");
        }
        
        String upper = command.toUpperCase();
        if (upper == "HELP") {  // Bug!
            System.out.println("Help menu...");
        }
    }
    
    public static void main(String[] args) {
        processCommand("start");
        processCommand("quit");
        processCommand("help");
    }
}
```

**Hint:** Review String comparison rules!

## AP Exam Tips

### String Methods on FRQs

**Common task:** Extract or manipulate strings

```java
// Given: "Player123"
// Extract: "Player" and "123"

String full = "Player123";
int index = 0;

// Find where digits start
while (index < full.length() && 
       !Character.isDigit(full.charAt(index))) {
    index++;
}

String name = full.substring(0, index);  // "Player"
String number = full.substring(index);   // "123"
```

### Math Class on Multiple Choice

**Watch out for:**
- `Math.random()` returns double from 0.0 (inclusive) to 1.0 (exclusive)
- `Math.round()` returns long, not int
- Casting to int truncates (doesn't round)

```java
// Q: What range of values?
int x = (int)(Math.random() * 10);
// Answer: 0 to 9 (inclusive)

// Q: What range?
int y = (int)(Math.random() * 10) + 1;
// Answer: 1 to 10 (inclusive)
```

## Summary

**Key Concepts:**
- Objects are instances of classes created with `new`
- Call methods with dot notation: `object.method()`
- Void methods perform actions, non-void methods return values
- String methods: `length()`, `substring()`, `equals()`, etc.
- Math class: `random()`, `sqrt()`, `pow()`, `round()`, etc.
- Object variables store references, not actual objects
- Use `.equals()` for String comparison, never `==`

**AP CS A Coverage:**
- Topic 2.1-2.5: Objects and methods
- Topic 2.6-2.7: String class
- Topic 2.9: Math class

## Next Steps

In the practice problems, you'll apply these concepts to create game systems using objects, String methods, and Math calculations.

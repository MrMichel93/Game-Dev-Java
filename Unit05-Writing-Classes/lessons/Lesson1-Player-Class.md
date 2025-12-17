# Lesson 1: Writing the Player Class

## Learning Objective
Design and implement a complete `Player` class demonstrating encapsulation, constructors, instance variables, and methods to represent a game character.

## Introduction

So far, we've been using **loose variables** to track player state:

```java
int playerX = 100;
int playerY = 100;
int playerHealth = 100;
String playerName = "Hero";
```

This **procedural approach** has problems:
1. Variables are scattered and unorganized
2. No connection between related data
3. Hard to create multiple players
4. No way to bundle data with behaviors

**Solution:** Create a `Player` **class** that bundles data and behavior together!

### Python vs Java: Classes

**Python:**
```python
class Player:
    def __init__(self, name, x, y):
        self.name = name
        self.x = x
        self.y = y
        self.health = 100
    
    def move(self, dx, dy):
        self.x += dx
        self.y += dy
    
    def take_damage(self, damage):
        self.health -= damage

# Create a player
hero = Player("Hero", 100, 100)
hero.move(10, 0)
```

**Java:**
```java
public class Player {
    // Instance variables (fields)
    private String name;
    private int x;
    private int y;
    private int health;
    
    // Constructor
    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.health = 100;
    }
    
    // Methods
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    public void takeDamage(int damage) {
        health -= damage;
    }
}

// Create a player
Player hero = new Player("Hero", 100, 100);
hero.move(10, 0);
```

**Key Differences:**
- Java uses `private` and `public` keywords for encapsulation
- Java requires explicit constructor definition
- Java uses `this` to refer to instance variables (optional but clear)
- Java requires `new` keyword to create objects
- Java uses camelCase for methods (not snake_case)

## Class Design: The Player Class

Let's design a complete Player class for a game.

### Step 1: Identify Instance Variables (State)

What data does a Player need?

```java
public class Player {
    // Position
    private int x;
    private int y;
    
    // Attributes
    private String name;
    private int health;
    private int maxHealth;
    private int speed;
    
    // Status
    private boolean isAlive;
    private int score;
}
```

**Design Decision:** All instance variables are `private`!

### Step 2: Create Constructor(s)

A **constructor** initializes a new object:

```java
public class Player {
    // ... instance variables ...
    
    // Constructor
    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.health = 100;
        this.maxHealth = 100;
        this.speed = 5;
        this.isAlive = true;
        this.score = 0;
    }
}
```

**Key Points:**
- Constructor has **same name as class**
- Constructor has **no return type** (not even `void`)
- Use `this.` to distinguish instance variables from parameters
- Constructor runs when you use `new Player(...)`

### Step 3: Add Methods (Behavior)

Methods operate on the object's data:

```java
public class Player {
    // ... instance variables and constructor ...
    
    // Movement
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    // Combat
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            isAlive = false;
        }
    }
    
    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }
    
    // Scoring
    public void addScore(int points) {
        score += points;
    }
    
    // Accessors (getters)
    public int getX() { return x; }
    public int getY() { return y; }
    public int getHealth() { return health; }
    public String getName() { return name; }
    public boolean isAlive() { return isAlive; }
    public int getScore() { return score; }
}
```

## OOP Principle: Encapsulation

**Encapsulation** means hiding internal data and providing controlled access.

### The Problem Without Encapsulation

```java
// BAD: Direct access to variables
public class BadPlayer {
    public int health;  // Anyone can modify this!
}

BadPlayer p = new BadPlayer();
p.health = -50;  // Oops! Negative health!
p.health = 999999;  // Oops! Invalid value!
```

### The Solution: Private Variables + Public Methods

```java
// GOOD: Controlled access
public class GoodPlayer {
    private int health;  // Private: only this class can access
    private int maxHealth;
    
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;  // Enforce constraint
        }
    }
    
    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;  // Enforce constraint
        }
    }
    
    public int getHealth() {
        return health;  // Read-only access
    }
}

GoodPlayer p = new GoodPlayer();
// p.health = -50;  // Compile error! health is private
p.takeDamage(10);  // OK! Using controlled method
```

**Benefits:**
1. **Data Protection:** Can't set invalid values
2. **Validation:** Methods can check constraints
3. **Flexibility:** Can change internal implementation without breaking other code
4. **Maintainability:** Clear interface for using the class

### Access Modifiers

| Modifier | Accessible From |
|----------|----------------|
| `private` | Only within the same class |
| `public` | Anywhere |
| `protected` | Same class, subclasses, same package |
| (default) | Same package only |

**Best Practice:**
- Instance variables: `private`
- Methods: `public` (if meant to be used externally)
- Constructors: `public` (usually)

## Coding Lab: Complete Player Class

**Goal:** Implement a full-featured Player class for a simple game.

### Requirements

Create a `Player` class with:

**Instance Variables:**
- `name` (String)
- `x`, `y` (int) - position
- `health`, `maxHealth` (int)
- `attackPower` (int)
- `isAlive` (boolean)

**Constructor:**
- `Player(String name, int x, int y, int maxHealth, int attackPower)`
- Initialize all variables appropriately

**Methods:**
- `move(int dx, int dy)` - change position
- `moveTo(int newX, int newY)` - move to specific position
- `takeDamage(int damage)` - reduce health, check if dead
- `heal(int amount)` - increase health, cap at max
- `attack(Player other)` - deal attackPower damage to other player
- `isAlive()` - return if player is alive
- `getHealth()` - return current health
- `getX()`, `getY()` - return position
- `getName()` - return name
- `toString()` - return string representation

### Starter Code

```java
public class Player {
    // TODO: Declare instance variables (all private)
    
    // TODO: Constructor
    public Player(String name, int x, int y, int maxHealth, int attackPower) {
        // Initialize all instance variables
    }
    
    // TODO: Implement all methods
    
    public static void main(String[] args) {
        // Test your Player class
        Player hero = new Player("Hero", 0, 0, 100, 20);
        Player enemy = new Player("Goblin", 100, 100, 50, 15);
        
        System.out.println(hero);
        System.out.println(enemy);
        System.out.println();
        
        System.out.println(hero.getName() + " attacks " + enemy.getName());
        hero.attack(enemy);
        System.out.println(enemy);
        System.out.println();
        
        System.out.println(enemy.getName() + " attacks " + hero.getName());
        enemy.attack(hero);
        System.out.println(hero);
    }
}
```

### Expected Output

```
Player: Hero at (0, 0) - HP: 100/100 [20 ATK]
Player: Goblin at (100, 100) - HP: 50/50 [15 ATK]

Hero attacks Goblin
Player: Goblin at (100, 100) - HP: 30/50 [15 ATK]

Goblin attacks Hero
Player: Hero at (0, 0) - HP: 85/100 [20 ATK]
```

## AP Exam Tip: Class Design

**Common FRQ Pattern:** You'll be asked to write a complete class.

**Typical Question Structure:**
1. "Write the constructor for class `X`"
2. "Write method `Y` that does Z"
3. Sometimes: "Explain why instance variable should be private"

**Example FRQ Snippet:**
```
Write the Player class. The Player class contains:
- Instance variables for name (String), health (int), and maxHealth (int)
- A constructor that takes name and maxHealth as parameters
- A method takeDamage that reduces health and returns true if still alive

Write the complete Player class below.
```

**Scoring Tips:**
1. **Declare all instance variables as private** (1 point)
2. **Constructor signature correct** (1 point)
3. **Constructor initializes variables** (1 point)
4. **Method signature correct** (1 point)
5. **Method implementation correct** (2-3 points)
6. **Proper use of `this` keyword** (good practice, may earn style points)

**Common Mistakes to Avoid:**
❌ Forgetting `private` keyword
❌ Misspelling constructor name (must match class name exactly)
❌ Adding return type to constructor
❌ Not using `this.` when parameter names match instance variables
❌ Making instance variables `public`

## Practice Problems

### Problem 1: Enemy Class (Write Complete Class)

**Task:** Write an `Enemy` class similar to Player but with different attributes.

**Requirements:**
- Instance variables: `type` (String), `x`, `y`, `health`, `damage`, `pointValue`
- Constructor: initialize all variables
- Method `moveTowards(int targetX, int targetY)`: move 1 step closer to target
- Method `isDefeated()`: return true if health <= 0
- Method `getPointValue()`: return points awarded when defeated
- All instance variables should be private with appropriate getters

### Problem 2: Debug Item Class (Fix Bugs)

**Task:** The following Item class has several bugs. Find and fix them.

```java
public class Item {
    public String name;
    private int value;
    private boolean isCollected;
    
    public void Item(String name, int value) {
        name = name;
        value = value;
        isCollected = false;
    }
    
    public collect() {
        isCollected = true;
        System.out.println("Collected " + name);
    }
    
    public int getValue() {
        return this.value;
    }
}
```

**Hints:** 
- 4 bugs total
- Check constructor, method signatures, variable assignments

### Problem 3: Extend PowerUp Class (Add to Existing)

**Task:** Given this basic PowerUp class, add new functionality.

**Starting Code:**
```java
public class PowerUp {
    private String name;
    private int duration;
    
    public PowerUp(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
}
```

**Add:**
1. Instance variable `isActive` (boolean)
2. Method `activate()`: sets isActive to true, prints message
3. Method `deactivate()`: sets isActive to false, prints message  
4. Method `update()`: decreases duration by 1, deactivates if duration <= 0
5. Getter methods for all instance variables

## Project Task: Game Character System

**Project Goal:** Create a system with multiple character classes.

Create three classes:
1. `Player` - Playable character with health, position, inventory capacity
2. `Enemy` - Hostile character with AI movement toward player
3. `NPC` - Non-player character with dialogue and quest status

Each class should:
- Have at least 5 instance variables
- Have a constructor
- Have at least 5 methods
- Use proper encapsulation (private variables, public methods)
- Include a `toString()` method

**Bonus:** Create a `Game` class with a `main` method that creates instances of all three classes and demonstrates their interactions.

## Summary

**Key Concepts:**
- Classes bundle data (instance variables) and behavior (methods)
- **Encapsulation**: private variables + public methods
- **Constructors**: initialize new objects
- **Instance variables**: define object state
- **Methods**: define object behavior
- Use `this` to refer to instance variables

**AP CS A Coverage:**
- Topic 5.1: Anatomy of a Class
- Topic 5.2: Constructors
- Topic 5.4: Accessor Methods
- Topic 5.5: Mutator Methods
- Topic 5.7: Scope and Access

**Next Lesson:** We'll learn about method overloading, static vs instance members, and the `this` keyword in depth!

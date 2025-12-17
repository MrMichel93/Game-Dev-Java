# Lesson 1: Enemy Hierarchies with Inheritance

## Learning Objective
Understand inheritance by creating an enemy class hierarchy, demonstrating superclass/subclass relationships, method overriding, and polymorphism in a game context.

## Introduction

In Unit 5, we learned to create individual classes. But games often have many similar entities:
- BasicEnemy, FastEnemy, TankEnemy, BossEnemy
- All have health, position, and attack
- But each has unique behaviors

**Without inheritance:** Duplicate code in every class!

```java
// BAD: Repeating code
class BasicEnemy {
    int x, y, health;
    void move() { ... }
    void takeDamage() { ... }
}

class FastEnemy {
    int x, y, health;  // Duplicate!
    void move() { ... }  // Duplicate!
    void takeDamage() { ... }  // Duplicate!
}
```

**With inheritance:** Share common code!

```java
// GOOD: Inheritance
class Enemy {
    int x, y, health;
    void move() { ... }
    void takeDamage() { ... }
}

class BasicEnemy extends Enemy {
    // Inherits x, y, health, move(), takeDamage()
}

class FastEnemy extends Enemy {
    // Inherits common features
    // Can override move() for faster movement
}
```

### Python vs Java: Inheritance

**Python:**
```python
class Enemy:
    def __init__(self, x, y, health):
        self.x = x
        self.y = y
        self.health = health
    
    def move(self):
        self.y += 1
    
    def take_damage(self, damage):
        self.health -= damage

class FastEnemy(Enemy):
    def __init__(self, x, y):
        super().__init__(x, y, 50)  # Less health
    
    def move(self):
        self.y += 3  # Faster!
```

**Java:**
```java
public class Enemy {
    protected int x;
    protected int y;
    protected int health;
    
    public Enemy(int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
    }
    
    public void move() {
        y += 1;
    }
    
    public void takeDamage(int damage) {
        health -= damage;
    }
}

public class FastEnemy extends Enemy {
    public FastEnemy(int x, int y) {
        super(x, y, 50);  // Call parent constructor
    }
    
    @Override
    public void move() {
        y += 3;  // Override for faster movement
    }
}
```

**Key Differences:**
- Java uses `extends` keyword
- Java uses `super()` to call parent constructor
- Java uses `@Override` annotation (optional but recommended)
- Java uses `protected` for subclass access
- Java subclass constructor must call `super()` (explicit or implicit)

## Class Design: Enemy Hierarchy

Let's design a game enemy hierarchy:

```
         Enemy (superclass/base class)
           |
      ┌────┴────┬─────────┬──────────┐
      |         |         |          |
  BasicEnemy FastEnemy TankEnemy BossEnemy
  (subclasses/derived classes)
```

### The Superclass: Enemy

```java
public class Enemy {
    // Protected: accessible to subclasses
    protected int x;
    protected int y;
    protected int health;
    protected int maxHealth;
    protected int damage;
    protected int speed;
    
    // Constructor
    public Enemy(int x, int y, int health, int damage, int speed) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
        this.speed = speed;
    }
    
    // Methods that all enemies share
    public void move() {
        y += speed;  // Default: move down
    }
    
    public void takeDamage(int damage) {
        health -= damage;
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
    public int getHealth() { return health; }
    public int getDamage() { return damage; }
}
```

### Subclass 1: BasicEnemy

```java
public class BasicEnemy extends Enemy {
    
    public BasicEnemy(int x, int y) {
        super(x, y, 100, 10, 2);  // Standard stats
    }
    
    // Inherits all methods from Enemy
    // No overrides needed - uses default behavior
}
```

### Subclass 2: FastEnemy

```java
public class FastEnemy extends Enemy {
    
    public FastEnemy(int x, int y) {
        super(x, y, 50, 5, 5);  // Less health, less damage, faster
    }
    
    @Override
    public void move() {
        y += speed;
        // Zigzag pattern!
        x += (int)(Math.random() * 10 - 5);
    }
}
```

### Subclass 3: TankEnemy

```java
public class TankEnemy extends Enemy {
    private int armor;
    
    public TankEnemy(int x, int y) {
        super(x, y, 300, 20, 1);  // Lots of health, slow
        this.armor = 50;
    }
    
    @Override
    public void takeDamage(int damage) {
        // Reduce damage by armor
        int actualDamage = damage - armor;
        if (actualDamage < 0) actualDamage = 0;
        health -= actualDamage;
    }
}
```

### Subclass 4: BossEnemy

```java
public class BossEnemy extends Enemy {
    private int phase;
    private int pointValue;
    
    public BossEnemy(int x, int y) {
        super(x, y, 1000, 30, 3);
        this.phase = 1;
        this.pointValue = 500;
    }
    
    @Override
    public void move() {
        // Boss moves in a pattern
        if (phase == 1) {
            x += speed;  // Move right
            if (x > 700) phase = 2;
        } else {
            x -= speed;  // Move left
            if (x < 100) phase = 1;
        }
    }
    
    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);  // Call parent version first
        
        // Phase transition
        if (health < maxHealth / 2 && phase == 1) {
            phase = 2;
            speed = 5;  // Speed up in phase 2!
            System.out.println("Boss entered phase 2!");
        }
    }
    
    public int getPointValue() {
        return pointValue;
    }
}
```

## OOP Principle: Inheritance

**Inheritance** creates an "is-a" relationship:
- A `FastEnemy` **is an** `Enemy`
- A `BossEnemy` **is an** `Enemy`

### Key Terms

| Term | Meaning |
|------|---------|
| **Superclass** | Parent class (Enemy) |
| **Subclass** | Child class (BasicEnemy, FastEnemy, etc.) |
| **extends** | Keyword to inherit from superclass |
| **super** | Reference to superclass (call constructor/methods) |
| **Override** | Subclass provides new implementation of method |
| **protected** | Access modifier: visible to subclasses |

### The `super` Keyword

`super` has two uses:

**1. Call superclass constructor:**
```java
public class FastEnemy extends Enemy {
    public FastEnemy(int x, int y) {
        super(x, y, 50, 5, 5);  // Must be first line!
    }
}
```

**2. Call superclass method:**
```java
public class BossEnemy extends Enemy {
    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);  // Call parent version
        // Then add boss-specific behavior
        checkPhaseTransition();
    }
}
```

### Method Overriding

**Override** = subclass provides different implementation

**Rules for overriding:**
1. Method signature must match exactly (name, parameters, return type)
2. Access modifier must be same or more accessible (protected → public OK)
3. Can't override `private` or `final` methods
4. Use `@Override` annotation (compiler checks you did it right)

```java
public class Enemy {
    public void move() {
        y += speed;
    }
}

public class FastEnemy extends Enemy {
    @Override  // Good practice!
    public void move() {
        y += speed;
        x += (int)(Math.random() * 10 - 5);  // Different behavior
    }
}
```

### `protected` vs `private` vs `public`

For instance variables in a superclass:

```java
public class Enemy {
    private int x;      // Subclass CANNOT access
    protected int y;    // Subclass CAN access
    public int z;       // Anyone can access (bad for encapsulation!)
}

public class FastEnemy extends Enemy {
    public void move() {
        // x += 5;       // Error! x is private in Enemy
        y += 5;          // OK! y is protected
    }
}
```

**Best Practice:**
- Use `protected` for variables subclasses need to access
- Use `private` with `protected` getters/setters for better encapsulation

## OOP Principle: Polymorphism

**Polymorphism** = "many forms" - a superclass reference can hold subclass objects!

```java
// All of these work!
Enemy e1 = new BasicEnemy(100, 0);
Enemy e2 = new FastEnemy(200, 0);
Enemy e3 = new TankEnemy(300, 0);
Enemy e4 = new BossEnemy(400, 0);

// Array of different enemy types!
Enemy[] enemies = {e1, e2, e3, e4};

// Call move() on each - each behaves differently!
for (Enemy enemy : enemies) {
    enemy.move();  // Calls appropriate version based on actual type
}
```

**Why this is powerful:**
- Store different types in same array/ArrayList
- Write code that works with any subclass
- Add new enemy types without changing existing code

## Coding Lab: Create a Projectile Hierarchy

**Goal:** Create a projectile system with inheritance.

### Base Class: Projectile

```java
public class Projectile {
    protected int x;
    protected int y;
    protected int speedX;
    protected int speedY;
    protected int damage;
    protected boolean active;
    
    public Projectile(int x, int y, int speedX, int speedY, int damage) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
        this.damage = damage;
        this.active = true;
    }
    
    public void update() {
        x += speedX;
        y += speedY;
        
        // Deactivate if off screen
        if (x < 0 || x > 800 || y < 0 || y > 600) {
            active = false;
        }
    }
    
    public boolean isActive() { return active; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getDamage() { return damage; }
    public void deactivate() { active = false; }
}
```

### Your Tasks

**1. Create `Bullet` class:**
- Extends `Projectile`
- Constructor: `Bullet(int x, int y)`
- Calls super with: x, y, 0, -10 (straight up), damage 10
- No overrides needed

**2. Create `Laser` class:**
- Extends `Projectile`
- Constructor: `Laser(int x, int y)`
- Calls super with: x, y, 0, -20 (very fast), damage 5
- Override `update()` to add trail effect (just comment for now)

**3. Create `Missile` class:**
- Extends `Projectile`
- Add instance variable: `targetX` (for homing)
- Constructor: `Missile(int x, int y, int targetX)`
- Override `update()` to home toward targetX:
  - If x < targetX, increase speedX
  - If x > targetX, decrease speedX
  - Then call `super.update()`

**4. Create `Bomb` class:**
- Extends `Projectile`
- Add instance variable: `explosionRadius`
- Constructor: `Bomb(int x, int y)`
- Override `update()` to fall with gravity:
  - Increase speedY by 1 each frame (gravity)
  - Call parent update()
- Add method: `explode()` returns radius

### Test Code

```java
public static void main(String[] args) {
    Projectile[] projectiles = {
        new Bullet(100, 500),
        new Laser(200, 500),
        new Missile(300, 500, 400),
        new Bomb(400, 500)
    };
    
    // Polymorphism in action!
    for (Projectile p : projectiles) {
        System.out.println(p.getClass().getSimpleName() + " at (" + 
                          p.getX() + ", " + p.getY() + ")");
        p.update();
        System.out.println("  After update: (" + p.getX() + ", " + p.getY() + ")");
    }
}
```

## AP Exam Tip: Inheritance Questions

**Common FRQ Patterns:**

**Pattern 1: Write a subclass**
```
Given the Animal class, write a complete Dog class that extends Animal.
Include a constructor and override the speak() method.
```

**Pattern 2: Identify output**
```
Given this code, what is printed?
(Tests understanding of method overriding and polymorphism)
```

**Pattern 3: Call super**
```
Write a method in the subclass that calls the superclass version
and then adds additional behavior.
```

**Scoring Tips:**
1. **Correct extends clause** (1 point)
2. **Call super() in constructor** (1 point)  
3. **Override signature matches** (1 point)
4. **Correct @Override usage** (style points)
5. **Proper use of super.method()** (1 point)

**Common Mistakes:**
❌ Forgetting `extends` keyword
❌ Not calling `super()` in constructor
❌ Misspelling method name when overriding
❌ Wrong method signature (different parameters)
❌ Making overridden method more restrictive (public → private)
❌ Trying to override `private` methods

## Practice Problems

### Problem 1: Weapon Hierarchy (Write Complete Classes)

**Task:** Create a weapon system with inheritance.

**Base class `Weapon`:**
- Variables: `name`, `damage`, `range`, `cooldown`
- Constructor, getters
- Method: `attack()` prints "Attacking with [name]!"

**Subclass `Sword extends Weapon`:**
- Constructor: sets name "Sword", damage 30, range 1, cooldown 1
- Override `attack()`: reduce damage if target beyond range

**Subclass `Bow extends Weapon`:**
- Constructor: sets name "Bow", damage 20, range 10, cooldown 2
- Add variable: `arrows`
- Override `attack()`: check if arrows > 0, decrease arrows

**Subclass `MagicStaff extends Weapon`:**
- Constructor: sets name "Magic Staff", damage 40, range 5, cooldown 3
- Add variable: `mana`
- Override `attack()`: check mana, use 10 mana per attack

### Problem 2: Debug Vehicle Hierarchy (Fix Bugs)

```java
public class Vehicle {
    private int speed;
    protected int x, y;
    
    public Vehicle(int speed) {
        this.speed = speed;
        x = 0;
        y = 0;
    }
    
    public void move() {
        x += speed;
    }
}

public class Car extends Vehicle {
    private int fuel;
    
    public Car() {
        fuel = 100;
    }
    
    public void move() {
        if (fuel > 0) {
            move();
            fuel--;
        }
    }
}
```

**Hints:** 3 bugs - constructor, method call, missing super

### Problem 3: Extend PowerUp Hierarchy (Add Subclasses)

**Given:**
```java
public class PowerUp {
    protected String name;
    protected int duration;
    
    public PowerUp(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    
    public void activate() {
        System.out.println(name + " activated!");
    }
    
    public void deactivate() {
        System.out.println(name + " deactivated!");
    }
}
```

**Add three subclasses:**
1. `SpeedBoost` - doubles speed for duration
2. `Shield` - blocks damage for duration
3. `DoublePoints` - multiplies score by 2 for duration

Each should override activate/deactivate with specific messages.

## Project Task: Complete RPG Enemy System

Create a full RPG enemy system with:

**Base class `Enemy`:**
- Common stats and methods
- At least 6 instance variables
- At least 5 methods

**Four subclasses:**
1. `Goblin` - Fast, weak, drops gold
2. `Orc` - Strong, medium speed, high damage
3. `Dragon` - Boss enemy with flying, fire breath
4. `Necromancer` - Summons other enemies, uses magic

**Requirements:**
- Use inheritance appropriately
- Override at least 2 methods per subclass
- Use `super` at least once per subclass
- Demonstrate polymorphism with an array of enemies
- Include a main method that creates and tests all enemies

## Summary

**Key Concepts:**
- **Inheritance** creates "is-a" relationships
- **extends** keyword creates subclass
- **super** calls superclass constructor/methods
- **Override** provides new implementation in subclass
- **Polymorphism** allows superclass reference to hold subclass objects
- **protected** allows subclass access to variables

**AP CS A Coverage:**
- Topic 9.1: Creating Superclasses and Subclasses
- Topic 9.2: Writing Constructors for Subclasses
- Topic 9.3: Overriding Methods
- Topic 9.4: super Keyword
- Topic 9.5: Creating References Using Inheritance Hierarchies
- Topic 9.6: Polymorphism

**Next Lesson:** Abstract classes, interfaces, and advanced polymorphism!

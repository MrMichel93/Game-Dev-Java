# Project: Interactive Sprite System

## Project Overview

Create an interactive sprite management system that demonstrates object instantiation, method calls, String manipulation, and Math class usage. This project combines all concepts from Unit 2 into a cohesive game-like application.

## Learning Objectives

- Create and manage multiple object instances
- Use String methods for name formatting and display
- Apply Math class for random positioning and distance calculations
- Call void and non-void methods on objects
- Understand object references and null handling

## Project Requirements

### Part 1: Sprite Class Usage (Required)

Create a simple Sprite class (or use provided one) with:
- Properties: name (String), x (double), y (double), health (int)
- Constructor: `Sprite(String name, double x, double y, int health)`
- Methods:
  - `void move(double dx, double dy)` - move sprite
  - `void takeDamage(int damage)` - reduce health
  - `double distanceTo(Sprite other)` - calculate distance to another sprite
  - `String getName()` - get sprite name
  - `int getHealth()` - get current health
  - `boolean isAlive()` - check if health > 0
  - `String getInfo()` - return formatted info string

### Part 2: Sprite Manager (Required)

Create a SpriteManager class that:
1. Maintains a collection of sprites (use separate variables for now, arrays come later)
2. Creates at least 3 different sprites with random positions
3. Displays all sprite information formatted nicely
4. Allows user commands to interact with sprites

### Part 3: User Commands (Required)

Implement command processing for:
- **"move [name] [dx] [dy]"** - Move sprite by dx, dy
- **"damage [name] [amount]"** - Damage sprite
- **"distance [name1] [name2]"** - Show distance between two sprites
- **"info [name]"** - Display sprite details
- **"list"** - List all sprites
- **"spawn [name]"** - Spawn new sprite at random position
- **"quit"** - Exit program

### Part 4: String Formatting (Required)

Use String methods to:
1. Format sprite names to title case
2. Parse user commands (extract command and arguments)
3. Generate formatted output displays
4. Validate command syntax

### Part 5: Math Operations (Required)

Use Math class for:
1. Random spawn positions (0-800 for x, 0-600 for y)
2. Distance calculations between sprites
3. Random initial health (50-100)
4. Rounding display values

## Starter Code

```java
import java.util.Scanner;

public class SpriteSystem {
    
    // Sprite instances (in later units, we'll use arrays)
    static Sprite sprite1;
    static Sprite sprite2;
    static Sprite sprite3;
    static int spriteCount = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Interactive Sprite System ===");
        System.out.println();
        
        // Initialize sprites
        initializeSprites();
        
        // Command loop
        boolean running = true;
        while (running) {
            System.out.print("> ");
            String command = scanner.nextLine();
            running = processCommand(command);
        }
        
        System.out.println("Goodbye!");
        scanner.close();
    }
    
    public static void initializeSprites() {
        // TODO: Create 3 sprites with random positions
        // Use randomPosition() helper method
        // Display confirmation
    }
    
    public static int randomPosition(int max) {
        // TODO: Return random int from 0 to max-1
        return 0;
    }
    
    public static int randomHealth() {
        // TODO: Return random int from 50 to 100
        return 0;
    }
    
    public static boolean processCommand(String command) {
        // TODO: Parse and execute command
        // Return false if "quit", true otherwise
        
        if (command.equals("quit")) {
            return false;
        }
        
        if (command.equals("list")) {
            listSprites();
            return true;
        }
        
        // TODO: Handle other commands
        // Hint: Use indexOf(" ") to find space
        // Use substring() to extract parts
        
        return true;
    }
    
    public static void listSprites() {
        // TODO: Display all sprites with formatted info
    }
    
    public static Sprite findSprite(String name) {
        // TODO: Find sprite by name
        // Compare using .equals() with toLowerCase()
        // Return null if not found
        return null;
    }
    
    public static void moveSprite(String name, double dx, double dy) {
        // TODO: Find sprite and call move method
    }
    
    public static void damageSprite(String name, int amount) {
        // TODO: Find sprite and call takeDamage
    }
    
    public static void showDistance(String name1, String name2) {
        // TODO: Find both sprites
        // Calculate and display distance
    }
    
    public static void showInfo(String name) {
        // TODO: Find sprite and display detailed info
    }
}

/**
 * Simple Sprite class
 */
class Sprite {
    private String name;
    private double x;
    private double y;
    private int health;
    
    public Sprite(String name, double x, double y, int health) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.health = health;
    }
    
    // TODO: Implement all required methods
}
```

## Sample Output

```
=== Interactive Sprite System ===

Initialized sprites:
  Hero at (245, 387) - Health: 95
  Enemy at (621, 143) - Health: 73
  Boss at (89, 492) - Health: 100

> list
Sprites:
  1. Hero - Position: (245, 387) - Health: 95 - Status: Alive
  2. Enemy - Position: (621, 143) - Health: 73 - Status: Alive
  3. Boss - Position: (89, 492) - Health: 100 - Status: Alive

> move hero 50 25
Hero moved to (295, 412)

> damage enemy 30
Enemy took 30 damage. Health: 43

> distance hero enemy
Distance between Hero and Enemy: 372 pixels

> info boss
Sprite Information:
  Name: Boss
  Position: (89, 492)
  Health: 100/100
  Status: Alive
  Type: Enemy

> spawn ally
Ally spawned at (456, 234) with 87 health

> list
Sprites:
  1. Hero - Position: (295, 412) - Health: 95 - Status: Alive
  2. Enemy - Position: (621, 143) - Health: 43 - Status: Alive
  3. Boss - Position: (89, 492) - Health: 100 - Status: Alive

> quit
Goodbye!
```

## Testing Checklist

- [ ] Creates sprites with random positions and health
- [ ] All sprite methods work correctly
- [ ] Command parsing extracts name and arguments correctly
- [ ] move command updates position
- [ ] damage command reduces health
- [ ] distance command calculates correctly
- [ ] info command displays formatted details
- [ ] list command shows all sprites
- [ ] spawn command creates new sprite (within 3 sprite limit)
- [ ] Handles invalid commands gracefully
- [ ] Uses .equals() for all String comparisons
- [ ] String methods used for formatting
- [ ] Math class used for random values and calculations

## Grading Rubric

| Category | Points | Criteria |
|----------|--------|----------|
| Sprite Class | 20 | All required methods implemented correctly |
| Object Management | 20 | Creates and manages multiple sprite instances |
| Command Processing | 25 | All commands work correctly |
| String Operations | 15 | Proper use of String methods and comparison |
| Math Operations | 10 | Random generation and distance calculations |
| Code Quality | 10 | Clean code, good naming, comments |
| **Bonus** | +10 | Additional features (health bars, colors, more commands) |

**Total: 100 points (110 with bonus)**

## Extension Ideas

Once you've completed the basic requirements:

1. **Combat System**: Add an attack command that deals random damage
2. **Boundaries**: Keep sprites within screen bounds (0-800, 0-600)
3. **Collision Detection**: Alert when sprites are within certain distance
4. **Sprite Types**: Different sprite types with different behaviors
5. **Save/Load**: Save sprite states to a file
6. **Health Bars**: Display ASCII health bars
7. **Nearest Neighbor**: Find closest sprite to a given sprite

## AP CS A Connection

This project reinforces:
- **Topic 2.1**: Objects as instances of classes
- **Topic 2.2**: Object instantiation with new
- **Topic 2.3-2.5**: Method calls (void and non-void)
- **Topic 2.6-2.7**: String objects and methods
- **Topic 2.9**: Math class
- **Topic 3.1-3.2**: Boolean expressions and conditionals (from Unit 3, used here)

## Common Pitfalls

1. **String Comparison**: Using == instead of .equals()
2. **Null References**: Not checking if sprite exists before using it
3. **Command Parsing**: Not handling spaces and case sensitivity
4. **Math.random()**: Off-by-one errors in random ranges
5. **Distance Formula**: Forgetting Math.sqrt() or squaring incorrectly

## Submission

When complete, your program should:
1. Run without errors
2. Handle all required commands correctly
3. Use proper String and Math methods
4. Format output nicely
5. Include helpful comments
6. Handle edge cases (invalid commands, null sprites)

Good luck building your sprite system!

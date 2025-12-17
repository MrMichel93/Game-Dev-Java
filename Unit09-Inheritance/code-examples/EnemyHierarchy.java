/**
 * Code Example: Enemy Hierarchy with Inheritance
 * Demonstrates inheritance, method overriding, and polymorphism
 * 
 * This example shows:
 * - Base class (Enemy) with common functionality
 * - Subclasses (BasicEnemy, FastEnemy, BossEnemy) with specialized behavior
 * - Method overriding to customize behavior
 * - Polymorphism with array of different enemy types
 * - Use of super keyword
 * - Protected access modifier
 */

// Base class: Enemy
class Enemy {
    // Protected: accessible to subclasses
    protected int x;
    protected int y;
    protected int health;
    protected int maxHealth;
    protected int damage;
    protected int speed;
    protected String type;
    
    /**
     * Constructor for Enemy
     */
    public Enemy(String type, int x, int y, int health, int damage, int speed) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
        this.speed = speed;
    }
    
    /**
     * Move enemy (default: move down)
     */
    public void move() {
        y += speed;
    }
    
    /**
     * Take damage
     */
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }
    
    /**
     * Check if enemy is alive
     */
    public boolean isAlive() {
        return health > 0;
    }
    
    /**
     * Get current position as string
     */
    public String getPosition() {
        return "(" + x + ", " + y + ")";
    }
    
    /**
     * String representation
     */
    @Override
    public String toString() {
        return type + " at " + getPosition() + 
               " - HP: " + health + "/" + maxHealth + 
               " [" + damage + " DMG, " + speed + " SPD]";
    }
}

// Subclass 1: BasicEnemy
class BasicEnemy extends Enemy {
    
    public BasicEnemy(int x, int y) {
        // Call parent constructor with standard stats
        super("Basic", x, y, 100, 10, 2);
    }
    
    // No method overrides - uses default Enemy behavior
}

// Subclass 2: FastEnemy
class FastEnemy extends Enemy {
    
    public FastEnemy(int x, int y) {
        // Lower health, lower damage, higher speed
        super("Fast", x, y, 50, 5, 5);
    }
    
    /**
     * Override move() for zigzag pattern
     */
    @Override
    public void move() {
        // Move down (call parent behavior)
        super.move();
        
        // Add horizontal zigzag
        x += (int)(Math.random() * 10 - 5);
    }
}

// Subclass 3: TankEnemy
class TankEnemy extends Enemy {
    private int armor;
    
    public TankEnemy(int x, int y) {
        // High health, high damage, low speed
        super("Tank", x, y, 300, 20, 1);
        this.armor = 50;
    }
    
    /**
     * Override takeDamage() to apply armor
     */
    @Override
    public void takeDamage(int damage) {
        // Calculate damage reduction
        int reducedDamage = damage - armor;
        if (reducedDamage < 0) reducedDamage = 0;
        
        // Apply damage
        health -= reducedDamage;
        if (health < 0) health = 0;
        
        System.out.println("  " + type + " armor blocked " + 
                          (damage - reducedDamage) + " damage!");
    }
}

// Subclass 4: BossEnemy
class BossEnemy extends Enemy {
    private int phase;
    private int pointValue;
    
    public BossEnemy(int x, int y) {
        // Very high stats
        super("BOSS", x, y, 1000, 30, 3);
        this.phase = 1;
        this.pointValue = 500;
    }
    
    /**
     * Override move() for boss movement pattern
     */
    @Override
    public void move() {
        // Boss moves horizontally based on phase
        if (phase == 1) {
            x += speed;
            if (x > 700) phase = 2;
        } else {
            x -= speed;
            if (x < 100) phase = 1;
        }
    }
    
    /**
     * Override takeDamage() for phase transitions
     */
    @Override
    public void takeDamage(int damage) {
        // Call parent version
        super.takeDamage(damage);
        
        // Check for phase 2 transition
        if (health < maxHealth / 2 && phase == 1) {
            phase = 2;
            speed = 5;  // Speed up!
            System.out.println("  >>> " + type + " ENTERS PHASE 2! <<<");
        }
    }
    
    public int getPointValue() {
        return pointValue;
    }
    
    @Override
    public String toString() {
        return super.toString() + " [PHASE " + phase + "]";
    }
}

// Main class to demonstrate
public class EnemyHierarchy {
    
    public static void main(String[] args) {
        System.out.println("=== Enemy Hierarchy Example ===\n");
        
        // Polymorphism: Array of Enemy references holding different types
        Enemy[] enemies = {
            new BasicEnemy(100, 0),
            new FastEnemy(200, 0),
            new TankEnemy(300, 0),
            new BossEnemy(400, 0)
        };
        
        System.out.println("Initial enemy positions:");
        for (Enemy e : enemies) {
            System.out.println("  " + e);
        }
        System.out.println();
        
        // Move all enemies - each uses its own move() implementation
        System.out.println("After moving:");
        for (Enemy e : enemies) {
            e.move();
            System.out.println("  " + e);
        }
        System.out.println();
        
        // Attack all enemies with same damage
        System.out.println("Player attacks all enemies for 60 damage:");
        for (Enemy e : enemies) {
            System.out.println("Attacking " + e.type + "...");
            e.takeDamage(60);
            System.out.println("  " + e);
        }
        System.out.println();
        
        // Attack again
        System.out.println("Player attacks again for 60 damage:");
        for (Enemy e : enemies) {
            if (e.isAlive()) {
                System.out.println("Attacking " + e.type + "...");
                e.takeDamage(60);
                System.out.println("  " + e);
            } else {
                System.out.println(e.type + " is already defeated!");
            }
        }
        System.out.println();
        
        // Count survivors
        int alive = 0;
        for (Enemy e : enemies) {
            if (e.isAlive()) alive++;
        }
        System.out.println("Enemies remaining: " + alive + "/" + enemies.length);
        
        // Boss-specific behavior
        System.out.println("\nBoss special method:");
        BossEnemy boss = (BossEnemy)enemies[3];  // Cast to access subclass method
        System.out.println("Boss point value: " + boss.getPointValue());
    }
}

/**
 * KEY CONCEPTS DEMONSTRATED:
 * 
 * 1. Inheritance Hierarchy:
 *    Enemy (superclass)
 *      ├── BasicEnemy
 *      ├── FastEnemy
 *      ├── TankEnemy
 *      └── BossEnemy
 * 
 * 2. Method Overriding:
 *    - FastEnemy overrides move() for zigzag
 *    - TankEnemy overrides takeDamage() for armor
 *    - BossEnemy overrides both move() and takeDamage()
 * 
 * 3. Using super:
 *    - super(...) calls parent constructor
 *    - super.method() calls parent method implementation
 * 
 * 4. Polymorphism:
 *    - Enemy[] array holds different subclass objects
 *    - Each object uses its own version of move()
 *    - Same method call, different behavior
 * 
 * 5. Protected Access:
 *    - Subclasses can access protected variables
 *    - Better than public (encapsulation)
 *    - Less restrictive than private
 * 
 * 6. Adding Subclass-Specific Features:
 *    - TankEnemy adds armor variable
 *    - BossEnemy adds phase and pointValue
 *    - Can access with casting: (BossEnemy)enemy
 * 
 * AP EXAM RELEVANCE:
 * This demonstrates common FRQ patterns:
 * - Write a subclass that extends a given superclass
 * - Override a method and call super version
 * - Use polymorphism with arrays
 * - Identify which method executes (polymorphism)
 * - Design class hierarchy for related concepts
 * 
 * COMPILE AND RUN:
 *   javac EnemyHierarchy.java
 *   java EnemyHierarchy
 */

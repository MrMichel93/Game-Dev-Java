/**
 * Code Example: Complete Player Class
 * Demonstrates encapsulation, constructors, and methods
 * 
 * This Player class shows:
 * - Private instance variables (encapsulation)
 * - Constructor with parameters
 * - Accessor methods (getters)
 * - Mutator methods (setters with validation)
 * - Behavior methods (actions the player can take)
 * - toString() for string representation
 */

public class Player {
    // Instance variables (private for encapsulation)
    private String name;
    private int x;
    private int y;
    private int health;
    private int maxHealth;
    private int attackPower;
    private boolean isAlive;
    
    /**
     * Constructor: Initialize a new Player
     * @param name Player's name
     * @param x Starting x position
     * @param y Starting y position
     * @param maxHealth Maximum health points
     * @param attackPower Damage dealt per attack
     */
    public Player(String name, int x, int y, int maxHealth, int attackPower) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.maxHealth = maxHealth;
        this.health = maxHealth;  // Start at full health
        this.attackPower = attackPower;
        this.isAlive = true;
    }
    
    // Movement methods
    
    /**
     * Move player by relative amount
     * @param dx Change in x position
     * @param dy Change in y position
     */
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    /**
     * Move player to specific position
     * @param newX New x position
     * @param newY New y position
     */
    public void moveTo(int newX, int newY) {
        x = newX;
        y = newY;
    }
    
    // Combat methods
    
    /**
     * Take damage and check if still alive
     * @param damage Amount of damage taken
     */
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            isAlive = false;
            System.out.println(name + " has been defeated!");
        }
    }
    
    /**
     * Heal player, capped at maxHealth
     * @param amount Amount to heal
     */
    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
        System.out.println(name + " healed to " + health + " HP");
    }
    
    /**
     * Attack another player
     * @param other The player being attacked
     */
    public void attack(Player other) {
        if (isAlive && other.isAlive()) {
            System.out.println(name + " attacks " + other.getName() + 
                             " for " + attackPower + " damage!");
            other.takeDamage(attackPower);
        }
    }
    
    // Accessor methods (getters)
    
    public String getName() {
        return name;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getMaxHealth() {
        return maxHealth;
    }
    
    public int getAttackPower() {
        return attackPower;
    }
    
    public boolean isAlive() {
        return isAlive;
    }
    
    // Mutator methods (setters with validation)
    
    /**
     * Set attack power (must be positive)
     * @param power New attack power
     */
    public void setAttackPower(int power) {
        if (power > 0) {
            attackPower = power;
        }
    }
    
    /**
     * Set position
     * @param x New x position
     * @param y New y position
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * String representation of player
     * @return Formatted string with player info
     */
    @Override
    public String toString() {
        return String.format("Player: %s at (%d, %d) - HP: %d/%d [%d ATK]%s",
            name, x, y, health, maxHealth, attackPower,
            isAlive ? "" : " [DEFEATED]");
    }
    
    /**
     * Main method to test the Player class
     */
    public static void main(String[] args) {
        System.out.println("=== Player Class Example ===\n");
        
        // Create two players
        Player hero = new Player("Hero", 0, 0, 100, 20);
        Player goblin = new Player("Goblin", 100, 100, 50, 15);
        
        System.out.println("Initial state:");
        System.out.println(hero);
        System.out.println(goblin);
        System.out.println();
        
        // Hero moves
        System.out.println("Hero moves closer...");
        hero.moveTo(95, 100);
        System.out.println(hero);
        System.out.println();
        
        // Combat!
        System.out.println("Combat begins!");
        hero.attack(goblin);
        System.out.println(goblin);
        System.out.println();
        
        goblin.attack(hero);
        System.out.println(hero);
        System.out.println();
        
        hero.attack(goblin);
        System.out.println(goblin);
        System.out.println();
        
        hero.attack(goblin);
        System.out.println(goblin);
        System.out.println();
        
        // Try attacking defeated enemy
        System.out.println("Trying to attack defeated enemy...");
        hero.attack(goblin);
        System.out.println();
        
        // Heal
        System.out.println("Hero heals...");
        hero.heal(10);
        System.out.println(hero);
    }
}

/**
 * KEY CONCEPTS DEMONSTRATED:
 * 
 * 1. Encapsulation:
 *    - All instance variables are private
 *    - Access controlled through public methods
 *    - Validation in mutator methods
 * 
 * 2. Constructor:
 *    - Initializes all instance variables
 *    - Uses 'this' to distinguish parameters from fields
 *    - Sets default values (isAlive = true, health = maxHealth)
 * 
 * 3. Accessor Methods:
 *    - Return values of private variables
 *    - Read-only access (no setters for critical data)
 * 
 * 4. Mutator Methods:
 *    - Modify instance variables with validation
 *    - takeDamage() updates health and isAlive
 *    - heal() enforces maxHealth cap
 * 
 * 5. Behavior Methods:
 *    - move(), moveTo() change position
 *    - attack() uses one player to affect another
 *    - Methods can call other methods in same class
 * 
 * 6. toString():
 *    - Override Object's toString()
 *    - Provides readable string representation
 *    - Used automatically by println(object)
 * 
 * AP EXAM RELEVANCE:
 * This class structure is typical of AP CS A FRQs:
 * - Declare instance variables (private)
 * - Write constructor
 * - Implement accessor/mutator methods
 * - Write methods that modify object state
 * - Use one object to interact with another
 */

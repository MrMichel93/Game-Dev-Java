/**
 * Practice Problem 1: Health System
 * AP CS A Unit 1 - Primitive Types
 * 
 * Task: Implement a player health system with armor and healing
 * Learning Focus: int variables, arithmetic operations, bounds checking
 */

public class Problem1_HealthSystem {
    // Instance variables representing game state
    static int maxHealth = 100;
    static int currentHealth = 100;
    static int armor = 50;
    
    /**
     * Reduces player health by damage amount, accounting for armor.
     * Armor reduces damage by (armor/100) percent.
     * Health cannot go below 0.
     * 
     * @param damage the raw damage amount
     */
    public static void takeDamage(int damage) {
        // TODO: Implement this method
        // Step 1: Calculate damage reduction from armor
        // Step 2: Calculate actual damage after armor
        // Step 3: Subtract from currentHealth
        // Step 4: Ensure health doesn't go below 0
        // Step 5: Print current health
    }
    
    /**
     * Heals the player by the specified amount.
     * Health cannot exceed maxHealth.
     * 
     * @param amount the healing amount
     */
    public static void heal(int amount) {
        // TODO: Implement this method
        // Step 1: Add amount to currentHealth
        // Step 2: Cap at maxHealth
        // Step 3: Print current health
    }
    
    /**
     * Main method to test the health system
     */
    public static void main(String[] args) {
        System.out.println("=== Health System Test ===");
        System.out.println("Starting health: " + currentHealth + "/" + maxHealth);
        System.out.println("Armor: " + armor + "%");
        System.out.println();
        
        System.out.println("Test 1: Taking 30 damage");
        takeDamage(30);
        System.out.println("Expected: ~85 HP (30 - 15 armor reduction)");
        System.out.println();
        
        System.out.println("Test 2: Healing 20 HP");
        heal(20);
        System.out.println("Expected: 100 HP (capped at max)");
        System.out.println();
        
        System.out.println("Test 3: Taking 150 damage (overkill)");
        takeDamage(150);
        System.out.println("Expected: 0 HP (cannot go negative)");
        System.out.println();
        
        System.out.println("Test 4: Healing when at 0");
        heal(50);
        System.out.println("Expected: 50 HP");
    }
}

/**
 * AP EXAM TIP:
 * This problem tests your ability to:
 * 1. Perform arithmetic with int variables (armor calculation)
 * 2. Use conditional logic to enforce bounds (health >= 0)
 * 3. Update variables correctly (currentHealth changes)
 * 
 * Common FRQ patterns:
 * - Calculating derived values (damage after armor)
 * - Enforcing constraints (min/max values)
 * - Updating state variables
 */

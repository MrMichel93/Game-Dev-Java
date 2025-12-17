/**
 * Practice Problem 1: Health System - SOLUTION
 * AP CS A Unit 1 - Primitive Types
 */

public class Problem1_HealthSystem_Solution {
    static int maxHealth = 100;
    static int currentHealth = 100;
    static int armor = 50;
    
    /**
     * Reduces player health by damage amount, accounting for armor.
     */
    public static void takeDamage(int damage) {
        // Calculate damage reduction from armor (armor% of damage)
        int damageReduction = damage * armor / 100;
        
        // Calculate actual damage after armor
        int actualDamage = damage - damageReduction;
        
        // Subtract from current health
        currentHealth -= actualDamage;
        
        // Ensure health doesn't go below 0
        if (currentHealth < 0) {
            currentHealth = 0;
        }
        
        System.out.println("Took " + actualDamage + " damage (reduced from " + 
                          damage + "). Health: " + currentHealth);
    }
    
    /**
     * Heals the player by the specified amount.
     */
    public static void heal(int amount) {
        currentHealth += amount;
        
        // Cap at maxHealth
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
        
        System.out.println("Healed " + amount + " HP. Health: " + currentHealth);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Health System Test ===");
        System.out.println("Starting health: " + currentHealth + "/" + maxHealth);
        System.out.println("Armor: " + armor + "%");
        System.out.println();
        
        System.out.println("Test 1: Taking 30 damage");
        takeDamage(30);
        System.out.println();
        
        System.out.println("Test 2: Healing 20 HP");
        heal(20);
        System.out.println();
        
        System.out.println("Test 3: Taking 150 damage (overkill)");
        takeDamage(150);
        System.out.println();
        
        System.out.println("Test 4: Healing when at 0");
        heal(50);
    }
}

/**
 * SOLUTION NOTES:
 * 
 * Key Concepts Demonstrated:
 * 1. Integer arithmetic: damage * armor / 100
 * 2. Order matters: calculate reduction before applying
 * 3. Boundary checking: currentHealth >= 0 and <= maxHealth
 * 4. Variable updates: currentHealth -= actualDamage
 * 
 * Alternative Solutions:
 * - Could use Math.max(0, currentHealth) for lower bound
 * - Could use Math.min(maxHealth, currentHealth) for upper bound
 * - Could combine: currentHealth = Math.max(0, currentHealth - actualDamage)
 * 
 * AP Exam Relevance:
 * - This type of calculation appears frequently in FRQs
 * - Tests understanding of variable updates and constraints
 * - Similar to array/list manipulation problems with bounds
 */

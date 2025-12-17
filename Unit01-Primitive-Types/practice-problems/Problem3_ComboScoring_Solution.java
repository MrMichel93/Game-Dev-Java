/**
 * Practice Problem 3: Enhanced Combo Scoring System - SOLUTION
 * AP CS A Unit 1 - Primitive Types
 */

public class Problem3_ComboScoring_Solution {
    static int score = 0;
    static int enemiesDefeated = 0;
    
    // Combo tracking variables
    static int comboCount = 0;
    static int comboTimer = 0;
    static int maxComboTime = 60;
    
    /**
     * Call this when an enemy is defeated
     */
    public static void defeatEnemy() {
        // Check if within combo time window
        if (comboTimer <= maxComboTime && comboCount > 0) {
            // Continue combo
            comboCount++;
        } else {
            // Start new combo
            comboCount = 1;
        }
        
        // Reset timer
        comboTimer = 0;
        
        // Calculate points: base 10 + bonus based on combo
        int points = 10 * comboCount;
        score += points;
        enemiesDefeated++;
        
        // Print combo status
        if (comboCount > 1) {
            System.out.println("COMBO x" + comboCount + "! +" + points + " points");
        } else {
            System.out.println("Enemy defeated! +" + points + " points");
        }
    }
    
    /**
     * Call this every frame to update timers
     */
    public static void update() {
        comboTimer++;
        
        // Break combo if too much time has passed
        if (comboTimer > maxComboTime && comboCount > 0) {
            System.out.println("Combo broken! (was x" + comboCount + ")");
            comboCount = 0;
        }
    }
    
    /**
     * Simulates game frames for testing
     */
    public static void main(String[] args) {
        System.out.println("=== Combo Scoring System Test ===");
        System.out.println();
        
        System.out.println("Test 1: Defeat 3 enemies quickly (combo should build)");
        defeatEnemy();  // Combo x1 = 10 points
        for (int i = 0; i < 30; i++) update();
        defeatEnemy();  // Combo x2 = 20 points
        for (int i = 0; i < 30; i++) update();
        defeatEnemy();  // Combo x3 = 30 points
        System.out.println("Expected score: 10 + 20 + 30 = 60");
        System.out.println("Actual score: " + score);
        System.out.println();
        
        System.out.println("Test 2: Wait too long (combo should break)");
        for (int i = 0; i < 70; i++) update();
        defeatEnemy();  // Combo reset to x1 = 10 points
        System.out.println("Expected score: 60 + 10 = 70");
        System.out.println("Actual score: " + score);
        System.out.println();
        
        System.out.println("Test 3: Build combo again");
        for (int i = 0; i < 30; i++) update();
        defeatEnemy();  // Combo x2 = 20 points
        for (int i = 0; i < 30; i++) update();
        defeatEnemy();  // Combo x3 = 30 points
        System.out.println("Expected score: 70 + 20 + 30 = 120");
        System.out.println("Actual score: " + score);
        System.out.println();
        
        System.out.println("Final Stats:");
        System.out.println("  Total Score: " + score);
        System.out.println("  Enemies Defeated: " + enemiesDefeated);
    }
}

/**
 * SOLUTION NOTES:
 * 
 * Key Design Decisions:
 * 
 * 1. Combo Logic:
 *    - Combo starts at 1 when first enemy defeated
 *    - Increments if next defeat within time window
 *    - Resets to 1 if timeout or first defeat after timeout
 * 
 * 2. Timer Management:
 *    - Timer increments every frame in update()
 *    - Resets to 0 on each defeat
 *    - Checked against maxComboTime to break combos
 * 
 * 3. Point Calculation:
 *    - Base points = 10
 *    - Combo multiplies: 10 * comboCount
 *    - x1 = 10, x2 = 20, x3 = 30, etc.
 * 
 * Alternative Approaches:
 * 
 * 1. Bonus Addition (instead of multiplication):
 *    points = 10 + (5 * comboCount)
 *    x1 = 15, x2 = 20, x3 = 25, etc.
 * 
 * 2. Exponential Growth:
 *    points = 10 * (int)Math.pow(2, comboCount - 1)
 *    x1 = 10, x2 = 20, x3 = 40, x4 = 80, etc.
 * 
 * 3. Using frameCount instead of separate timer:
 *    - Track lastDefeatFrame
 *    - Compare: frameCount - lastDefeatFrame <= maxComboTime
 * 
 * AP EXAM RELEVANCE:
 * 
 * This problem demonstrates patterns common in FRQs:
 * 
 * 1. Multi-variable State Tracking:
 *    - Managing related variables (score, combo, timer)
 *    - Updating multiple values in sync
 * 
 * 2. Conditional Logic:
 *    - Different behavior based on conditions
 *    - Resetting vs. incrementing based on state
 * 
 * 3. Timing and Counting:
 *    - Frame-based timing (common in simulations)
 *    - Threshold checks (timer > maxTime)
 * 
 * 4. Derived Values:
 *    - Calculating points from combo count
 *    - Understanding formulas and calculations
 * 
 * Similar FRQ Examples:
 * - 2019 FRQ #2: Step Tracker (counting steps, tracking active days)
 * - 2018 FRQ #1: Frog Simulation (position tracking, movement)
 * - 2017 FRQ #3: Phrase (string manipulation with counters)
 */

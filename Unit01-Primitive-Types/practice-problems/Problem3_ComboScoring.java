/**
 * Practice Problem 3: Enhanced Combo Scoring System
 * AP CS A Unit 1 - Primitive Types
 * 
 * Task: Add combo tracking to existing score system
 * Learning Focus: Multiple variables, timing, conditional updates
 * 
 * INSTRUCTIONS:
 * The basic scoring system is provided. Add combo tracking that:
 * 1. Tracks consecutive enemy defeats within a time window
 * 2. Awards bonus points based on combo count
 * 3. Resets combo when too much time passes
 */

public class Problem3_ComboScoring {
    // Existing score system
    static int score = 0;
    static int enemiesDefeated = 0;
    
    // TODO: Add combo tracking variables
    // - comboCount: current combo streak
    // - comboTimer: frames since last defeat
    // - maxComboTime: frames allowed between defeats (60 = ~1 second)
    
    /**
     * Call this when an enemy is defeated
     */
    public static void defeatEnemy() {
        // TODO: Implement combo logic
        // 1. Check if within combo time window
        // 2. If yes, increment combo; if no, reset combo to 1
        // 3. Reset timer to 0
        // 4. Calculate points: base 10 + (10 * comboCount)
        // 5. Update score and enemiesDefeated
        // 6. Print combo status
        
        score += 10;  // Placeholder - modify this
        enemiesDefeated++;
    }
    
    /**
     * Call this every frame to update timers
     */
    public static void update() {
        // TODO: Implement timer logic
        // 1. Increment comboTimer
        // 2. If comboTimer > maxComboTime and combo > 0:
        //    - Print "Combo broken!"
        //    - Reset combo to 0
    }
    
    /**
     * Simulates game frames for testing
     */
    public static void main(String[] args) {
        System.out.println("=== Combo Scoring System Test ===");
        System.out.println();
        
        System.out.println("Test 1: Defeat 3 enemies quickly (combo should build)");
        defeatEnemy();  // Combo x1
        for (int i = 0; i < 30; i++) update();  // Wait 30 frames
        defeatEnemy();  // Combo x2
        for (int i = 0; i < 30; i++) update();  // Wait 30 frames
        defeatEnemy();  // Combo x3
        System.out.println("Expected score: 10 + 20 + 30 = 60");
        System.out.println("Actual score: " + score);
        System.out.println();
        
        System.out.println("Test 2: Wait too long (combo should break)");
        for (int i = 0; i < 70; i++) update();  // Wait 70 frames (> 60)
        defeatEnemy();  // Combo reset to x1
        System.out.println("Expected score: 60 + 10 = 70");
        System.out.println("Actual score: " + score);
        System.out.println();
        
        System.out.println("Test 3: Build combo again");
        for (int i = 0; i < 30; i++) update();
        defeatEnemy();  // Combo x2
        for (int i = 0; i < 30; i++) update();
        defeatEnemy();  // Combo x3
        System.out.println("Expected score: 70 + 20 + 30 = 120");
        System.out.println("Actual score: " + score);
        System.out.println();
        
        System.out.println("Final Stats:");
        System.out.println("  Total Score: " + score);
        System.out.println("  Enemies Defeated: " + enemiesDefeated);
    }
}

/**
 * REQUIREMENTS CHECKLIST:
 * [ ] Declare comboCount variable (starts at 0)
 * [ ] Declare comboTimer variable (starts at 0)
 * [ ] Declare maxComboTime constant (set to 60)
 * [ ] In defeatEnemy(): check if within time window
 * [ ] In defeatEnemy(): increment or reset combo appropriately
 * [ ] In defeatEnemy(): calculate bonus points (10 * comboCount)
 * [ ] In defeatEnemy(): reset timer
 * [ ] In defeatEnemy(): print combo status
 * [ ] In update(): increment comboTimer each frame
 * [ ] In update(): break combo when timer expires
 * 
 * AP EXAM TIP:
 * This problem combines several AP CS A concepts:
 * - Multiple related variables (score, combo, timer)
 * - Conditional updates (if within time window)
 * - State tracking (combo count)
 * - Calculations using variables (bonus scoring)
 * 
 * Similar patterns appear in FRQs involving:
 * - Game state updates
 * - Counting and tracking over time
 * - Conditional point calculations
 */

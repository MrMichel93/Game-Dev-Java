/**
 * Code Example: Score Tracker
 * Demonstrates primitive types, variables, and basic operations
 * 
 * This is a simple score tracking system that shows:
 * - Variable declaration with primitive types
 * - Variable updates and calculations
 * - Using variables in conditional logic
 */

public class ScoreTracker {
    public static void main(String[] args) {
        // Declare and initialize game state variables
        int score = 0;
        int multiplier = 1;
        int scoreThreshold = 100;
        boolean bonusActive = false;
        
        System.out.println("=== Score Tracker Example ===");
        System.out.println("Starting score: " + score);
        System.out.println();
        
        // Simulate adding points
        System.out.println("Adding 10 points...");
        score += 10;
        System.out.println("Score: " + score);
        System.out.println();
        
        // Add points multiple times
        System.out.println("Adding points 5 more times...");
        for (int i = 0; i < 5; i++) {
            score += 10;
            System.out.println("  Score: " + score);
        }
        System.out.println();
        
        // Check threshold
        System.out.println("Checking threshold (" + scoreThreshold + ")...");
        if (score >= scoreThreshold) {
            multiplier++;
            scoreThreshold += 100;
            System.out.println("✓ Threshold reached!");
            System.out.println("  Multiplier increased to: x" + multiplier);
            System.out.println("  Next threshold: " + scoreThreshold);
        }
        System.out.println();
        
        // Activate bonus
        System.out.println("Activating bonus mode...");
        bonusActive = true;
        System.out.println("Bonus active: " + bonusActive);
        System.out.println();
        
        // Add points with bonus
        System.out.println("Adding points with bonus and multiplier...");
        if (bonusActive) {
            int points = 10 * multiplier;
            score += points;
            System.out.println("Added " + points + " points (10 × " + multiplier + ")");
            System.out.println("Score: " + score);
        }
        System.out.println();
        
        // Final stats
        System.out.println("=== Final Statistics ===");
        System.out.println("Final score: " + score);
        System.out.println("Multiplier: x" + multiplier);
        System.out.println("Bonus active: " + bonusActive);
        System.out.println("Next threshold: " + scoreThreshold);
    }
}

/**
 * KEY CONCEPTS DEMONSTRATED:
 * 
 * 1. Primitive Types:
 *    - int: for numeric values (score, multiplier, threshold)
 *    - boolean: for true/false flags (bonusActive)
 * 
 * 2. Variable Declaration and Initialization:
 *    - Type name = value;
 *    - All variables initialized before use
 * 
 * 3. Variable Updates:
 *    - score += 10 (compound assignment)
 *    - multiplier++ (increment operator)
 *    - bonusActive = true (direct assignment)
 * 
 * 4. Using Variables in Expressions:
 *    - score >= scoreThreshold (comparison)
 *    - 10 * multiplier (arithmetic)
 *    - String concatenation with + operator
 * 
 * 5. Conditional Logic:
 *    - if statements to check conditions
 *    - Different behavior based on boolean flags
 * 
 * COMPILE AND RUN:
 *   javac ScoreTracker.java
 *   java ScoreTracker
 * 
 * EXPECTED OUTPUT:
 *   === Score Tracker Example ===
 *   Starting score: 0
 *   
 *   Adding 10 points...
 *   Score: 10
 *   
 *   Adding points 5 more times...
 *     Score: 20
 *     Score: 30
 *     Score: 40
 *     Score: 50
 *     Score: 60
 *   
 *   Checking threshold (100)...
 *   
 *   Activating bonus mode...
 *   Bonus active: true
 *   
 *   Adding points with bonus and multiplier...
 *   Added 10 points (10 × 1)
 *   Score: 70
 *   
 *   === Final Statistics ===
 *   Final score: 70
 *   Multiplier: x1
 *   Bonus active: true
 *   Next threshold: 100
 */

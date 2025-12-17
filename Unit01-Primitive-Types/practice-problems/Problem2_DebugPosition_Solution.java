/**
 * Practice Problem 2: Debug Position System - SOLUTION
 * AP CS A Unit 1 - Primitive Types
 */

public class Problem2_DebugPosition_Solution {
    static int playerX = 100;
    static int playerY = 100;
    static int screenWidth = 800;
    static int screenHeight = 600;
    
    /**
     * Moves the player by dx, dy and keeps them within screen bounds.
     * FIXED VERSION
     */
    public static void movePlayer(int dx, int dy) {
        playerX += dx;
        playerY += dy;
        
        // Keep player in bounds
        if (playerX < 0) {
            playerX = 0;  // FIX #1: Changed == to = (assignment not comparison)
        }
        if (playerX > screenWidth) {
            playerX = screenWidth;  // FIX #2: Changed screenHeight to screenWidth
        }
        if (playerY < 0) {  // FIX #3: Changed PlayerY to playerY (case sensitivity)
            playerY = 0;
        }
        if (playerY > screenHeight) {
            playerY = screenHeight;
        }
        
        System.out.println("Player position: (" + playerX + ", " + playerY + ")");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Position Debug Test ===");
        System.out.println("Screen size: " + screenWidth + " x " + screenHeight);
        System.out.println();
        
        System.out.println("Test 1: Move to starting position");
        System.out.println("Expected: (100, 100)");
        movePlayer(0, 0);
        System.out.println();
        
        System.out.println("Test 2: Try to move left beyond boundary");
        System.out.println("Expected: (0, 100) - should be clamped");
        movePlayer(-200, 0);
        System.out.println();
        
        playerX = 100;
        playerY = 100;
        
        System.out.println("Test 3: Try to move right beyond boundary");
        System.out.println("Expected: (800, 100) - should be clamped");
        movePlayer(1000, 0);
        System.out.println();
        
        playerX = 400;
        playerY = 300;
        
        System.out.println("Test 4: Try to move up beyond boundary");
        System.out.println("Expected: (400, 0) - should be clamped");
        movePlayer(0, -500);
        System.out.println();
        
        playerX = 400;
        playerY = 300;
        
        System.out.println("Test 5: Try to move down beyond boundary");
        System.out.println("Expected: (400, 600) - should be clamped");
        movePlayer(0, 500);
    }
}

/**
 * BUGS EXPLAINED:
 * 
 * Bug #1: playerX == 0
 *   - Used comparison operator (==) instead of assignment (=)
 *   - This compares playerX to 0 but doesn't change it
 *   - Result: playerX stays negative, player goes off screen
 * 
 * Bug #2: playerX = screenHeight
 *   - Used wrong variable (screenHeight instead of screenWidth)
 *   - X coordinate should be bounded by WIDTH, not HEIGHT
 *   - Result: playerX gets set to 600 instead of 800
 * 
 * Bug #3: PlayerY < 0
 *   - Capitalized 'P' in PlayerY
 *   - Java is case-sensitive: PlayerY ≠ playerY
 *   - Result: Compilation error (variable not found)
 * 
 * DEBUGGING STRATEGIES:
 * 1. Read error messages carefully (Bug #3 would cause compile error)
 * 2. Test boundary cases (all four edges of screen)
 * 3. Print variable values to trace execution
 * 4. Check operator usage (= vs == is very common bug)
 * 5. Verify variable names match exactly (case-sensitive)
 * 
 * AP EXAM RELEVANCE:
 * On the AP exam, you might need to:
 * - Identify errors in provided code
 * - Explain why code doesn't work as intended
 * - Fix code to meet specifications
 * 
 * These types of questions test careful reading and attention to detail.
 */

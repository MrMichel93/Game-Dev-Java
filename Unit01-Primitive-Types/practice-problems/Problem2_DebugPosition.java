/**
 * Practice Problem 2: Debug Position System
 * AP CS A Unit 1 - Primitive Types
 * 
 * Task: Find and fix the bugs in the player boundary checking code
 * Learning Focus: Debugging, operators, variable naming conventions
 * 
 * INSTRUCTIONS:
 * This code has 3 bugs that prevent it from working correctly.
 * Find and fix all bugs, then test with the main method.
 */

public class Problem2_DebugPosition {
    static int playerX = 100;
    static int playerY = 100;
    static int screenWidth = 800;
    static int screenHeight = 600;
    
    /**
     * Moves the player by dx, dy and keeps them within screen bounds.
     * BUGGY VERSION - needs fixing!
     */
    public static void movePlayer(int dx, int dy) {
        playerX += dx;
        playerY += dy;
        
        // Keep player in bounds
        if (playerX < 0) {
            playerX == 0;  // Bug!
        }
        if (playerX > screenWidth) {
            playerX = screenHeight;  // Bug!
        }
        if (PlayerY < 0) {  // Bug!
            playerY = 0;
        }
        if (playerY > screenHeight) {
            playerY = screenHeight;
        }
        
        System.out.println("Player position: (" + playerX + ", " + playerY + ")");
    }
    
    /**
     * Test method to verify the boundary checking
     */
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
        
        // Reset position
        playerX = 100;
        playerY = 100;
        
        System.out.println("Test 3: Try to move right beyond boundary");
        System.out.println("Expected: (800, 100) - should be clamped");
        movePlayer(1000, 0);
        System.out.println();
        
        // Reset position
        playerX = 400;
        playerY = 300;
        
        System.out.println("Test 4: Try to move up beyond boundary");
        System.out.println("Expected: (400, 0) - should be clamped");
        movePlayer(0, -500);
        System.out.println();
        
        // Reset position
        playerX = 400;
        playerY = 300;
        
        System.out.println("Test 5: Try to move down beyond boundary");
        System.out.println("Expected: (400, 600) - should be clamped");
        movePlayer(0, 500);
        System.out.println();
        
        System.out.println("If all tests show expected values, bugs are fixed!");
    }
}

/**
 * HINTS:
 * Bug 1: Look at the operators used. = vs ==
 * Bug 2: Look at which variables are being used. X vs Y boundaries
 * Bug 3: Look at variable naming. Java is case-sensitive!
 * 
 * AP EXAM TIP:
 * Common mistakes on the AP exam:
 * 1. Using == (comparison) instead of = (assignment)
 * 2. Mixing up variable names (X vs Y coordinates)
 * 3. Case sensitivity errors (playerY vs PlayerY)
 * 
 * These types of bugs often appear in FRQ grading rubrics as
 * "minor errors" that lose points. Attention to detail matters!
 */

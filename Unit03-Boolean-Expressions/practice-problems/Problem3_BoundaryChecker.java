/**
 * Practice Problem 3: Boundary Checker
 * AP CS A Unit 3 - Boolean Expressions
 * 
 * Task: Keep game objects within screen boundaries
 * Learning Focus: Boundary conditions, value clamping
 */

public class Problem3_BoundaryChecker {
    
    /**
     * Clamp value to stay within bounds
     * If value < min, return min
     * If value > max, return max
     * Otherwise return value
     */
    public static int clamp(int value, int min, int max) {
        // TODO: Implement clamping logic
        return value;
    }
    
    /**
     * Keep position within screen bounds
     * Modify x and y to ensure they stay within [0, screenSize]
     */
    public static void enforceScreenBounds(int[] pos, int screenWidth, int screenHeight) {
        // TODO: Clamp pos[0] (x) and pos[1] (y) to screen bounds
        // pos[0] should be between 0 and screenWidth
        // pos[1] should be between 0 and screenHeight
    }
    
    /**
     * Check if object is fully visible on screen
     */
    public static boolean isFullyVisible(int x, int y, int width, int height,
                                        int screenWidth, int screenHeight) {
        // TODO: Return true if entire object is within screen bounds
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Boundary Checker Test ===\n");
        
        System.out.println("Clamp 150 to [0,100]: " + clamp(150, 0, 100));
        System.out.println("Expected: 100\n");
        
        int[] pos = {850, -10};
        enforceScreenBounds(pos, 800, 600);
        System.out.println("Position after bounds: (" + pos[0] + ", " + pos[1] + ")");
        System.out.println("Expected: (800, 0)\n");
        
        System.out.println("Fully visible (10, 10, 50, 50) in 800x600: " + 
                          isFullyVisible(10, 10, 50, 50, 800, 600));
        System.out.println("Expected: true");
    }
}

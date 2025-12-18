/**
 * Practice Problem 3: Boundary Checker - SOLUTION
 */

public class Problem3_BoundaryChecker_Solution {
    
    public static int clamp(int value, int min, int max) {
        if (value < min) {
            return min;
        } else if (value > max) {
            return max;
        } else {
            return value;
        }
    }
    
    public static void enforceScreenBounds(int[] pos, int screenWidth, int screenHeight) {
        pos[0] = clamp(pos[0], 0, screenWidth);
        pos[1] = clamp(pos[1], 0, screenHeight);
    }
    
    public static boolean isFullyVisible(int x, int y, int width, int height,
                                        int screenWidth, int screenHeight) {
        return x >= 0 && y >= 0 && 
               x + width <= screenWidth && 
               y + height <= screenHeight;
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

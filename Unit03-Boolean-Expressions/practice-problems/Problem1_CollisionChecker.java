/**
 * Practice Problem 1: Collision Checker
 * AP CS A Unit 3 - Boolean Expressions
 * 
 * Task: Implement collision detection methods
 * Learning Focus: Boolean expressions, compound conditions
 */

public class Problem1_CollisionChecker {
    
    /**
     * Check if two rectangles collide (AABB collision)
     * @return true if rectangles overlap
     */
    public static boolean checkRectCollision(int x1, int y1, int w1, int h1,
                                             int x2, int y2, int w2, int h2) {
        // TODO: Implement AABB collision detection
        // Rectangles collide if they overlap on BOTH x and y axes
        return false;
    }
    
    /**
     * Check if point is inside rectangle
     */
    public static boolean pointInRect(int px, int py, int rx, int ry, int rw, int rh) {
        // TODO: Implement point-in-rectangle test
        return false;
    }
    
    /**
     * Check if two circles collide
     */
    public static boolean checkCircleCollision(double x1, double y1, double r1,
                                               double x2, double y2, double r2) {
        // TODO: Calculate distance between centers and compare to sum of radii
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Collision Checker Test ===\n");
        
        // Test 1: Rectangle collision
        System.out.println("Test 1: Rectangle collision");
        System.out.println("Result: " + checkRectCollision(0, 0, 50, 50, 25, 25, 50, 50));
        System.out.println("Expected: true\n");
        
        // Test 2: Point in rectangle
        System.out.println("Test 2: Point in rectangle");
        System.out.println("Result: " + pointInRect(10, 10, 0, 0, 50, 50));
        System.out.println("Expected: true\n");
        
        // Test 3: Circle collision
        System.out.println("Test 3: Circle collision");
        System.out.println("Result: " + checkCircleCollision(0, 0, 10, 15, 0, 10));
        System.out.println("Expected: true");
    }
}

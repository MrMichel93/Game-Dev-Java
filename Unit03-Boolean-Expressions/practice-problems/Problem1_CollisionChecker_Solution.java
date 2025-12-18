/**
 * Practice Problem 1: Collision Checker - SOLUTION
 */

public class Problem1_CollisionChecker_Solution {
    
    public static boolean checkRectCollision(int x1, int y1, int w1, int h1,
                                             int x2, int y2, int w2, int h2) {
        return x1 < x2 + w2 && x1 + w1 > x2 && y1 < y2 + h2 && y1 + h1 > y2;
    }
    
    public static boolean pointInRect(int px, int py, int rx, int ry, int rw, int rh) {
        return px >= rx && px < rx + rw && py >= ry && py < ry + rh;
    }
    
    public static boolean checkCircleCollision(double x1, double y1, double r1,
                                               double x2, double y2, double r2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance < r1 + r2;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Collision Checker Test ===\n");
        
        System.out.println("Test 1: Rectangle collision");
        System.out.println("Result: " + checkRectCollision(0, 0, 50, 50, 25, 25, 50, 50));
        System.out.println("Expected: true\n");
        
        System.out.println("Test 2: Point in rectangle");
        System.out.println("Result: " + pointInRect(10, 10, 0, 0, 50, 50));
        System.out.println("Expected: true\n");
        
        System.out.println("Test 3: Circle collision");
        System.out.println("Result: " + checkCircleCollision(0, 0, 10, 15, 0, 10));
        System.out.println("Expected: true");
    }
}

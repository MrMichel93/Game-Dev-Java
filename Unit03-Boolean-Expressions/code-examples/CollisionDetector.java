/**
 * Code Example: Collision Detector
 * Demonstrates boolean expressions and conditional statements
 * 
 * This example shows:
 * - Boolean expressions with relational operators
 * - Compound conditions with &&, ||, !
 * - if-else statements for game logic
 * - Collision detection algorithms
 */

public class CollisionDetector {
    public static void main(String[] args) {
        System.out.println("=== Collision Detection Example ===");
        System.out.println();
        
        // Rectangle collision (AABB - Axis-Aligned Bounding Box)
        System.out.println("Test 1: Rectangle Collision");
        Rectangle player = new Rectangle(100, 100, 50, 50);
        Rectangle enemy = new Rectangle(120, 120, 50, 50);
        Rectangle item = new Rectangle(300, 300, 30, 30);
        
        boolean playerHitsEnemy = checkRectCollision(player, enemy);
        boolean playerHitsItem = checkRectCollision(player, item);
        
        System.out.println("Player vs Enemy: " + (playerHitsEnemy ? "COLLISION!" : "No collision"));
        System.out.println("Player vs Item: " + (playerHitsItem ? "COLLISION!" : "No collision"));
        System.out.println();
        
        // Circle collision
        System.out.println("Test 2: Circle Collision");
        Circle circle1 = new Circle(100, 100, 25);
        Circle circle2 = new Circle(140, 140, 25);
        Circle circle3 = new Circle(300, 300, 20);
        
        boolean circles12Collide = checkCircleCollision(circle1, circle2);
        boolean circles13Collide = checkCircleCollision(circle1, circle3);
        
        System.out.println("Circle 1 vs Circle 2: " + (circles12Collide ? "COLLISION!" : "No collision"));
        System.out.println("Circle 1 vs Circle 3: " + (circles13Collide ? "COLLISION!" : "No collision"));
        System.out.println();
        
        // Boundary checking
        System.out.println("Test 3: Boundary Checking");
        int screenWidth = 800;
        int screenHeight = 600;
        
        testBoundary(400, 300, screenWidth, screenHeight);  // Inside
        testBoundary(850, 300, screenWidth, screenHeight);  // Outside
        testBoundary(-10, 300, screenWidth, screenHeight);  // Outside
        System.out.println();
        
        // Game state logic
        System.out.println("Test 4: Game State Logic");
        testGameState(100, 10, 3);    // Healthy
        testGameState(20, 10, 3);     // Low health
        testGameState(0, 10, 3);      // Game over (health)
        testGameState(50, 0, 0);      // Game over (lives)
        System.out.println();
    }
    
    /**
     * Check collision between two rectangles using AABB algorithm
     */
    public static boolean checkRectCollision(Rectangle r1, Rectangle r2) {
        return r1.x < r2.x + r2.width &&
               r1.x + r1.width > r2.x &&
               r1.y < r2.y + r2.height &&
               r1.y + r1.height > r2.y;
    }
    
    /**
     * Check collision between two circles
     */
    public static boolean checkCircleCollision(Circle c1, Circle c2) {
        double dx = c1.x - c2.x;
        double dy = c1.y - c2.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        double radiusSum = c1.radius + c2.radius;
        
        return distance < radiusSum;
    }
    
    /**
     * Test if point is within screen boundaries
     */
    public static void testBoundary(int x, int y, int width, int height) {
        boolean inBounds = x >= 0 && x < width && y >= 0 && y < height;
        System.out.println("  Point (" + x + ", " + y + "): " + 
                          (inBounds ? "Inside bounds" : "Outside bounds"));
    }
    
    /**
     * Evaluate game state based on health and lives
     */
    public static void testGameState(int health, int ammo, int lives) {
        System.out.print("  Health: " + health + ", Ammo: " + ammo + ", Lives: " + lives + " -> ");
        
        if (health <= 0 && lives <= 0) {
            System.out.println("GAME OVER!");
        } else if (health <= 0) {
            System.out.println("Respawning...");
        } else if (health < 25) {
            System.out.println("Critical health!");
        } else if (ammo == 0) {
            System.out.println("Out of ammo!");
        } else {
            System.out.println("Playing normally");
        }
    }
}

/**
 * Simple Rectangle class for collision detection
 */
class Rectangle {
    int x, y, width, height;
    
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

/**
 * Simple Circle class for collision detection
 */
class Circle {
    double x, y, radius;
    
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}

/**
 * KEY CONCEPTS DEMONSTRATED:
 * 
 * 1. Boolean Expressions:
 *    - Relational: <, >, <=, >=, ==, !=
 *    - Compound: && (and), || (or), ! (not)
 * 
 * 2. AABB Collision Detection:
 *    - Check if rectangles overlap on both axes
 *    - All four conditions must be true
 * 
 * 3. Circle Collision:
 *    - Calculate distance between centers
 *    - Compare to sum of radii
 * 
 * 4. Compound Conditions:
 *    - Multiple checks with && and ||
 *    - Short-circuit evaluation
 * 
 * 5. if-else Chains:
 *    - Multiple conditions checked in order
 *    - First true condition executes
 * 
 * COMPILE AND RUN:
 *   javac CollisionDetector.java
 *   java CollisionDetector
 */

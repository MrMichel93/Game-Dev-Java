/**
 * Code Example: Sprite Manager
 * Demonstrates object instantiation, method calls, and String operations
 * 
 * This example shows:
 * - Creating objects with the new keyword
 * - Calling void and non-void methods
 * - Using String methods for game text
 * - Using Math class for game calculations
 */

public class SpriteManager {
    public static void main(String[] args) {
        System.out.println("=== Sprite Manager Example ===");
        System.out.println();
        
        // Creating sprite objects
        System.out.println("Creating sprites...");
        Sprite player = new Sprite("Player", 100, 100);
        Sprite enemy = new Sprite("Enemy", 500, 300);
        System.out.println("✓ Created: " + player.getName());
        System.out.println("✓ Created: " + enemy.getName());
        System.out.println();
        
        // Using String methods
        System.out.println("String operations:");
        String playerName = player.getName();
        System.out.println("  Name length: " + playerName.length());
        System.out.println("  Uppercase: " + playerName.toUpperCase());
        System.out.println("  Starts with 'P': " + playerName.startsWith("P"));
        System.out.println();
        
        // Calling void methods
        System.out.println("Moving player...");
        player.move(50, 25);
        player.displayPosition();
        System.out.println();
        
        // Calling non-void methods
        System.out.println("Calculating distance between sprites:");
        double distance = player.distanceTo(enemy);
        System.out.println("  Distance: " + Math.round(distance) + " pixels");
        System.out.println();
        
        // Using Math class
        System.out.println("Random spawn positions:");
        for (int i = 0; i < 3; i++) {
            int randomX = (int)(Math.random() * 800);
            int randomY = (int)(Math.random() * 600);
            System.out.println("  Spawn " + (i+1) + ": (" + randomX + ", " + randomY + ")");
        }
        System.out.println();
        
        // Comparing objects
        System.out.println("Object comparisons:");
        Sprite player2 = player;  // Same reference
        Sprite player3 = new Sprite("Player", 100, 100);  // New object
        System.out.println("  player == player2: " + (player == player2));  // true
        System.out.println("  player == player3: " + (player == player3));  // false
        System.out.println("  player.getName().equals(player3.getName()): " + 
                          player.getName().equals(player3.getName()));  // true
    }
}

/**
 * Simple Sprite class for demonstration
 */
class Sprite {
    private String name;
    private double x;
    private double y;
    
    public Sprite(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    
    public String getName() {
        return name;
    }
    
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }
    
    public void displayPosition() {
        System.out.println("  " + name + " position: (" + 
                          Math.round(x) + ", " + Math.round(y) + ")");
    }
    
    public double distanceTo(Sprite other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

/**
 * KEY CONCEPTS DEMONSTRATED:
 * 
 * 1. Object Instantiation:
 *    - Using 'new' keyword to create objects
 *    - Sprite player = new Sprite("Player", 100, 100);
 * 
 * 2. Method Calls:
 *    - Void methods: player.move(50, 25);
 *    - Non-void methods: player.getName();
 *    - Method chaining: playerName.toUpperCase()
 * 
 * 3. String Methods:
 *    - length(), toUpperCase(), startsWith()
 *    - equals() for string comparison (not ==)
 * 
 * 4. Math Class:
 *    - Math.random() for random numbers
 *    - Math.sqrt() for distance calculation
 *    - Math.round() for rounding
 * 
 * 5. Object References:
 *    - Two variables can reference same object
 *    - Use == for reference equality
 *    - Use .equals() for content equality
 * 
 * COMPILE AND RUN:
 *   javac SpriteManager.java
 *   java SpriteManager
 */

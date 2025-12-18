/**
 * Practice Problem 2: Random Item Spawner
 * AP CS A Unit 2 - Using Objects
 * 
 * Task: Generate random spawn positions and item types using Math class
 * Learning Focus: Math.random(), distance calculations, random selection
 */

public class Problem2_ItemSpawner {
    
    /**
     * Generates a random integer between min and max (inclusive)
     * 
     * @param min minimum value
     * @param max maximum value
     * @return random integer in range [min, max]
     */
    public static int randomInt(int min, int max) {
        // TODO: Implement this method
        // Use Math.random() to generate random value
        // Formula: (int)(Math.random() * (max - min + 1)) + min
        return 0;  // Placeholder
    }
    
    /**
     * Returns a random item type from: "COIN", "HEALTH", "WEAPON"
     * 
     * @return random item type
     */
    public static String randomItemType() {
        // TODO: Implement this method
        // Step 1: Generate random number 0, 1, or 2
        // Step 2: Use if-else or switch to return corresponding item type
        return "";  // Placeholder
    }
    
    /**
     * Calculates distance from origin (0, 0) to point (x, y)
     * 
     * @param x the x coordinate
     * @param y the y coordinate
     * @return distance from origin
     */
    public static double distanceFromOrigin(int x, int y) {
        // TODO: Implement this method
        // Use Pythagorean theorem: sqrt(x^2 + y^2)
        // Use Math.sqrt() and Math.pow() or x*x
        return 0.0;  // Placeholder
    }
    
    /**
     * Spawns random items and displays their information
     * 
     * @param numItems number of items to spawn
     * @param screenWidth width of screen
     * @param screenHeight height of screen
     */
    public static void spawnItems(int numItems, int screenWidth, int screenHeight) {
        // TODO: Implement this method
        // For each item:
        //   1. Generate random x (0 to screenWidth-1)
        //   2. Generate random y (0 to screenHeight-1)
        //   3. Get random item type
        //   4. Calculate distance from origin
        //   5. Display: Item #, type, position, distance
    }
    
    public static void main(String[] args) {
        System.out.println("=== Item Spawner Test ===");
        System.out.println();
        
        // Test 1: Random integer generation
        System.out.println("Test 1: Random integers (should be 1-10)");
        for (int i = 0; i < 5; i++) {
            System.out.println("  Random: " + randomInt(1, 10));
        }
        System.out.println();
        
        // Test 2: Random item types
        System.out.println("Test 2: Random item types");
        for (int i = 0; i < 5; i++) {
            System.out.println("  Item: " + randomItemType());
        }
        System.out.println();
        
        // Test 3: Distance calculation
        System.out.println("Test 3: Distance from origin");
        System.out.println("  Distance to (3, 4): " + distanceFromOrigin(3, 4));
        System.out.println("  Expected: 5.0");
        System.out.println("  Distance to (100, 100): " + 
                          Math.round(distanceFromOrigin(100, 100)));
        System.out.println("  Expected: ~141");
        System.out.println();
        
        // Test 4: Spawn items
        System.out.println("Test 4: Spawning 5 items on 800x600 screen");
        spawnItems(5, 800, 600);
    }
}

/**
 * AP EXAM TIP:
 * Math.random() generates a value >= 0.0 and < 1.0
 * 
 * To get integer from 0 to n-1:
 *   (int)(Math.random() * n)
 * 
 * To get integer from min to max (inclusive):
 *   (int)(Math.random() * (max - min + 1)) + min
 * 
 * Common mistake: Forgetting the +1 in the formula!
 */

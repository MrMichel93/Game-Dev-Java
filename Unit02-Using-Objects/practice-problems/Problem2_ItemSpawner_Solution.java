/**
 * Practice Problem 2: Random Item Spawner - SOLUTION
 * AP CS A Unit 2 - Using Objects
 */

public class Problem2_ItemSpawner_Solution {
    
    public static int randomInt(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    
    public static String randomItemType() {
        int choice = randomInt(0, 2);
        
        if (choice == 0) {
            return "COIN";
        } else if (choice == 1) {
            return "HEALTH";
        } else {
            return "WEAPON";
        }
        
        // Alternative using array (more advanced):
        // String[] types = {"COIN", "HEALTH", "WEAPON"};
        // return types[choice];
    }
    
    public static double distanceFromOrigin(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }
    
    public static void spawnItems(int numItems, int screenWidth, int screenHeight) {
        System.out.println("Spawning " + numItems + " items:");
        
        for (int i = 1; i <= numItems; i++) {
            int x = randomInt(0, screenWidth - 1);
            int y = randomInt(0, screenHeight - 1);
            String type = randomItemType();
            double distance = distanceFromOrigin(x, y);
            
            System.out.println("  Item " + i + ": " + type + 
                             " at (" + x + ", " + y + 
                             ") - Distance: " + Math.round(distance) + " pixels");
        }
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

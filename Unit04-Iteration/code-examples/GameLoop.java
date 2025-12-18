/**
 * Code Example: Game Loop with Iteration
 * Demonstrates for loops, while loops, and nested loops
 */

public class GameLoop {
    public static void main(String[] args) {
        System.out.println("=== Game Loop Examples ===\n");
        
        // Example 1: for loop - spawn enemies
        System.out.println("Spawning 5 enemies:");
        for (int i = 0; i < 5; i++) {
            int x = (int)(Math.random() * 800);
            int y = (int)(Math.random() * 600);
            System.out.println("  Enemy " + (i+1) + " at (" + x + ", " + y + ")");
        }
        System.out.println();
        
        // Example 2: while loop - countdown timer
        System.out.println("Countdown timer:");
        int time = 10;
        while (time > 0) {
            System.out.println("  Time remaining: " + time);
            time--;
        }
        System.out.println("  Game Over!\n");
        
        // Example 3: nested loops - grid generation
        System.out.println("Generating 5x5 grid:");
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

/**
 * Practice Problem 2: Game State Manager
 * AP CS A Unit 3 - Boolean Expressions
 * 
 * Task: Implement game state logic with conditionals
 * Learning Focus: if-else chains, compound conditions
 */

public class Problem2_GameStateManager {
    
    /**
     * Determine player status based on health
     * Return: "Critical", "Low", "Moderate", or "Healthy"
     */
    public static String getHealthStatus(int health, int maxHealth) {
        // TODO: Implement health status logic
        // Critical: <= 25% of max
        // Low: <= 50% of max
        // Moderate: <= 75% of max
        // Healthy: > 75% of max
        return "";
    }
    
    /**
     * Check if game is over
     * Game over if health <= 0 OR lives <= 0
     */
    public static boolean isGameOver(int health, int lives) {
        // TODO: Implement game over logic
        return false;
    }
    
    /**
     * Check if player can perform action
     * Can act if: alive AND not stunned AND has enough energy
     */
    public static boolean canPerformAction(int health, boolean isStunned, int energy, int cost) {
        // TODO: Implement action check
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Game State Manager Test ===\n");
        
        System.out.println("Health status (20/100): " + getHealthStatus(20, 100));
        System.out.println("Expected: Critical\n");
        
        System.out.println("Game over (0 health, 3 lives): " + isGameOver(0, 3));
        System.out.println("Expected: true\n");
        
        System.out.println("Can act (50 health, not stunned, 30 energy, 20 cost): " + 
                          canPerformAction(50, false, 30, 20));
        System.out.println("Expected: true");
    }
}

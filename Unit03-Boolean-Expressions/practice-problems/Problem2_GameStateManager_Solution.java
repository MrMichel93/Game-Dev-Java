/**
 * Practice Problem 2: Game State Manager - SOLUTION
 */

public class Problem2_GameStateManager_Solution {
    
    public static String getHealthStatus(int health, int maxHealth) {
        double percentage = (double) health / maxHealth;
        
        if (percentage <= 0.25) {
            return "Critical";
        } else if (percentage <= 0.50) {
            return "Low";
        } else if (percentage <= 0.75) {
            return "Moderate";
        } else {
            return "Healthy";
        }
    }
    
    public static boolean isGameOver(int health, int lives) {
        return health <= 0 || lives <= 0;
    }
    
    public static boolean canPerformAction(int health, boolean isStunned, int energy, int cost) {
        return health > 0 && !isStunned && energy >= cost;
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

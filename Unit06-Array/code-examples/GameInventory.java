/**
 * Code Example: Game Inventory using Arrays
 */
public class GameInventory {
    public static void main(String[] args) {
        String[] items = {"Sword", "Shield", "Potion", "Key"};
        int[] quantities = {1, 1, 5, 3};
        
        System.out.println("=== Inventory ===");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " x" + quantities[i]);
        }
        
        // Find total items
        int total = 0;
        for (int q : quantities) {
            total += q;
        }
        System.out.println("\nTotal items: " + total);
    }
}

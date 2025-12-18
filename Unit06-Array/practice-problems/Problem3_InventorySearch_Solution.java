public class Problem3_InventorySearch_Solution {
    public static boolean hasItem(String[] inventory, String item) {
        for (String i : inventory) {
            if (i.equals(item)) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String[] inv = {"Sword", "Shield", "Potion"};
        System.out.println("Has Sword: " + hasItem(inv, "Sword"));
        System.out.println("Has Key: " + hasItem(inv, "Key"));
    }
}

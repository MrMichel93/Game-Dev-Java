class Inventory {
    private String[] items;
    private int count;
    
    public Inventory(int capacity) {
        items = new String[capacity];
        count = 0;
    }
    
    public boolean addItem(String item) {
        if (count < items.length) {
            items[count] = item;
            count++;
            return true;
        }
        return false;
    }
    
    public boolean hasItem(String item) {
        for (int i = 0; i < count; i++) {
            if (items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    public void displayInventory() {
        System.out.println("Inventory (" + count + " items):");
        for (int i = 0; i < count; i++) {
            System.out.println("  " + (i+1) + ". " + items[i]);
        }
    }
}

public class Problem2_InventoryClass_Solution {
    public static void main(String[] args) {
        Inventory inv = new Inventory(10);
        inv.addItem("Health Potion");
        inv.addItem("Sword");
        inv.displayInventory();
    }
}

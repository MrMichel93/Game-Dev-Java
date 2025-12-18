import java.util.ArrayList;

public class DynamicInventory {
    public static void main(String[] args) {
        ArrayList<String> inventory = new ArrayList<>();
        
        inventory.add("Sword");
        inventory.add("Shield");
        inventory.add("Potion");
        
        System.out.println("Items: " + inventory.size());
        System.out.println("First item: " + inventory.get(0));
        
        inventory.remove("Shield");
        
        for (String item : inventory) {
            System.out.println("- " + item);
        }
    }
}

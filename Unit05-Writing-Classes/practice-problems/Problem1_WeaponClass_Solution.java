class Weapon {
    private String name;
    private int damage;
    private int durability;
    private int maxDurability;
    
    public Weapon(String name, int damage, int durability) {
        this.name = name;
        this.damage = damage;
        this.durability = durability;
        this.maxDurability = durability;
    }
    
    public int attack() {
        if (durability > 0) {
            durability--;
            return damage;
        }
        return 0;
    }
    
    public void repair() {
        durability = maxDurability;
    }
    
    public String toString() {
        return name + " (Damage: " + damage + ", Durability: " + durability + ")";
    }
}

public class Problem1_WeaponClass_Solution {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Iron Sword", 25, 10);
        System.out.println(sword);
        System.out.println("Attack damage: " + sword.attack());
        sword.repair();
        System.out.println(sword);
    }
}

class Weapon {
    protected String name;
    protected int damage;
    
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    
    public void attack() {
        System.out.println(name + " attacks for " + damage + " damage");
    }
}

class Sword extends Weapon {
    private double range;
    
    public Sword(String name, int damage, double range) {
        super(name, damage);
        this.range = range;
    }
    
    public void attack() {
        System.out.println(name + " slashes for " + damage + " damage (range: " + range + ")");
    }
}

class Bow extends Weapon {
    private int arrows;
    
    public Bow(String name, int damage, int arrows) {
        super(name, damage);
        this.arrows = arrows;
    }
    
    public void attack() {
        if (arrows > 0) {
            System.out.println(name + " shoots for " + damage + " damage");
            arrows--;
        } else {
            System.out.println("Out of arrows!");
        }
    }
}

public class Problem2_WeaponTypes_Solution {
    public static void main(String[] args) {
        Weapon sword = new Sword("Iron Sword", 25, 2.0);
        Weapon bow = new Bow("Longbow", 20, 3);
        sword.attack();
        bow.attack();
    }
}

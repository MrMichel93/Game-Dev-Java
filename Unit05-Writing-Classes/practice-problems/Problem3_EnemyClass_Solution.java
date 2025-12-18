class Enemy {
    private String name;
    private int health;
    private double x, y;
    private double speed;
    
    public Enemy(String name, int health, double x, double y, double speed) {
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
    
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public void moveTowards(double targetX, double targetY) {
        double dx = targetX - x;
        double dy = targetY - y;
        double distance = Math.sqrt(dx*dx + dy*dy);
        
        if (distance > 0) {
            x += (dx / distance) * speed;
            y += (dy / distance) * speed;
        }
    }
    
    public String toString() {
        return name + " at (" + (int)x + ", " + (int)y + ") - HP: " + health;
    }
}

public class Problem3_EnemyClass_Solution {
    public static void main(String[] args) {
        Enemy goblin = new Enemy("Goblin", 50, 100, 100, 2);
        System.out.println(goblin);
        goblin.moveTowards(200, 200);
        System.out.println(goblin);
    }
}

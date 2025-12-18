class PowerUp {
    protected String name;
    protected int duration;
    protected double x, y;
    
    public PowerUp(String name, int duration, double x, double y) {
        this.name = name;
        this.duration = duration;
        this.x = x;
        this.y = y;
    }
    
    public void apply() {
        System.out.println("Applying " + name);
    }
}

class HealthPowerUp extends PowerUp {
    private int healAmount;
    
    public HealthPowerUp(double x, double y, int healAmount) {
        super("Health Boost", 0, x, y);
        this.healAmount = healAmount;
    }
    
    public void apply() {
        System.out.println("Healing " + healAmount + " HP");
    }
}

class SpeedPowerUp extends PowerUp {
    private double speedMultiplier;
    
    public SpeedPowerUp(double x, double y, double multiplier, int duration) {
        super("Speed Boost", duration, x, y);
        this.speedMultiplier = multiplier;
    }
    
    public void apply() {
        System.out.println("Speed x" + speedMultiplier + " for " + duration + "s");
    }
}

public class Problem1_PowerUpHierarchy_Solution {
    public static void main(String[] args) {
        PowerUp health = new HealthPowerUp(100, 200, 50);
        PowerUp speed = new SpeedPowerUp(300, 400, 2.0, 10);
        health.apply();
        speed.apply();
    }
}

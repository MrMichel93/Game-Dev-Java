class Vehicle {
    protected String name;
    protected double x, y;
    protected double speed;
    
    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
    
    public void move() {
        System.out.println(name + " moving at " + speed);
    }
}

class Car extends Vehicle {
    public Car(String name, double speed) {
        super(name, speed);
    }
    
    public void move() {
        System.out.println(name + " driving on road at " + speed + " mph");
    }
}

class Boat extends Vehicle {
    public Boat(String name, double speed) {
        super(name, speed);
    }
    
    public void move() {
        System.out.println(name + " sailing on water at " + speed + " knots");
    }
}

class Plane extends Vehicle {
    private double altitude;
    
    public Plane(String name, double speed, double altitude) {
        super(name, speed);
        this.altitude = altitude;
    }
    
    public void move() {
        System.out.println(name + " flying at " + speed + " mph, altitude " + altitude + " ft");
    }
}

public class Problem3_VehicleHierarchy_Solution {
    public static void main(String[] args) {
        Vehicle car = new Car("Tesla", 65);
        Vehicle boat = new Boat("Yacht", 30);
        Vehicle plane = new Plane("Boeing", 500, 35000);
        car.move();
        boat.move();
        plane.move();
    }
}

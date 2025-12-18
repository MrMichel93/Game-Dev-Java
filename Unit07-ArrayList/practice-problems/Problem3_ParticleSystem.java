import java.util.ArrayList;

public class Problem3_ParticleSystem {
    public static void updateParticles(ArrayList<Double> lifetimes) {
        // TODO: Decrease all lifetimes by 1.0, remove those <= 0
    }
    
    public static void main(String[] args) {
        ArrayList<Double> lifetimes = new ArrayList<>();
        lifetimes.add(5.0);
        lifetimes.add(0.5);
        lifetimes.add(3.0);
        updateParticles(lifetimes);
        System.out.println("Remaining: " + lifetimes);
    }
}

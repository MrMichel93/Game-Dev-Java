import java.util.ArrayList;

public class Problem3_ParticleSystem_Solution {
    public static void updateParticles(ArrayList<Double> lifetimes) {
        for (int i = lifetimes.size() - 1; i >= 0; i--) {
            double newLife = lifetimes.get(i) - 1.0;
            if (newLife <= 0) {
                lifetimes.remove(i);
            } else {
                lifetimes.set(i, newLife);
            }
        }
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

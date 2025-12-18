import java.util.ArrayList;

public class Problem1_EnemyList {
    public static void removeDefeated(ArrayList<Integer> healths) {
        // TODO: Remove all enemies with health <= 0
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> healths = new ArrayList<>();
        healths.add(50);
        healths.add(0);
        healths.add(30);
        removeDefeated(healths);
        System.out.println("Remaining: " + healths);
    }
}

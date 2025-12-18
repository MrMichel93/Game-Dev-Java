import java.util.ArrayList;

public class Problem1_EnemyList_Solution {
    public static void removeDefeated(ArrayList<Integer> healths) {
        for (int i = healths.size() - 1; i >= 0; i--) {
            if (healths.get(i) <= 0) {
                healths.remove(i);
            }
        }
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

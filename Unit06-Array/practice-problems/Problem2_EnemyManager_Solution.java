public class Problem2_EnemyManager_Solution {
    public static int countAlive(int[] healths) {
        int count = 0;
        for (int health : healths) {
            if (health > 0) count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] healths = {50, 0, 30, 0, 20};
        System.out.println("Alive: " + countAlive(healths));
    }
}

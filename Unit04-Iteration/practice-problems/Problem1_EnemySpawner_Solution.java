public class Problem1_EnemySpawner_Solution {
    public static void spawnEnemies(int count, int width, int height) {
        for (int i = 0; i < count; i++) {
            int x = (int)(Math.random() * width);
            int y = (int)(Math.random() * height);
            System.out.println("Enemy " + (i+1) + " spawned at (" + x + ", " + y + ")");
        }
    }
    
    public static void main(String[] args) {
        spawnEnemies(5, 800, 600);
    }
}

public class Problem3_CollisionLoop_Solution {
    public static int countCollisions(int playerX, int playerY, 
                                      int[] enemyXs, int[] enemyYs, 
                                      int collisionDistance) {
        int count = 0;
        for (int i = 0; i < enemyXs.length; i++) {
            int dx = playerX - enemyXs[i];
            int dy = playerY - enemyYs[i];
            double distance = Math.sqrt(dx*dx + dy*dy);
            if (distance < collisionDistance) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] xs = {100, 200, 300};
        int[] ys = {100, 100, 100};
        System.out.println("Collisions: " + countCollisions(105, 100, xs, ys, 20));
    }
}

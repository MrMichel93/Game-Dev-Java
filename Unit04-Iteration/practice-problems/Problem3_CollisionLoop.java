/**
 * Practice Problem 3: Collision Loop
 * Task: Check player collision with all enemies
 */
public class Problem3_CollisionLoop {
    public static int countCollisions(int playerX, int playerY, 
                                      int[] enemyXs, int[] enemyYs, 
                                      int collisionDistance) {
        // TODO: Loop through enemies and count how many collide with player
        return 0;
    }
    
    public static void main(String[] args) {
        int[] xs = {100, 200, 300};
        int[] ys = {100, 100, 100};
        System.out.println("Collisions: " + countCollisions(105, 100, xs, ys, 20));
    }
}

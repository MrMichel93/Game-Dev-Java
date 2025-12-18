public class Problem2_GridSearch_Solution {
    public static boolean findTile(int[][] grid, int target) {
        for (int[] row : grid) {
            for (int val : row) {
                if (val == target) return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};
        System.out.println("Has 5: " + findTile(grid, 5));
    }
}

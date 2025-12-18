public class Problem1_TileCounter_Solution {
    public static int countTiles(int[][] grid, int tileType) {
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == tileType) count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[][] grid = {{1,0,1},{0,1,0},{1,0,1}};
        System.out.println("Walls: " + countTiles(grid, 1));
    }
}

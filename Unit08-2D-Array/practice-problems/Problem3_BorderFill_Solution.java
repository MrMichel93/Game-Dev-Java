public class Problem3_BorderFill_Solution {
    public static void fillBorder(int[][] grid, int value) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (r == 0 || r == grid.length-1 || 
                    c == 0 || c == grid[r].length-1) {
                    grid[r][c] = value;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] grid = new int[5][5];
        fillBorder(grid, 1);
        for (int[] row : grid) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}

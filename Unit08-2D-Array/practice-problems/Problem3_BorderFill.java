public class Problem3_BorderFill {
    public static void fillBorder(int[][] grid, int value) {
        // TODO: Set all border cells to value
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

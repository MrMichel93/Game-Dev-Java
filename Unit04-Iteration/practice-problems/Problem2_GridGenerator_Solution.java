public class Problem2_GridGenerator_Solution {
    public static void generateGrid(int rows, int cols, char tile) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(tile + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        generateGrid(5, 10, '#');
    }
}

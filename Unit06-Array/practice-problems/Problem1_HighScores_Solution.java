public class Problem1_HighScores_Solution {
    public static int findMax(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) max = score;
        }
        return max;
    }
    
    public static double findAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) sum += score;
        return (double) sum / scores.length;
    }
    
    public static void main(String[] args) {
        int[] scores = {100, 250, 180, 300, 220};
        System.out.println("Max: " + findMax(scores));
        System.out.println("Avg: " + findAverage(scores));
    }
}

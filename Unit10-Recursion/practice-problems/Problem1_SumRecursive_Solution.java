public class Problem1_SumRecursive_Solution {
    public static int sum(int n) {
        if (n <= 0) return 0;
        return n + sum(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Sum 1-5: " + sum(5));  // 15
    }
}

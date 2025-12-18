public class Problem2_PowerRecursive_Solution {
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("2^5: " + power(2, 5));  // 32
    }
}

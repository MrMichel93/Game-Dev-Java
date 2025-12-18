public class RecursiveExamples {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void countdown(int n) {
        if (n <= 0) {
            System.out.println("Blast off!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Factorial 5: " + factorial(5));
        System.out.println("Fibonacci 6: " + fibonacci(6));
        countdown(5);
    }
}

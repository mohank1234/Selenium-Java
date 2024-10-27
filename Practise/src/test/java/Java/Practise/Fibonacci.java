public class Fibonacci {

    public static void fib() {
        int n1 = 0, n2 = 1, count = 10;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < count; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2; // Update n1 to previous n2
            n2 = n3; // Update n2 to the new Fibonacci number
        }
        System.out.println(); // For better formatting
    }

    public static void with_recursion(int count, int n1, int n2) {
        if (count > 0) {
            System.out.print(n1 + " ");
            with_recursion(count - 1, n2, n1 + n2);
        }
    }

    public static void main(String args[]) {
        fib();
        int count = 8; // We want 8 more numbers in the sequence
        with_recursion(count, 0, 1);
    }
}

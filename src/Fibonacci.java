import java.util.Scanner;

/**
 * This Algorithm will calculate the fibonacci of a number.
 * @author Deniz Meral
 */
public class Fibonacci {
    /**
     * This method calculates the fibonacci of the given number.
     * @param n Is the given number.
     * @return Returns the fibonacci of the given number.
     */
    public int fibo(int n) {
        if (n == 0) {
            // best case
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // recursive call
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    /**
     * This is the main function to call the method.
     * @param args contains the command-line arguments passed to the Java program upon invocation.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fibonacci number = new Fibonacci();
        int result;

        System.out.println("Enter a number:");
        result = number.fibo(scan.nextInt());
        System.out.println("The fibonacci of the number is: \n" + result);
    }
}

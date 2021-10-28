

public class Series {
    
    public static void main(String[] args) {
        nSum(10);       
        factorial(10);
        fibonacci(10);
    }
    
    // nSum(int n) returns the sum of all numbers from 0 to n.
    public static int nSum(int n) {
        int sum = 0;
        System.out.println("The sum of first "+n+ " numbers are: ");
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.print(sum+" ");
        }
         System.out.println("");
        return sum;
    }
    
    // factorial(int n) returns the product of all numbers from 1 to n
    public static int factorial(int n) {
        int product = 1;
        int sum = 1;
        System.out.println("The first "+n+" factorials are: ");
        for (int i = 1; i <= n; i++) {
            sum *= i;

            System.out.print(sum+" ");
        }
        System.out.println("");
        return sum;
    }
    
    //fibonacci(n) returns the nth Fibonacci number
    public static int fibonacci(int n) {
        int fib = 0;
        int fib1 = 1;
        int fibSum = 0;
         System.out.println("The first "+n+" fibonacci numbers are: ");

        for (int i = 0; i <= n; i++) {

            fibSum = fib + fib1;
            fib = fib1;
            fib1 = fibSum;
            if (i == 0) {
                fib = 0;
            }

            System.out.print(fib+" ");
        }
        System.out.println("");
        return fib;
    }
    public String s;

}

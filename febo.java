import java.util.Scanner;

class febo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number of Fibonacci numbers to generate: ");
       int n=scanner.nextInt();
 //        int n=10;
        int[] fib = new int[n];
        fib[0] = 0;
        //if (n > 1) {
            fib[1] = 1;
       // }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];// fib[2]=fib[2-1]+fib[2-2]=1
        }

        System.out.println("The first " + n + " Fibonacci numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }
}

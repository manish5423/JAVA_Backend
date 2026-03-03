import java.util.Scanner;
public class pro {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       // print the number from 1 to n using recursion.
       System.out.println("Enter the number: ");
       int n = sc.nextInt();
        

         // print the nth Fibonacci number using recursion.
        System.out.println("\nEnter the number: ");
        int n1 = sc.nextInt();  
        System.out.println("The "+ n1 +"th Fibonacci number is: "); 
        System.out.println(Fib(n1));

        System.out.println("\nThe numbers from 1 to "+ n +" are: ");
        printNumber(n);
       
        sc.close();

    }

    static void printNumber(int n){
        if(n == 0){
            return;
        }

        printNumber(n-1);
        System.out.print(n+" ");
    }

    static int Fib(int n){
        if(n ==0 || n==1){
            return 1;
        }
        int x = Fib(n-1);
        int y = Fib(n-2);
        return x+y;

    }
}

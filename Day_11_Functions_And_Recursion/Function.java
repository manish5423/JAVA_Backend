public class Function {
    public static void main(String[] args) {
        fun1();
        fun2(10, 20);
        int sum1 = fun3();
        System.out.println("The sum is: "+ sum1);
        int sum2 = fun4(30, 40);
        System.out.println("The sum is: "+ sum2);   


    }

    // No Input and No output
    static void fun1(){
        System.out.println("This is No input No output function.");
    }

    //Input and No output
    static void fun2(int a,int b){  // Number of parameters can be more than 2.
        int sum = a+b;
        System.out.println("The sum is: "+ sum);
    }

    // No input and output
    static int fun3(){
        int a = 10;
        int b = 20;
        int sum = a+b;
        return sum;
    }

    // Input and output
    static int fun4(int a,int b){
        int sum = a+b;
        return sum;
    }

}

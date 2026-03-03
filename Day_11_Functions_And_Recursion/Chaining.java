public class Chaining {
    public static void main(String[] args) {
        // function chaining
        fun1();
    }
   static void fun1(){
        fun2();
        System.out.println("This is fun1.");
    }
   static void fun2(){
        fun3();
        System.out.println("This is fun2.");
    }
   static void fun3(){
        System.out.println("This is fun3.");
    }
}

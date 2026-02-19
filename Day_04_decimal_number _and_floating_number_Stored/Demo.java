public class Demo {
    public static void main(String[] args) {
        double a = 10.5;  // double is a floating-point type that can hold decimal values with double precision
        float b = 0.7f;    // use special suffix 'f' for float literals

        System.out.println("Double: " + a);
        System.out.printf("Float: %.20f%n", b);  // Format float to 20 decimal places here i so not exactly the same as double but close to it.
        // For this concept I explain it in my notes as well. I will also add the concept of precision and how it affects the storage of decimal numbers in both double and float types.
    }  
}

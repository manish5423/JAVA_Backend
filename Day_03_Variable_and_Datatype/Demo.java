public class Demo{
    public static void main(String[] args) {
        byte e = 100;    // byte is a smaller integer type, can hold values from -128 to 127
        int a = 10;  // integer variable ranges from -2,147,483,648 to 2,147,483,647
        double b = 20.5;  // double is a floating-point type that can hold decimal values with double precision
        char c = 'A';  // char is a single character type, enclosed in single quotes
        boolean d = true; // boolean can only hold two values: true or false
        float f = 3.14f;    // use special suffix 'f' for float literals

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("Byte: " + e); 
        System.out.println("Float: " + f);
    }
}
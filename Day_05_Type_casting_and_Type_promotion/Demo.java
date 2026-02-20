package Day_05_Type_casting_and_Type_promotion;

public class Demo {
    public static void main(String[] args) {
        
        // Type casting (Implicit);
        byte b = 21;
        int i;
        i = b; // Implicit type casting (widening conversion) from byte to int, as int can hold a wider range of values than byte.
        System.out.println(i);

        int x = 2121;
        long y = x;
        System.out.println(y);

        // Type casting (Explicit);
        long d = 323232323;
        int a;
        a = (int) d; // Explicit type casting (narrowing conversion) from double to int, as int cannot hold decimal values and may lose precision.
        System.out.println(a);

        double d1 = 3.12212;
       // float f = d1; // This will cause a compile-time error because double cannot be directly assigned to float without explicit casting.
        float f = (float) d1;
        System.out.println(f);

        // Character to int datatype conversion;
        char c = 'B'; // char is a single character type, enclosed in single quotes
        int a1 = c;  // Implicit type casting from char to int, as char can be represented as an integer value based on the Unicode character set.
        System.out.println(a1);

        // Type promotion.
        byte b1 = 50;
       // b1 = b1*2; // This will cause a compile-time error because the result of the multiplication is promoted to int, which cannot be directly assigned back to a byte without explicit casting.
        // To fix this, we need to cast the result back to byte:    
        b1 = (byte) (b1 * 2);
        System.out.println(b1);

        int a2 = 100;
        double d2 = 22.2211;
        float f1 = 21.23f;
        char c1 = 'C';
        byte b2 = 10;
        short s = 5;
        long l = 100000;

        double result = (a2+d2)+(f1+c1)+(b2+s+l); // In this expression, all the operands are promoted to double before the addition operation is performed, resulting in a double value.
        System.out.println(result);

        System.out.println((a2+d2)+","+(f1+c1)+","+(b2+s+l)); // In this expression, all the operands are promoted to double before the addition operation is performed, resulting in a double value.


    }
}

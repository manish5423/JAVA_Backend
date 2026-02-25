public class Bit {
    public static void main(String[] args) {
        // Bitwise operators ( & , |, ^ , ~ , >> , << , >>> );
        int a = 5;  // 00000000 00000000 00000000 00000101
        int b = 3;  // 00000000 00000000 00000000 00000011

        int c = a & b; // Bitwise AND  // 00000000 00000000 00000000 00000001  // 1
        int d = a | b; // Bitwise OR   // 00000000 00000000 00000111  // 7
        int e = a ^ b; // Bitwise XOR  // 11111111
        int f = ~a;    // Bitwise NOT  // 11111111 11111111 11111111 1111123456789 -6
        int g = a << 2; // Left shift   // 2^2 =4, so we shift left by two positions
        int h = a >> 2; // Right shift  // Right shift by two positions
        int i = a >>> 1; // Unsigned right shift // 00000000
        System.out.println("Bitwise AND: " + c);
        System.out.println("Bitwise OR: " + d);
        System.out.println("Bitwise XOR: " + e);
        System.out.println("Bitwise NOT: " + f);
        System.out.println("Left shift: " + g);
        System.out.println("Right shift: " + h);
        System.out.println("Unsigned right shift: " + i);
        

    }
}

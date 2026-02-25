public class Demo {
    public static void main(String[] args) {
        // Arithmatic operators ( +, -, * , / , % , ++ ,-- ,+=, -=, *=, /=, %= );
        int a = 10;
        int b = 5;
        
        int c = a + b; // Addition
        int d = a - b; // Subtraction
        int e = a * b; // Multiplicationint 
        int f = a / b; // Division
        int g = a % b; // Modulus
        System.out.println("Addition: " + c);
        System.out.println("Subtraction: " + d);
        System.out.println("Multiplication: " + e);
        System.out.println("Division: " + f);   
        System.out.println("Modulus: " + g);

        // Assignment operators ( =, +=, -=, *=, /=, %= ).
        int h = 10;
        h += 10; // h = h + 10  // 20
        System.out.println("h: " + h); 
        h -= 5; // h = h - 5   // 15
        System.out.println("h: " + h);
        h *= 2; // h = h * 2    // 30
        System.out.println("h: " + h);
        h /= 4; // h = h / 4   // 7
        System.out.println("h: " + h);
        h %= 3; // h = h % 3   // 1
        System.out.println("h: " + h);

//   ************** Increment and Decrement operators ( ++ , -- )************************

        int i = 5;
        i++;  // 6;  //Post-increment , i = i+1 
        System.out.println("i: " + i);
        ++i;        // pre-increment  // 7 , i = i + 1
        System.out.println("i: " + i);

        int j = i++;  // j = 7,i = 8. first assign then increment
        System.out.println("j: " + j); 
        System.out.println("i: " + i); 

        int k = ++i;  // i = 9, k = 9. first increment then assign
        System.out.println("k: " + k);



    }
}

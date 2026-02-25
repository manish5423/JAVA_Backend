public class Logical {
    public static void main(String[] args) {
        
        // Logical operators ( && , || , ! );
        boolean a = true;
        boolean b = false;

        boolean c = a && b; // Logical AND  // false
        boolean d = a || b; // Logical OR   // true
        boolean e = !a;     // Logical NOT  // false
        System.out.println("Logical AND: " + c);
        System.out.println("Logical OR: " + d);
        System.out.println("Logical NOT: " + e);


        // short-circuit operators ( && , || );
        int x = 10;
        int y = 5;
        boolean result = (x > y) && (y++ > 0); // true && true  // short-circuit, so y++ is not evaluated
        System.out.println("Result: " + result);    
        System.out.println("y: " + y); // y is still 5 because the second part of the expression is not evaluated
        result = (x < y) || (y++ > 0); // false || true  // short-circuit, so y++ is not evaluated
        System.out.println("Result: " + result);
        System.out.println("y: " + y); // y is still 5 because the second part of the expression is not evaluated
        

        
    }
}

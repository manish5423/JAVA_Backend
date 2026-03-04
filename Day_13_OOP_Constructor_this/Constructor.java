public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
 // Default Value of Instance variable.
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.grade);
        System.out.println(s1.college);

        // int x;  // local variable --->  No having default values.
        // System.out.println(x);
    }
}

/*
Defualt value of Instance variables Datatypes.
Integer -> 0;
float -> 0.0;
boolean -> false;
String -> null;


*/

class Student{
    
    String name;   // Instance variable ------> Have default values.
    int age;
    int grade;
    String college;

    void markAttendence(){   // function ---->  Instance method.

        System.out.println("Attentemce marked "+name);
    }
}
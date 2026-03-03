public class Demo{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Manish";
        s1.age = 20;
        s1.rollNumber = 1;
        s1.college = "Gla University";
        s1.cgpa = 8.0F;


        s2.name = "Ram Sain";
        s2.age = 21;
        s2.rollNumber = 2;
        s2.college = "Gla University";
        s2.cgpa = 8.23F;


        s1.markAttendence();
        s1.print();

        s2.markAttendence();
        s2.print();


    }
}

class Student{
    String name;
    int rollNumber;
    int age;
    String college;
    Float cgpa;

    void markAttendence(){
        System.out.println("Attendence maked by "+ name);
    }

    void print(){
        System.out.println(name + " "+ rollNumber + " "+ age + " "+ college + " "+ cgpa);
    }

}

// Java is almost an object-oriented programming language, but it also supports procedural programming. In Java, you can write code in a procedural style, but it is generally recommended to use an object-oriented approach for better organization and maintainability of code.
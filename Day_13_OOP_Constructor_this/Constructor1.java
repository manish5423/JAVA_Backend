public class Constructor1 {
    public static void main(String[] args) {
        // Student s1 = new Student();

        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // System.out.println(s1.grade);
        // System.out.println(s1.college);


        // Student s1 = new Student("manish",20,9,"Gla University");

        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // System.out.println(s1.grade);
        // System.out.println(s1.college);


        // Using This constructor.
        
        Student s3;
        s3 = new Student("manish saini",21,10,"Gla University");

        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.grade);
        System.out.println(s3.college);







    }
}

class Student{
    String name;
    int age; 
    int grade;
    String college;

    // constructor.
    Student(){
        name = "manish";
        age = 21;
        grade=8;
        college ="Gla University";
    }

    // Another Way to create the constructor.  parametric constructor.
    // Student(String s,int a,int g,String c){

    //     name = s;
    //     age = a;
    //     grade = g;
    //     college = c;

    // }

    // Using this keyword.

    Student(String name,int age,int grade,String college){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.college = college;

    }

    // Default constructor
    // Student(){

    // }

    

}
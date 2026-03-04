public class Conchaning {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("manish saini");
        Student s3 = new Student("Ram Saini",20);
        Student s4 = new Student("Manish singh",32,89);
        Student s5 = new Student("manish",21,21,"Gla university");

        System.out.println(s1.name + " " + s1.age + " " + s1.rollNumber + " " + s1.college);
        System.out.println(s2.name + " " + s2.age + " " + s2.rollNumber + " " + s2.college);
        System.out.println(s3.name + " " + s3.age + " " + s3.rollNumber + " " + s3.college);
        System.out.println(s4.name + " " + s4.age + " " + s4.rollNumber + " " + s4.college);
        System.out.println(s5.name + " " + s5.age + " " + s5.rollNumber + " " + s5.college);
    }
}
// Constructor Overloading.
class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(){
        this("Unknown");
    }
    Student(String name){
        this(name,0);
    }
    Student(String name,int age){
        this(name,age,0);
    }
    Student(String name,int age,int rollNumber){
       this(name,age,rollNumber,"Unknown");
    }
    Student(String name,int age,int rollNumber,String college){
        this.name=name;
        this.age=age;
        this.rollNumber = rollNumber;
        this.college=college;
    }
}
public class Car{
    public static void main(String[] args) {
        CarProto c1 = new CarProto();
        CarProto c2 = new CarProto();   

        c1.name = "swift";
        c1.modelNumber = 2020;
        c1.carNumber = 12334;
        c1.company = "Maruti";
        c1.price = 500000;
        c1.yearOfManufacture = 2020;
        c1.milage = 20;

        c2.name = "Baleno";
        c2.modelNumber = 2021;
        c2.carNumber = 12335;
        c2.company = "Maruti";
        c2.price = 600000;
        c2.yearOfManufacture = 2021;
        c2.milage = 18;

        c1.start();
        c1.print();

        c2.start();
        c2.print();

    }
}

class CarProto{
    String name;
    int modelNumber;
    String company;
    int price;
    int yearOfManufacture;
    int milage;
    int carNumber;

    void start(){
        System.out.println("Car is Starting.");
    }
    void print(){
        System.out.println(name +" "+ modelNumber + " "+ company + " "+ price + " "+ yearOfManufacture + " "+ milage + " "+ carNumber);
    }
}
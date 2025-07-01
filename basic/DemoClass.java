package basic;

class Car{
    String model;
    int year;
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display(){
        System.out.println(model+' '+year);
    }
}

public class DemoClass {
    public static void main(String[] args) {
        Car myCar = new Car("hyndai", 2024);
        myCar.display();
        System.out.println("Car model: "+ myCar.model);
        System.out.println("Car year: "+ myCar.year);

    }
}

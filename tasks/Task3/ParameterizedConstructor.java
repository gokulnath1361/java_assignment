package tasks.Task3;
class Car{
    String brand;
    String model;
    int year;
    public Car(String brand, String model,int year){  //constructor
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    public void display(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Brand : "+year);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args){
    Car mycar = new Car("BMW", "Series 20", 2020);
    mycar.display();
    }
}

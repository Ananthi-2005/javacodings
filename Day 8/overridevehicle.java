class Vehicle{
    public void makeSound(){
        System.out.println("vehicle sound");
    }
}
class Car extends Vehicle{
    public void makeSound(){
        System.out.println("car is started");
    }
}
class Bike extends Vehicle{
    public void  makeSound(){
        System.out.println("bike is started");
    }
}
class Bus extends Vehicle{
    public void  makeSound(){
        System.out.println("bus is started");
    }
}

public class overridevehicle{
    public static void main(String[]args){
        Car C=new Car();
        C.makeSound();
        Bike B=new Bike();
        B.makeSound();
        Bus D=new Bus();
        D.makeSound();
    }
}
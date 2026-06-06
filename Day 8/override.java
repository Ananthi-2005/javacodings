class Animal{
    public void makeSound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog Barks");
    
    }
}
public class override{
    public static void main(String[]args){
        Dog D=new Dog();
        D.makeSound();

    }
}
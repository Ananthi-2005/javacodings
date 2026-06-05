import java.util.Scanner;
class swap{
    public static void main(String[]args){
      Scanner anu=new Scanner(System.in);
      System.out.println("Enter a number1:");
      int a=anu.nextInt();
      System.out.println("Enter a number2:");
      int b=anu.nextInt();
      System.out.println("before swap:");
      System.out.println("a=  "+a);
      System.out.println("b=  "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:");
        System.out.println("a=  "+a);
        System.out.println("b=  "+b);
   }
}
class Student{
    String name;
    int age;
    public void disp(){
        System.out.println("Name:" + name+"Age:" +age);
    }
}
public class classex{
    public static void main(String[]args){
        Student stud=new Student();
        stud.name="Ananthi";
        stud.age=20;
        System.out.println(stud.name);
        System.out.prinlnt(stud.age);
        stud.disp();


    }
}
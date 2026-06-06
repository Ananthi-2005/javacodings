public class voidmethod{
    public static int addtwonumbers(int a,int b){
        int c=a+b;
        return c;
    }
    public int addtwonumbers(int a,int b,int c){
        return a+b+c;
    }
    static void change(int x){
        x=500;
        System.out.println("Inside method");
    }
    public static void main (String[]args){
        int y=5;
        change(y);
        System.out.println("Outside method:+y");
        voidmethod a=new voidmethod();
        System.out.print(a.addtwonumbers(11,22,33));
    }
}
import java.util.Scanner;
public class guess{
    public static void main (String[]agrs) {
        Scanner in=new Scanner(System.in);
        int secret=33;
        int guess;
        do{
            guess=in.nextInt();
             if(guess<secret){
                System.out.println("guess is smaller");
            }
             else if(guess>secret){
                System.out.println("guess is higher");
            }
            } 
             while(guess!=secret);
              System.out.println("guess is correct");
    }
}
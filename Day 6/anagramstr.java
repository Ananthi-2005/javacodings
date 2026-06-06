import java.util.Scanner;

public class anagramstr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
        }
        System.out.println(s2.length() == 0);
    }
}
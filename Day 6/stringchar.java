public class stringchar{
    public static void main (String[]args){ 
    String a="hello";
    String b=new String("hello");
    //accessing character
    for(int i=0;i<a.length();i++){
        System.out.println(a.charAt(i));
    }
    for(char c:a.toCharArray()){
        System.out.println(c);
    }
    }
}
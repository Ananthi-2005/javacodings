public class string{
    public static void main(String[]args){
        int signal=3;
        switch(signal){
            case 1:
                System.out.println("stop");
                break;
            case 2:
                System.out.println("ready");
                break;
            case 3:
                System.out.println("go");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}


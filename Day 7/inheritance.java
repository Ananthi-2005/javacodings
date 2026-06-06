class User{
    String name;
    String phn;
    String location;
    User(String name,String phn,String location){
        this.name=name;
        this.phn=phn;
        this.location=location;
    }
    public void basic(){
        System.out.println(name+" "+phn+" "+location);
    }
}
class FoodUser extends User{
    String favfood;
    FoodUser(String name,String phn,String location,String favfood){
        super(name,phn,location);
        this.favfood=favfood;
    }
    public void userDetails(){
        System.out.println("Name:"+name+" Phn: "+ phn+ "Favorite Food:" + favfood);

    }
}
public class inheritance{
    public static void main(String args[]){
        FoodUser c1=new FoodUser("anu","12345678","chennai","briyani");
        c1.userDetails();    
        }
}
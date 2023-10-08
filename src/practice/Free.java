package practice;

public class Free extends Users{

    Free(String userName, String email){
        super(userName, email);
    }
    public void welcomeMessage(){
        System.out.println("Welcome free user!!!!!!!!");
    }
}

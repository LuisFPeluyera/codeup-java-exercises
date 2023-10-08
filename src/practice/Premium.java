package practice;

public class Premium extends Users{

    Premium(String userName, String email){
        super(userName,email);
    }

    public void welcomeMessage(){
        System.out.println("Welcome premium user!!!!!!!!");
    }

}

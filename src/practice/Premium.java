package practice;

public class Premium extends Users{

    Premium(String userName, String email){
        super(userName,email);
    }

    public void welcomeMessage(){
        System.out.printf("%s! WELCOME TO THE PREMIUM VERSION!!!!!!!!%n",this.userName);
    }

}

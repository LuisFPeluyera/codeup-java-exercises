package practice;

public class CodeRunner{



    public static void main(String[] args){

       Users user1 = new Users("myUserName1", "user1@email.com");
       user1.setName("Jack");
       user1.setPassword("jacksPassword");

       user1.welcomeMessage();
       user1.userInfo();

    }
}

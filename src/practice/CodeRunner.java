package practice;

public class CodeRunner{



    public static void main(String[] args){

       Users user1 = new Users("myUserName1", "user1@email.com");
       user1.setName("Jack");
       user1.setPassword("jacksPassword");

       Users premiumUser1 = new Premium("premiumUserName", "premium@email.com");
       premiumUser1.setName("John");
       premiumUser1.setPassword("John'sPassword");

       Premium premium1 = new Premium("premiumPremium","premiumPremium@premium.com");

       Users freeUser = new Free("freeUserName","freeUseremail@email.com");
       freeUser.setNameAndPassword("Bryan", "bryanspassword");
       freeUser.welcomeMessage();
       freeUser.userInfo();
       freeUser.userNamePassword();


//       user1.welcomeMessage();
//       user1.userInfo();
//       user1.userNamePassword();
//
//       premiumUser1.welcomeMessage();
//       premiumUser1.userInfo();
//       premiumUser1.userNamePassword();

//        premium1.userInfo();
//        premium1.welcomeMessage();
//        premium1.userNamePassword();
//        premium1.setNameAndPassword("Pedro","pedrosPassword");
//        premium1.userNamePassword();




    }
}

package practice;

public class Users {

    public String email;
    public String userName;
    private String name;
    private String password;

    Users(String userName, String email){
        this.userName = userName;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void welcomeMessage(){
        System.out.println("Welcome user!!!!!!!!");
    }

    public void userInfo(){
        System.out.printf("%nACCOUNT INFORMATION %nUsername: %s %nEmail: %s%n",this.userName, this.email);
    }

    public void userNamePassword(){
        System.out.printf("%nUSER INFORMATION %nYour user name: %s %nYour email: %s%n",this.getName(), this.getPassword());
    }


}

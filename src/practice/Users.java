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

    public void setNameAndPassword(String name, String password){
        this.setName(name);
        this.setPassword(password);
    }

    public void welcomeMessage(){
        System.out.printf("%s! WELCOME!!!!!!!!%n",this.userName);
    }

    public void userInfo(){
        System.out.printf("%nACCOUNT INFORMATION %nUsername: %s %nEmail: %s%n",this.userName, this.email);
    }

    public void userNamePassword(){
        System.out.printf("%nBELOW INFORMATION IS PROTECTED %nUSER INFORMATION %nName: %s %nPassword: %s%n",this.getName(), this.getPassword());
    }


}

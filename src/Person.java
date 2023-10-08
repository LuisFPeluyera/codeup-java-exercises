

import java.util.Scanner;

public class Person {


    public Person(String name){
        this.name = name;
    }

    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello %s%n",this.name);
    }


    public static void main(String[] args){

        Person myPerson = new Person("Juan one");

        myPerson.sayHello();

        System.out.println(myPerson.getName());


        Scanner myScanner = new Scanner(System.in);



    }
}

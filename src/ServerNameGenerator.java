import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {


    public int randomElement(String[] adjectives, String[] nouns){

       Random randomNumber1 = new Random();
       Random randomNumber2 = new Random();

       int index1 = randomNumber1.nextInt(adjectives.length);

       int index2 = randomNumber2.nextInt(nouns.length);

        System.out.println("here is your server name:\n \"" + adjectives[index1] + "-" + nouns[index2] +"\"");

        return index1;

    }



    public static void main(String[] args){
        String[] adjectives = {"beautiful", "ugly", "fast", "tall", "big", "small", "honest", "attractive", "slow"};

        String[] nouns = {"fork", "dish", "goat", "dove", "man", "child", "boat", "ship", "ambulance", "water bottle"};


//        for(String word:adjectives){
//
//            System.out.println(word);
//        }
//        System.out.println();
//
//        for(String word:nouns){
//
//            System.out.println(word);
//        }

       ServerNameGenerator test = new ServerNameGenerator();

       test.randomElement(adjectives,nouns);



    }

}

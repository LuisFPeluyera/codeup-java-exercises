import java.util.Arrays;

public class ArraysExercises {


    public static Person[] addPerson(Person[] people,Person person){
        Person[] newArray = Arrays.copyOf(people,people.length+1);
        Arrays.fill(newArray,newArray.length-1,newArray.length,person);
        for (Person persona:newArray) {
            System.out.println(persona.getName());
        }

        return newArray;
    }


    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//
//        for (int num: numbers) {
//            System.out.println(num);
//        }


    // creating 3 instances of a person
        Person person1 = new Person("cody");
        Person person2 = new Person("Jane");
        Person person3 = new Person("Billy");
        Person person4 = new Person("bob");

    // declaring array
        Person[] people = new Person[3];

    // initializing array
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

    // looping tru array get each person name
//        for(Person person: people) {
//            System.out.println(person.getName());
//        }

    addPerson(people,person4);

    }
}

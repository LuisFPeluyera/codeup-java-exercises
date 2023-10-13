package grocery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GroceryList myList = new GroceryList();

        ArrayList<Item> list = new ArrayList<>();
        ArrayList<String> groceryCategories = new ArrayList<>();
        groceryCategories.add("fruits");
        groceryCategories.add("vegetables");
        groceryCategories.add("protein");
        groceryCategories.add("dairy");
        groceryCategories.add("grains");
        groceryCategories.add("oils");


        System.out.println("Create a grocery list ??");
        String userInput = scanner.nextLine().toLowerCase();

        int itemAmount;

        if (userInput.equals("y")) {
            do {

                    System.out.println("Choose from categories -> " + groceryCategories);
                    userInput = scanner.nextLine();
                    if (groceryCategories.contains(userInput)) {
                        Item newItem = new Item(userInput);
                        System.out.println("Enter name of item:");
                        userInput = scanner.nextLine();
                        newItem.name = userInput;
                        System.out.println("Enter amount:");
                        itemAmount = scanner.nextInt();
                        newItem.amount = itemAmount;
                        list.add(newItem);

                        scanner.nextLine();
                        System.out.println("Add another item ?");

                        userInput = scanner.nextLine();
                        if (userInput.equals("n")){
                            System.out.print("Here are your items: ");
                            System.out.println();
                            list.forEach(item -> {
                                System.out.println(item.name + " " + item.amount);
                            });
                            break;
                        }

                    }


            } while (!userInput.equals("n"));

        }
        System.out.println(list.size());
    }
}

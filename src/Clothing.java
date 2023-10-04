public class Clothing {

    public String type;

    public String color;

    public char size;

    private String brand;

    public static void main(String[] args) {


        Clothing myShirt = new Clothing();

        myShirt.color = "white";
        myShirt.type = "t shirt";
        myShirt.size =  'L';
        myShirt.brand = "free";

        Clothing myShorts = new Clothing();

        myShorts.color = "beige ishh";
        myShorts.type = "shorts";
        myShorts.size = 'L';

        System.out.println("Here is an object with the brand of " + myShirt.brand + ", it's color is " + myShirt.color + ", the type is " + myShirt.type + " and the size is " + myShirt.size);

        System.out.println("Here is an object it's color is " + myShorts.color + ", the type is " + myShorts.type + " and the size is " + myShorts.size);

    }
}

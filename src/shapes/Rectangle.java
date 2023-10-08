package shapes;

public class Rectangle {

    protected int length;
    protected int width;


    Rectangle(int length, int width){

        this.length = length;
        this.width = width;

    }

    public int getArea(){
        System.out.println("The area of this rectangle is " + length * width);
        return length * width;
    }

    public int getPerimeter(){
        System.out.println("The perimeter of this rectangle is " + (2 * length) + (2 * width));
        return (2 * length) + (2 * width);
    }


}

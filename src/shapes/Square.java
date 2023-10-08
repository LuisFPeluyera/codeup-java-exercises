package shapes;

public class Square extends Rectangle {

    public Square(int side){
        super(side, side);
    }

    public int getArea(){
        System.out.println("The area of this square is " + length * length);
        return length * length;
    }

    public int getPerimeter(){
        System.out.println("The perimeter of this square is " + (2 * length) + (2 * length));
        return (2 * length) + (2 * length);
    }


}

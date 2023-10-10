package shapes;

public class Square extends Quadrilateral {

    public Square(int side){
        super(side, side);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public void SetWidth() {

    }

    @Override
    public void setLength() {

    }

//    public int getArea(){
//        System.out.println("The area of this square is " + length * length);
//        return length * length;
//    }
//
//    public int getPerimeter(){
//        System.out.println("The perimeter of this square is " + (2 * length) + (2 * length));
//        return (2 * length) + (2 * length);
//    }


}

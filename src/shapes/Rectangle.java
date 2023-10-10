package shapes;

public class Rectangle extends Quadrilateral implements Measurable{



    Rectangle(int length, int width){
        super(length,width);


    }

    @Override
    public void SetWidth() {

    }

    @Override
    public void setLength() {

    }

    public double getArea(){
        System.out.println("The area of this rectangle is " + length * width);
        return length * width;
    }

    public double getPerimeter(){
        System.out.println((2 * length) + (2 * width));
        return (2 * length) + (2 * width);
    }


}

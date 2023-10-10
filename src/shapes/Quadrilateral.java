package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;

    protected double width;

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public abstract void SetWidth();

    public double getWidth(){
        return width;
    }

    public abstract void setLength();

    public double getLength() {
        return length;
    }




}

package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;



    public double getLength(double length) {
        return length;
    }
    abstract public void setLength(double length);



    public double getWidth(double width) {
        return width;
    }
     abstract void setWidth(double width);


    public Quadrilateral(double length, double width) {
        setLength(length);
        setWidth(width);
    }

}

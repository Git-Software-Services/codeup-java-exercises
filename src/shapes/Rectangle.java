package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return  width + width + length + length;

    }

    @Override
    public double getArea() {
        return width * length;

    }

//    protected int width;
//    protected int length;
//
//
//    public Rectangle(int width, int length) {
//        this.width = width;
//        this.length = length;
//
//    }
//
//    public int getArea(){
//        int area = width * length;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = width + width + length + length;
//        return perimeter;
//    }
}//End of class

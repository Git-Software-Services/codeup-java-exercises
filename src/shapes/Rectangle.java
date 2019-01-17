package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        double perimeter = width + width + length + length;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = width * length;
        return area;
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

package shapes;

public class Square extends Quadrilateral{

    public Square( double side) {
        super(side, side);
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
        double perimeter = width * 4;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = (int) Math.pow(width, 2);
        return area;
    }
//    public int globalSideVar;

//    public Square(int side) {
//        super(side, side);
////        this.globalSideVar = side;
//    }
//    public int getArea(){
//        int area = (int) Math.pow(width, 2);
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = width * 4;
//        return perimeter;
//    }
}


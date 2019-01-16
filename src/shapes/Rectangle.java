package shapes;

public class Rectangle {
    protected int width;
    protected int length;


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;

    }

    public int getArea(){
        int area = width * length;
        return area;
    }

    public int getPerimeter(){
        int perimeter = width + width + length + length;
        return perimeter;
    }
}//End of class

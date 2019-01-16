package shapes;

public class Square extends Rectangle{
    public int globalSideVar;

    public Square(int side) {
        super(side, side);
        this.globalSideVar = side;
    }
    public int getArea(){
        int area = (int) Math.pow(globalSideVar, 2);
        return area;
    }

    public int getPerimeter(){
        int perimeter = globalSideVar * 4;
        return perimeter;
    }
}


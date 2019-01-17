package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Measurable myShape2;

         myShape = new Square(4);
         myShape2 = new Rectangle(4, 5);

//        Rectangle box2 = new Square(5);
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());
//        System.out.println(box2.getPerimeter());



    }
}

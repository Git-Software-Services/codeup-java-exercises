package shapes;

public class Circle {
        private double radius;

    public Circle (double radius){
        this.radius = radius;
    }
        double getArea(){
            double area = Math.PI * (radius * radius);
            return area;
        }

        double getCircumference(){
            double circumference = Math.PI * 2 * radius;
            return circumference;
        }

}

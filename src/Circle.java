public class Circle {
    private double PI;
    private  double radius;

    public Circle(double PI, double radius) {
        this.PI = PI;
        this.radius = radius;
    }
    public static void area(double PI,double radius){

        System.out.println("площадь: "+PI*(radius*radius));

    }
    public static void circumference(double PI,double radius){
        System.out.println("длинна: " +PI*2*radius);


    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}

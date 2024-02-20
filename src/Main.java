import java.util.Scanner;

/**Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
жана circumference деген статик методдору болсун.
areaны табуу учун: PI * (radius * radius)
circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("пиши цифру PI ");

        double pi = new Scanner(System.in).nextDouble();
        System.out.print("пиши цифру radius ");
        double radius = new Scanner(System.in).nextDouble();

        Circle circle = new Circle(pi,radius);
        System.out.println(circle.toString());

        Circle.area(circle.getPI(), circle.getRadius());
        Circle.circumference(circle.getPI(), circle.getRadius());



    }
}
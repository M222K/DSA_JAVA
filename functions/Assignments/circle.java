
import java.util.*;

public class circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        float radius = sc.nextFloat();
        circle(radius);

    }

    static void circle(float rad) {
        double area = 3.14 * rad * rad;
        double circum = 2 * 3.14 * rad;
        System.out.println("the area is " + area);
        System.out.println("the circumference is " + circum);

    }

}

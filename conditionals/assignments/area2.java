import java.util.*;
import java.lang.Math;


public class area2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter side:");
        float a=sc.nextFloat();

        double area=(Math.sqrt(3)/4)*(a*a);
        System.out.println("the area of triangle is "+area);
    }
}

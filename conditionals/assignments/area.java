import java.util.*;
import java.lang.Math;
//area of isoceles triangle
public class area{
    public static void main (String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter base :");
        float a=sc.nextFloat();
        System.out.println("enter equal side  :");
        float b=sc.nextFloat();
        double c=(b*b)-((a*a)/4);
        double area= 0.5*b*(Math.sqrt(c));
        System.out.println("the area is "+area);



    }
}

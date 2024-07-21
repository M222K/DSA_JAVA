import java.util.*;

public class volume {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner sc= new Scanner (System.in);
       System.out.print("enter radius of cone:");
       float r=sc.nextFloat();
       double a=r*r;
       double b= 1.0/3.0;   //if directly written the whole thing would be equal to zero
       System.out.print("enter height of cone:");
       float h=sc.nextFloat();
      double volume=b*pi*a*h;
      System.out.println("voulume is:"+volume);
}
}

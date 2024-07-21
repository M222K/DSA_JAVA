import java. util.*;

public class product {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in );
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=mul(a,b);
        System.out.println(product);

    }
    static int mul(int a, int b){
      return (a*b);
    }
}

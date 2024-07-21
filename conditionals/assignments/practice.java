import java.util.*;

public class practice {

    // make a program to print fibonnaci series
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if (n == 0) {
            System.out.println(a);
        }else
        {System.out.print(a);
        System.out.print(b);}
    
        int i = 2;
        while (i<=n) {
            int temp = b;
            b = (a + b);
            System.out.print(b);
            a = temp;
            i++;
        }
    }
}

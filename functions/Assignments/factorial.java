
import java.util.*;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int num = sc.nextInt();
        factorial(num);

    }

    static void factorial(int a) {
        if (a == 0 || a == 1) {
            System.out.println("1");
        } else {
            int pro = a;
            int i = a - 1;
            while (i >= 1) { //can also use method with i=1 to n 
                pro = pro * i;
                i--;
            }
            System.out.println(pro);
        }
    }
}

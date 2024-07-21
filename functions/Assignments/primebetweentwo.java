
import java.util.*;

public class primebetweentwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the uppr bound number:");
        int a = sc.nextInt();
        System.out.println("enter the lower bound:");
        int b = sc.nextInt();
        checkprime(a, b);
    }

    static void checkprime(int a, int b) {
        for (int i = a+1; i < b; i++) {
            int j = 2;
            int flag = 1;
            while (j < i) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
                j++;
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
    }
}


import java.util.*;

public class sumofn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value upto n :");
        int num = sc.nextInt();
        int sum = sumofnum(num);
        System.out.println(sum);

    }

    static int sumofnum(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum=sum+i;
            i++;
        }
        return sum;
    }
}

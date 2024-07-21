
import java.util.*;

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        average();

    }

    static void average() {
        System.out.println("enter n numbers :");
        Scanner sc = new Scanner(System.in);
     double sum = 0;
        double  num;
        double count = 0;
        while (true) {
            num = sc.nextDouble();
            if (num == 0) {
                break;
            }
            sum = sum + num;
            count++;

        }
        System.out.println(sum/count);
    }
}

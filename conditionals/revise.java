import java.util.*;

public class revise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int num = sc.nextInt();

        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans = (ans * 10) + rem;
            num = num / 10;

        }
        System.out.println(ans);
    }
}
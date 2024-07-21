import java.util.*;

//check the number of times a digit occur in any number?

public class casecheck2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int num = sc.nextInt();
        System.out.println("enter number to check:");
        int n = sc.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == n) {
                count++;
            }

            num = num / 10;
        }

        System.out.println(count);
    }

}

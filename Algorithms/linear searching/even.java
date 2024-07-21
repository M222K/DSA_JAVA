
public class even {

    public static void main(String[] args) {
        int[] arr = {34, 5, 6, 324, 565, 7788};
        int ans = findnum(arr);
        System.out.println(ans);
    }

    static int findnum(int[] box) {
        int count = 0;
        for (int a : box) {
            if (even(a)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int a) {
        int digit = checkdigit(a);
        return digit % 2 == 0;

    }

    static int checkdigit(int a) {
        int count = 0;
        if (a < 0) {
            a = a * -1;
        }
        if (a == 0) {
            return 1;
        }
        while (a > 0) {
            count++;
            a = a / 10;
        }
        return count;
    }
}


import java.util.*;

public class maxvalue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {23, 566, 65, 23, 80, 4};
        System.out.println(max(arr));

    }

    static int max(int[] arr) {
        int larg = arr[0];
        for (int i = 1; i < arr.length; i++) {
            larg = Math.max(larg, arr[i]);
        }
        return larg;
    }
}

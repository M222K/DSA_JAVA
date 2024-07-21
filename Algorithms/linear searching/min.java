
public class min {

    public static void main(String[] args) {

        int[] arr = {22, 3, 4, 5, 24, 5, 6, -44, 54};
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);}
            return min;
    }
}

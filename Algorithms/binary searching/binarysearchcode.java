
public class binarysearchcode {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 34, 43, 45, 65, 76, 87, 89};
        int target = 87;
        int ans = bsearch(arr, target);
        System.out.println(ans);
    }

    static int bsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                return mid;
            }

        }
        return -1;

    }
}

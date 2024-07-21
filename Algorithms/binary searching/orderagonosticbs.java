public class orderagonosticbs {
    public static void main(String[] args) {
        // int[] arr = { 23, 34, 45, 56, 67, 878, 899 };
        int [] arr= {98,88,76,35,23,22,21,12};

        int target = 22;
        int ans = orderbs(arr, target);
        System.out.println(ans);
    }

    static int orderbs(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        // to check order of the search array;
        boolean isasc = arr[s] < arr[e];

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target == arr[mid]) {
                return mid;

            }
            if (isasc) {
                if (target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }

            } else {
                if (target < arr[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
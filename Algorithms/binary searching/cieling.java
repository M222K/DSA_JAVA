public class cieling {
    public static void main(String[] args) {
        int [] arr={34,45,66,67,78,88,98};
        int target=66;
        int ans=cielingno(arr,target);
        System.out.println(ans);

    }

    static int cielingno(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isasc = arr[start] < arr[end];

        if (target >arr[arr.length-1]){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == mid) {
                return mid;

            }

            if (isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
return start;
    }
}
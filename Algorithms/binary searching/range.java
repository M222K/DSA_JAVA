import java.util.Arrays;

public class range {
    public static void main(String[] args) {
        int [] arr={2,4,4,4,4,4,4,5,5,5,6};
        int target=3;
        int [] ans=range(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] range(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    static int search(int[] nums, int target, boolean findstartindex) {
        int start = 0;
        int end = nums.length - 1;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findstartindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }
        }
return ans;
    }
}
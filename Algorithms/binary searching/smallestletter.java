//for an increasing string array

public class smallestletter {
    public static void main(String[] args) {
    char [] name= {'a', 'g','m'};
    char target ='g';
    int ans = smallest(name, target);
    System.out.println(ans);

    }

    static int smallest(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= arr[mid])//code change for loop to execute after finding target
            {start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start==arr.length){
            return 0;
        }
        if (target>arr[arr.length-1]){
            return 0;
        }
        return start;
    }
}
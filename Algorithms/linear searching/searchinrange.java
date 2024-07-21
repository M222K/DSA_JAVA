
public class searchinrange {

    public static void main(String[] args) {
        //search in range of index  from 1 to 4
        int[] arr = {22, -3, 55, 33, 6, 7, 4, 34};
        int target = 55;
        int ranges = 1;
        int rangee = 4;
        System.out.println(search(arr, ranges, rangee, target));
    }

    static boolean search(int[] arr, int index1, int index2, int target) {
        for (int i = index1; i < (index2 + 1); i++) {
            if (target == arr[i]) {
                return true;
            }
        }
return false;
    }
}


public class max2d {

    public static void main(String[] args) {
        int[][] arr = {{23, 44, 42}, {45, 5, 4}, {33, 65, 77}};
        int maxvalue = max(arr);
        int max2=max2(arr);
        System.out.println("the maximum value is " + maxvalue);
        System.out.println("the maximum value is " + max2);

    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        return max;

    }
    static int max2(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int[] box: arr){
            for(int element:box){
                if (element>max){
                    max=element;
                }
            }
        }
        return max;

    }
}

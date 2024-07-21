import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        changevalue(arr);
        System.out.println(Arrays.toString(arr));
    
    }
 static void changevalue(int[]nums)
 {
    nums[0]=99;//here the object is change through refrence variable
    // and will also reflect in the orignal object

 }
}

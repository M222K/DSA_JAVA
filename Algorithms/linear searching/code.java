//to search a target in an array

public class code {

    public static void main(String[] args) {
        int[] arr = {22, 45, 564, 63, 55, 322, 21,};
        int target = 64;
        int ans = linearsearch(arr, target);
        int ans1=linearsearch2(arr,target);

        System.out.println(ans);
        System.out.println(ans1);

    }
    static int linearsearch(int[]arr,int value){
        if (arr.length==0){
            return -1;
        }
        //for searching value one by one
        for (int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==value){
                return i;
            }
        }
        return -1;
        //at end if no value is equal in array will return -1;

    }
    static int linearsearch2(int[]arr,int value){ //when we have to return the element value back
        if (arr.length==0){
            return Integer.MAX_VALUE;
        }
        //for searching value one by one
        for (int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==value){
                return element;
            }
        }
        return Integer.MAX_VALUE;  //passes a constant value 
        //at end if no value is equal in array will return -1;

    }//we can also return in format of boolean too.
}

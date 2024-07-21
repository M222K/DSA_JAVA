
import java.util.*;

public class input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //if small array input can be stored as;
        //this is array of primitves
        int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 1736;
        // arr[2] = 17368;
        // arr[3] = 828;
        // arr[4] = 39921;

        //or for loop for inputs n times;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+",");
        // }
        // for(int num:arr){
        //     System.out.print(num); 
        //     use to o/p frrom fro each loop.
        // }

        //or use arrays.toString

        //array of objects
        String [] str=new String[4];
        

    }
}

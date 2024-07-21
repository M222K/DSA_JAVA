
import java.util.Arrays;
import java.util.Scanner;

public class searchin2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int target = 44;

        //to input array;
        for (int i = 0; i < 3; i++) {
            System.out.println("enter numbers for row" + i);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }

        int [] ans=search(arr,target);

    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int [] {i,j};
                }
            }
        }
        return new int [] {-1,-1};

    }
}

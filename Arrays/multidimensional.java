import java.util.*;
public class multidimensional{
    public static void main(String[] args) {
        int [][] num=new int[2][2];  //declaring an 2d array
         Scanner sc=new Scanner(System.in);

        for(int row=0; row<num.length;row++){
            System.out.println("enter values for row "+row);
            for (int col=0;col<num[row].length;col++)
            {
                num[row][col]=sc.nextInt();

            }

        }

        // for(int row=0; row<num.length;row++){
        //     for (int col=0;col<num[row].length;col++)
        //     {
        //         System.out.print(num[row][col]+",");
                
        //     }
        //     System.out.println();

        // }

        //we can directly use array method

        for(int row=0; row<num.length;row++){
            System.out.println(Arrays.toString(num[row]));
        }




        
    }
}


import java.util.*;

public class multialist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //intialisation of arrrayList
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //to add elements
        for (int i = 0; i < 3; i++) {

            System.out.println("enter size of list" + i);
            int n=sc.nextInt();
            for (int j=0; j<n;j++ ){
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);

    }

}

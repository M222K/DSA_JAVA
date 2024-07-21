import java.util.*;

public class list {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> list=new ArrayList<>(6);
    // list.add(748);
    // list.add(7);
    // list.add(48);
    // list.add(8);
    // list.add(78);
    // list.add(448);
    // list.add(7348);
    // list.add(73455);

    // System.out.println(list);
    // System.out.println(list.contains(879));
    // list.set(3, 99999);
    // System.out.println(list);
    // list.remove(0);
    // System.out.println(list);

    //in order to add input by user
    for (int i=0;i<6;i++)
    {
        list.add(sc.nextInt());

    }
    for (int i=0;i<6;i++)
    {
        System.out.println(list.get(i));

    }

}    
}

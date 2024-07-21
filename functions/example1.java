import java.util.*;

public class example1 {
    public static void main(String[] args) {
      String myname=name();  
      System.out.println(myname);
    }
    static String name(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your full name:");
        String name=sc.nextLine();
    return name;

    }
}

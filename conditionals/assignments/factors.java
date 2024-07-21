import java.util.*;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int i=1;
        while(i<=Math.sqrt(num)){
            if(num%i==0){
                if(num/i==i){
                    System.out.println(i+",");
                }else{
                    System.out.println(i + "," + num/i +",") ;
                }
            }
            i++;
        }

    }
}

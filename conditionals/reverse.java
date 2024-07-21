import java.util.*;


public class reverse {
    public static void main(String[] args) {
        System.out.println("ENTER NUMBER:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;

        while(num>0){
        int digit=num%10;   
        ans=(ans*10)+digit;
        num=num/10;
        }
        System.out.println(ans);
    }
}

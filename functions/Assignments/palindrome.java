
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //palindrome is a number , when reversed the output is the equal to the same number.
        System.out.println("enter any number");
        int num=sc.nextInt();
        System.out.println(checkp(num));

    }
    static boolean checkp(int a){
        int orignal=a;
        int ans=0;
        while(a>0){
            int rem=a%10;
            ans=(ans*10)+rem;
            a=a/10;
        }
       return ans==orignal;
        }
    }


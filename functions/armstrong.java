//check a number is armstrong number;

import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter any number:");
        int n=in.nextInt();
        System.out.println(isarmstrong(n));
    }

    static boolean isarmstrong(int a)
    {   int orignal=a;
        int ans=0;
        while(a>0)
        {int rem=a%10;
        a=a/10;
        ans+=(rem*rem*rem);
        }
return ans==orignal;}
}

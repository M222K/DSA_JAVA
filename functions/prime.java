import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int n =sc.nextInt();
        System.out.println(isprime(n));
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){ //square root of n method 
            if(n%c==0){
                return false;
            }
        c++;
        }
        return c*c>n; //checks wrt to the last condition of loop after last iteration values 
    }
}

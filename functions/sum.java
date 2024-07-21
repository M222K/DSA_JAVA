import java .util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("enter number 1:");
        int num1=sc.nextInt();
        System.out.print("enter num2:");
        int num2 =sc.nextInt();
        int ans=sum(num1,num2);//arguments

        System.out.println(ans);
    }
    static int sum(int a,int b){//parameters
        int sum=a+b;
        return sum;
    }
}

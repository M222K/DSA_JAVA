// is even or odd?

import java.util.*;

public class method{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value to check=");
        int value=sc.nextInt();
        isevenodd(value);

    }
    static void isevenodd(int num){
        if(num%2==0){
            System.out.println("the value is even");}
            else{
                System.out.println("the value is odd");
            }
        }
    }

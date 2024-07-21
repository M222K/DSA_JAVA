import java.util.*;
import java.io.*;


// check how many times a n digit occursin a number? using string methods  

public class occur {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("enter number");
    String num=in.next();
    System.out.println("enter number to check");
    char n=in.next().charAt(0);
    int count=0;
    int i=0;
    while(i<num.length())
    {
        if(num.charAt(i)==n){
         count++;
        }
        i++;

    }

    System.out.println(count+"times occured");
    }
}

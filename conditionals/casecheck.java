import java.util.*;

public class casecheck{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char ch=in.next().trim().charAt(0);

        //.trim() : used to remove unwanted spaces from the string
        /*  .charAt(): is a function to call nth index of  array of characters that is string
    so that now a char data can store the value input from string type to char type */

    
        if (ch>='A' && ch<='Z')
        {
            System.out.println("uppercase");
        
        }else{
            System.out.println("lowercase");

        }


    }
}
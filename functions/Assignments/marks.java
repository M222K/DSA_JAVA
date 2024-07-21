
import java.util.*;

public class marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100");
        int num=sc.nextInt();
        String grade=grading(num);
        System.out.println(grade);
}
    static String grading(int a){
        String ans;
        if(a>=91 & a<=100){
            ans="AA";
        } 
        else if(a>=81 && a<=90){
            ans="AB";
        }
        else if(a>=61 && a<=70){
            ans="BC";
        }
        else if(a>=51 && a<=60){
            ans="CD";
        }
        else if(a>=41 && a<=50){
            ans="DD";
        }
        else if(a<40){
            ans="FAIL";
        }
        else{
            ans="enter valid marks";
        }
        return ans;
    }
}

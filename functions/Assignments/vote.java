import java.util.*;


public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:-");
        int age=sc.nextInt();
        checkstatus(age);
    }

    static void checkstatus(int age){
        if (age<18){
            System.out.println("You are not eligible for voting");
        }else{
            System.out.println("Congratulations! You are eligible for voting");
        }
    }
}

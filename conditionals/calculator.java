import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int ans=0;
            int a,b;
            System.out.print("ENTER OPERATOR:");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '*' || op == '-' || op == '/' || op == '%') {
                System.out.print("enter numbers:");
                a = sc.nextInt();
                b = sc.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b!='0'){
                    ans = a / b;
                }}
                if (op == '%') {
                    ans = a % b;
                }
            }else if (op=='x'|| op=='X')
            {break;}
            else{
                System.out.println("invalid operation");
            } 
            System.out.println(ans); } 
    }

}

import java.util.Scanner;
// function with no return type

/*public class greetings{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        greeting();
    }
    static void greeting()
    {
        System.out.println("hello World");
    }
}
*/

// we can personalise the greeting also by passing string value of our choice 

public class greetings{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your name :");
        String name=sc.next();
        String greeting= myGreet(name);
        System.out.println(greeting);
    }
    static String myGreet(String name){
        String message="hello "+ name;
        return message;
    }
}
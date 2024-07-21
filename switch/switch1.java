import java.util.*;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fruit:");
        String fruit = sc.next();

        switch (fruit) {
            case "mangoe" -> System.out.println("yellow");
            case "apple" -> System.out.println("red");
            case "chikoo" -> System.out.println("brown");
            case "banana" -> System.out.println("yellow");
            default -> System.out.println("enter a valid fruit");

        }
    }
}
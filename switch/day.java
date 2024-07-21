import java.util.*;

public class day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day number:");
        int day = sc.nextInt();

        /*switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursay");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("enter valid number");

        }*/

        //if want to make one o/p for multiple cases 

        switch(day){
            case 1,2,3,4,5->System.out.println("weekday");
            case 6,7->System.out.println("weekend");
        }

    }

}

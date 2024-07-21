
//26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

//sort numbers and then seperatly sum them .

import java.util.*;

public class kunal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumneg = 0;
        int sumeven = 0;
        int sumodd = 0;
       System.out.println("enter values :");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else if (num % 2 == 0 && num>0) {
                sumeven = sumeven + num;
            } else if (num < 0) {
                sumneg = sumneg + num;
            } else if (num % 2 != 0 && num>0) {
                sumodd = sumodd + num;
            }
        }

        System.out.println(sumneg);
        System.out.println(sumeven);
        System.out.println(sumodd);

    }
}

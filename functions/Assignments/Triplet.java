
//only when three numbers are given.
import java.util.*;

public class Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers to check:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(istriplet(a, b, c));

    }

    static boolean istriplet(int a, int b, int c) {
        int x = a * a;
        int y = b * b;
        int z = c * c;
        return x == y + z || y == x + z || z == x + y;
    } }

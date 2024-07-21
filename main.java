import java.util.*;

public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any character");
    char ch = sc.next().trim().charAt(0);

    if (ch >= 'a' & ch <= 'z') {
      System.out.println("lowercase");
    }
    if (ch >= 'A' & ch <= 'Z') {
      System.out.println("uppercase");
    }

  }
}
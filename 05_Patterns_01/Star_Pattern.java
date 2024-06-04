import java.util.Scanner;

public class Star_Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // ! reverse pattern printing

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i + 1); j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    sc.close();
  }
}
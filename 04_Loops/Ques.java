import java.util.Scanner;

public class Ques {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // do {
    // System.out.print("Enter a number ");
    // int n = sc.nextInt();
    // if (n % 10 == 0) {
    // break;
    // }
    // System.out.println(n);
    // } while (true);

    while (true) {
      System.out.print("Enter a number: ");
      if (sc.nextInt() % 10 == 0) {
        break;
      }
    }
    sc.close();
  }
}

// import java.util.Scanner;

// public class Ques {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// do {
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// if (n > 20) {
// break;
// }
// System.out.println(n);
// } while (true);
// sc.close();
// }
// }

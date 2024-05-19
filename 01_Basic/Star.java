// public class Star {
// public static void main(String[] args) {
// System.out.println("*******");
// System.out.println(" *****");
// System.out.println(" ***");
// System.out.println(" *");
// }
// }

public class Star {
  public static void main(String[] args) {
    int n = 4; // Number of rows

    for (int i = 0; i < n; i++) { // Loop for each row
      // Print leading spaces
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      // Print stars
      for (int j = 0; j < (2 * (n - i) - 1); j++) {
        System.out.print("*");
      }

      // Move to the next line
      System.out.println();
    }
  }
}

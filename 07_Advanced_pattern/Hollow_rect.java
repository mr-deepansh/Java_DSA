// Hollow Rectangle pattern

public class Hollow_rect {

  // * Hollow Rectangle pattern
  public static void pattern(int totRow, int totCol) {
    // ! outer loop for rows
    for (int i = 1; i <= totRow; i++) {

      // * inner loop for columns
      for (int j = 1; j <= totCol; j++) {
        if (i == 1 || i == totRow || j == 1 || j == totCol) {
          System.out.print(" * ");
        } else {
          System.out.print(" # ");
        }
      }
      System.out.println();
    }

  }

  // * Half Pyramid pattern
  public static void Half_Pyramid(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print("");
      }
      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void Number_Pyramid(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void floyds_triangle(int n) {
    int counter = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }

  public static void zero_one_triangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // pattern(7, 5);
    // Half_Pyramid(5);
    // Number_Pyramid(8);
    // floyds_triangle(5);
    zero_one_triangle(5);
  }

}
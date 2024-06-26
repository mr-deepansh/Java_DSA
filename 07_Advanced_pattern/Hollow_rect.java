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

  public static void Butterfly_Pattern(int n) {

    // Case First

    for (int j = 1; j <= n; j++) {
      for (int i = 1; i <= n; i++) {
        if (i <= j) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      for (int i = n; i >= 1; i--) {
        if (i <= j) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    // Case Second

    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void solid_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void Daimaond_pattern(int n) {
    // 1st half
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // 2nd half
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // pattern(7, 5);
    // Half_Pyramid(5);
    // Number_Pyramid(8);
    // floyds_triangle(5);
    // zero_one_triangle(5);
    // Butterfly_Pattern(4);
    // solid_rhombus(10);
    Daimaond_pattern(7);
  }

}
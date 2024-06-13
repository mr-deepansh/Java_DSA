// Hollow Rectangle pattern

public class Hollow_rect {
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

  public static void main(String[] args) {
    pattern(7, 5);
  }

}
/**
 * Passing_arg
 */
public class Passing_arg {

  public static void main(String[] args) {
    int noneChangeable = 210;
    int[] number = { 5, 8, 5, 7 };
    updateNumber(number, noneChangeable);
    System.out.println(noneChangeable);
    // print numbers
    for (int j : number) {
      System.out.println(j + " ");
    }
  }

  public static void updateNumber(int[] number, int noneChangeable) {
    noneChangeable = 19;
    for (int i = 0; i < number.length; i++) {
      number[i] = number[i] * 2;
    }
  }
}
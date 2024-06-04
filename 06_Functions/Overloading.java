
public class Overloading {
  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static float sum(float a, float b, float c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    System.out.println(sum(2, 3));
    System.out.println(sum(2, 3, 4));
    System.out.println(sum(2.5f, 3.5f, 4.5f));
  }
}
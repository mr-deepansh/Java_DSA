/**
 * Switch_op
 */
public class Switch_op {
  public static void main(String[] args) {
    int number = 9;
    switch (number % 2) {
      case 0:
        System.out.println("The number is Even");
        break;
      case 1:
        System.out.println("The number is Odd");
        break;
    }
    int mark = 43;
    int condition = (mark >= 33) ? 1 : 0;

    switch (condition) {
      case 1:
        System.out.println("The student is Pass");
        break;
      case 0:
        System.out.println("The student is Fail");
        break;
      default:
        System.out.println("Mark was not provided");
        break;
    }
  }

}
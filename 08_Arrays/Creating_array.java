/**
 * Creating_array
 */
public class Creating_array {

  public static void main(String[] args) {
    // * first way declaration of Array

    // int[] numbers = new int[5];
    // numbers[0] = 10;
    // numbers[1] = 20;
    // numbers[2] = 30;
    // numbers[3] = 40;
    // numbers[4] = 50;

    // * second way declaration of Array

    int[] numbers = { 10, 20, 30, 40, 50 };
    int[] moreNumbers = { 60, 70 };
    System.out.println("The first element is " + numbers[0]);
    System.out.println("The second element is " + numbers[1]);
    System.out.println("The third element is " + numbers[2]);
    System.out.println("The fourth element is " + numbers[3]);
    System.out.println("The fifth element is " + numbers[4]);
    System.out.println("The first element in moreNumbers is " + moreNumbers[0]);
    System.out.println("The second element in moreNumbers is " + moreNumbers[1]);

    // string array

    String[] fruits = { "Apple", "Banana", "Mango", "Orange" };
    System.out.println("The first fruit is " + fruits[0]);
    System.out.println("The second fruit is " + fruits[1]);
    System.out.println("The third fruit is " + fruits[2]);
    System.out.println("The fourth fruit is " + fruits[3]);
  }

}
/**
 * Find_largestN
 */
public class Find_largestN {
  public static void main(String[] args) {
    int number[] = { 1, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("Your Largest value is : " + getLargest(number));

  }

  public static int getLargest(int number[]) {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < number.length; i++) {
      if (number[i] > largest) {
        largest = number[i];
      }
      if (smallest > number[i]) {
        smallest = number[i];
      }
    }
    System.out.println("Your Smallest value is : " + smallest);
    return largest;
  }
}
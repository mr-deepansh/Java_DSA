
/**
 * Binary_search
 */
import java.util.Scanner;

public class Binary_search {
  public static void main(String[] args) {
    int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16 };
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the key to be searched : ");
    int key = sc.nextInt();
    int result = binarySearch(number, key);
    if (result == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Your Key is : " + key + " found at index : " + binarySearch(number, key));
    }
    sc.close();

  }

  public static int binarySearch(int number[], int key) {
    int start = 0, end = number.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (number[mid] == key) {
        return mid;
      } else if (number[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
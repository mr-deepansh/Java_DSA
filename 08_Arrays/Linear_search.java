/**
 * Linear_search
 */

import java.util.Scanner;

public class Linear_search {
  public static void main(String[] args) {
    int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the key to be searched : ");
    int key = sc.nextInt();
    int index = linearSearch(number, key);
    if (index == -1) {
      System.out.println("The key is not found");
    } else {
      System.out.println("The key is found at index " + index);
    }
    sc.close();
  }

  public static int linearSearch(int number[], int key) {
    for (int i = 0; i < number.length; i++) {
      if (number[i] == key) {
        return i;
      }
    }
    return -1;
  }
}

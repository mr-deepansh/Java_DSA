import java.util.*;

public class Input_arrays {

  public static void main(String[] args) {
    int[] marks = new int[5];
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Math marks: ");
    marks[0] = sc.nextInt();

    System.out.print("Enter your Physics marks: ");
    marks[1] = sc.nextInt();

    System.out.print("Enter your Chemistry marks: ");
    marks[2] = sc.nextInt();

    System.out.println("Your Math Subject marks is " + marks[0]);
    System.out.println("Your Physics Subject marks is " + marks[1]);
    System.out.println("Your Chemistry Subject marks is " + marks[2]);
    sc.close();
    System.out.println();

    // percentage calculation
    int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    System.out.println("Your overall percentage is " + percentage + "%");
  }
}

import java.util.Scanner;

public class BestIDE {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the IDE Recommender!");
    System.out.println("What kind of development are you interested in?");
    System.out.println("1. Java Development ");
    System.out.println("2. Web Development and DSA");
    System.out.println("3. Mobile App Development");
    System.out.println("4. General Purpose Development");
    System.out.println("5. Learning Java Language");

    System.out.print("Enter your choice (1-4): ");
    try {
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("For Java Development, IntelliJ IDEA or Eclipse are great choices!");
          break;
        case 2:
          System.out.println("For Web Development and DSA, consider using Visual Studio Code or WebStorm.");
          break;
        case 3:
          System.out.println("For Mobile App Development, Android Studio is the best option.");
          break;
        case 4:
          System.out.println("For General Purpose Development, Visual Studio Code is versatile and user-friendly.");
          break;
          case 5:
          System.out.println("For Learning Java Language, IntelliJ IDEA or Eclipse are great choices!");
        default:
          System.out.println("Invalid choice! Please select a valid option.");
      }
    } catch (Exception e) {
      System.out.println("An error occurred while reading your input!");
    }
    scanner.close();
  }
}

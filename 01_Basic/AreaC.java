import java.util.*;

public class AreaC {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle: ");
    float radius = sc.nextFloat();
    sc.close();

    float area = 3.14f * radius * radius;
    System.out.println("Area of circle is: " + area);
  }

}
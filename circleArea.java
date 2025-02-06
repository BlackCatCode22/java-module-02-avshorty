import java.util.Scanner;
public class circleArea {
    public static void main(String[] args) {
      Scanner area = new Scanner(System.in);
      System.out.println("Enter radius to get your area");
      double circum = area.nextDouble();
      circum= circum*3.14;
      System.out.print("Your area is "+ circum);
    }
}
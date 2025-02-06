import java.util.Scanner;
public class unicode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Character!");
        char character = scanner.next().charAt(0);
        int unicoreValue = character;
        System.out.println("Your character value is: "+unicoreValue);
    }
}
import java.util.Scanner;
public class simpleGreeting {
    public static void main(String[] args) {
    Scanner userName= new Scanner(System.in);
    String scanned = userName.next();
    System.out.println("Hello "+ scanned+ " Welcome back");
    }
}
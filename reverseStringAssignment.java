//andres villarreal module 2 assignment reverse string.
import java.util.Scanner;
public class reverseStringAssignment {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);

        System.out.println("I am your magic word genie watch me turn your words into a backwards mess");
        System.out.println("ENTER YOUR WORD/SENTENCE");
        String userWord = scanned.nextLine();
        String reversed = new StringBuilder(userWord).reverse().toString();
        System.out.println("Your reverse word/sentecne is"+reversed);
        scanner.close

    }
}

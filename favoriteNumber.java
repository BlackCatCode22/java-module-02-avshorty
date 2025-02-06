import java.util.Scanner;
public class favoriteNumber {
    public static void main(String[] args) {
        Scanner favNum = new Scanner(System.in);
        System.out.println("What is your favorite Number");
        int userNum = favNum.nextInt();
        System.out.println("Hmmmm number "+userNum+" is a great number!");

    }
}
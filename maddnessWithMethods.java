//andres villarreal MaddnessWithMethods assignment due date 2/9/25
import java.util.Scanner;
public class maddnessWithMethods {
    static void getTheInt() {
        System.out.println("Enter 2 numbers to compare and add.");
        Scanner scanned = new Scanner(System.in);
        int userNumber = scanned.nextInt();
        int userNumber2 = scanned.nextInt();
        System.out.println("The number you selected are: " + userNumber + " and " + userNumber2);
        compareTheInt( userNumber,userNumber2);
        addTheInt(userNumber,userNumber2);
        scanned.close();
    }

    static void compareTheInt(int userNumber, int userNumber2) {
        System.out.println("We will now compare your numbers.");
        if (userNumber == userNumber2) {
            System.out.println("The Numbers are equal");
        } else if (userNumber < userNumber2) {
            System.out.println(userNumber + " is less than " + userNumber2);
        } else {
            System.out.println(userNumber + "is greater than " + userNumber2);
        }
    }

    static void addTheInt(int userNumber, int userNumber2){
        System.out.println("We will now add your numbers together.");
        int result = userNumber+userNumber2;
        System.out.println("your answer is "+ result);
    }
    public static void main(String[] args) {
        getTheInt();
    }
}
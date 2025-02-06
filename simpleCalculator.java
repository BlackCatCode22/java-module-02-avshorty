import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        //display the cal option
        System.out.println("select an operation");
        System.out.println("1.ADD");
        System.out.println("2.SUBTRACT");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");

        System.out.println("Choose your Number!");
        double number1 = cal.nextDouble();
        System.out.println("Choose Your next number!");
        double number2 = cal.nextDouble();
        System.out.println("Choose your operation");
        int choice = cal.nextInt();
        double result = 0;
        switch (choice){
            case 1:
                result = number1 + number2;
            break;
            case 2:
                result = number1 - number2;
                break;
            case 3: result = number1 * number2;
            break;
            case 4: result = number1 / number2;
            break;
            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("Your Answer is "+result+"!");
    }
}
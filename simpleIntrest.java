import java.util.Scanner;
public class simpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intrest Calculator");
        System.out.println("What is your principal?(in $)");
        int principal = scanner.nextInt();
        System.out.println("what is the intrest rate?(in decimals)");
        double intrest = scanner.nextDouble();
        System.out.println("How long is the loan in months?");
        double time = scanner.nextDouble();
        double finalAmountPaid = principal * intrest* time;
        System.out.println("Your princiapal of "+principal+ " will be paid off in "+time+" months and the final amount that will be paid will be "+
              finalAmountPaid  );
    }
}
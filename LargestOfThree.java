import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        System.out.println("Enter three numbers to compare.");
        int num1 = scanned.nextInt();
        int num2 = scanned.nextInt();
        int num3 = scanned.nextInt();
        int caseValue;
        if(num1==num2 && num2==num3){
           caseValue= 0;
        }else if (num1>num2 && num2>num3){
            caseValue= 1;
        }else if(num1<num2 && num2>num3){
            caseValue= 2;
        }else if(num1<num2 && num2<num3){
            caseValue= 3;
        }else{
            caseValue= 4;
        }
        switch(caseValue){
            case 0:
                System.out.println("All numbers are equal");
                break;
            case 1:
                System.out.println(num1+" is the largest.");
                break;
            case 2:
                System.out.println(num2 + " is the largest");
                break;
            case 3:
                System.out.println(num3 +" is the largest");
                break;
            case 4:
                System.out.println("More complex algorithm required.");
        }
    }
}
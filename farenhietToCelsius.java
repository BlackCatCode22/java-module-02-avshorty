import java.util.Scanner;
public class farenhietToCelsius {
    public static void main(String[] args) {
        Scanner Temp = new Scanner(System.in);
        System.out.println("What is the temp in Fahrenheit to convert to Celsius?");
        double farenheit = Temp.nextDouble();
       double celsius  = (farenheit-32)*5/9;
        System.out.println("Your temperature in Fahrenheit converted to Celsius is "+celsius);
    }
}
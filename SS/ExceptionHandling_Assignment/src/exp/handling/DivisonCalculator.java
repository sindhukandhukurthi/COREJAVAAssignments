package exp.handling;
import java.util.Scanner;
public class DivisonCalculator {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double numerator = sd.nextDouble();
        System.out.print("Enter the second number: ");
        double denominator = sd.nextDouble();
        
        try {
            double result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        sd.close();
    }

    public static double divideNumbers(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}




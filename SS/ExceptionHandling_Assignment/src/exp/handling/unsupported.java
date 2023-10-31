package exp.handling;

	import java.util.Scanner;
	public class unsupported {
	    public static void main(String[] args) {
	        Scanner sd = new Scanner(System.in);

	        try {
	 
	            System.out.print("Enter the first number: ");
	            double numerator = sd.nextDouble();
	            System.out.print("Enter the second number: ");
	            double denominator = sd.nextDouble();
	            if (denominator == 0) {
	                throw new UnsupportedOperationException("Division by zero is not allowed.");
	            }
	            double result = numerator / denominator;
	            System.out.println("Result: " + result);
	        } catch (UnsupportedOperationException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (java.util.InputMismatchException e) {
	            System.out.println("Error: Please enter valid numbers.");
	        } finally {
	            sd.close();
	        }
	    }
	}



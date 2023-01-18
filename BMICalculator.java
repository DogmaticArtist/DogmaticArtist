import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, pounds, inches;
		
		System.out.print( "Your height in inches: ");
		inches = keyboard.nextDouble(); 
		m = inches / 39.3701;
		
		System.out.print( "Your weight in pounds: ");
		pounds = keyboard.nextDouble();
		kg = pounds / 2.2;
		
		bmi = kg /(m*m);
		
		System.out.print( "Your BMI is " + bmi );
	}
}
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		int choice;
		double height, weight, BMI;
		Scanner scnr = new Scanner(System.in);

		System.out.printf("Please choose one of the following option:\n");
		System.out.printf("Choice 1: BMI = (703*WeightInPounds)/((HeightInInches)^2)\n");
		System.out.printf("Choice 2: BMI = (WeightInKilograms)/((HeightInMeter)^2)\n");
		System.out.printf("Enter '1' for option one and '2' for option two\n");
		System.out.printf("Choice Selected: ");
		choice = scnr.nextInt();
		
		 
		if(choice == 1)
		{
			System.out.printf("\nPlease enter your weight in pounds:");
			weight = scnr.nextDouble();
			System.out.printf("Please enter your height in inches:");
			height = scnr.nextDouble();
			BMI = (703.0 * weight) /(height*height);
			System.out.printf("Your BMI is:%.3f\n", BMI);
			System.out.printf("\nBMI Categories:");
			System.out.printf("\nUnderweight = <18.5\n");
			System.out.printf("Normal weight = 18.5–24.9\n");
			System.out.printf("Overweight = 25–29.9\n");
			System.out.printf("Obesity = BMI of 30 or greater\n");
			
		}
		if(choice == 2)
		{
			System.out.printf("Please enter your weight in Kilograms:");
			weight = scnr.nextDouble();
			System.out.printf("Please enter your height in Meters:");
			height = scnr.nextDouble();
			BMI = (weight) / (height*height);
			System.out.printf("Your BMI is:%.3f\n", BMI);
			System.out.printf("\nBMI Categories:");
			System.out.printf("\nUnderweight = <18.5\n");
			System.out.printf("Normal weight = 18.5–24.9\n");
			System.out.printf("Overweight = 25–29.9\n");
			System.out.printf("Obesity = BMI of 30 or greater\n");
		}
		else 
		{
			System.exit(0);;
		}

	}

}

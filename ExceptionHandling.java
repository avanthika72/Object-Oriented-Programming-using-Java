import java.util.Scanner;
public class Exc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		char ch;
		int choice;
		do {
			System.out.println("Choose an operation: \n1. Arithmetic operation \n2. Array access");
			choice = sc.nextInt();
			switch(choice) {
				case 1:				//Arithmetic operation
					try {
						System.out.println("Enter numerator: ");
						int numerator = sc.nextInt();
						System.out.println("Enter denominator: ");
						int denominator = sc.nextInt();
						int result = numerator/denominator;
						System.out.println("Result = "+result);
					} catch (ArithmeticException e) { 
						System.out.println("Caught an exception: "+e.getMessage());
					}
					break;
				case 2:				//Array access
					int[] numbers = {1,2,3};
					try {
						System.out.println("Enter an array index to access: ");
						int index = sc.nextInt();
						System.out.println("Element at index "+index+": "+numbers[index]);
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Caught an exception: "+e.getMessage());
					}
					break;
				default:
					System.out.println("Invalid choice. Please select 1 or 2");
					break;
			}
			System.out.println("Do you want to continue? (y/n)");
			ch = sc.next().charAt(0);
			System.out.println();
		} while (ch == 'Y'||ch == 'y');
		sc.close();
} }

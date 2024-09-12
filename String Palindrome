import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to check if palindrome: ");
		String str = sc.nextLine();
		int len = str.length();
		int flag = 0;
		for (int i = 0; i < len/2; i++) {
			if (str.charAt(i) != str.charAt(len-i-1)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) 
			System.out.println("Given string is a palindrome.");
		else 
			System.out.println("Given string is not a palindrome.");
		sc.close();
	}
}

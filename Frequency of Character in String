import java.util.Scanner;
public class FrequencyStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter a character whose frequency is to be found: ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Count of character '"+ch+"' in the string '"+str+"' = "+count);
		sc.close(); 
	}
}

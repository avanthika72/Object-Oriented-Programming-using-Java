import java.util.*;
public class StringTokenEg {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of integers with one space gap:");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		while (st.hasMoreTokens()) {
			String a = st.nextToken();
			int n = Integer.parseInt(a);
			System.out.println(n);
			sum += n;
		}
		System.out.println("Sum of the numbers = "+sum);
		sc.close();
} }

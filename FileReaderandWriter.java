import java.io.*;
import java.util.*;
public class ReadWrite {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			File myObj = new File("Register1.txt");
			myObj.createNewFile();
			System.out.println("Register1.txt created \n");
			FileWriter fout = new FileWriter("Register1.txt");
			System.out.println("Enter KEAM rank number:");
			int n = sc.nextInt();
			fout.write(n+"\n");
			fout.close();
			System.out.println("Data Added");
			FileReader fin = new FileReader("Register1.txt");
			BufferedReader br = new BufferedReader(fin);
			String line;
			System.out.println("Contents of Register1.txt : ");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			sc.close(); 
		} catch (IOException e) {
			System.out.println("Exception occured: "+e.getMessage());
} } }

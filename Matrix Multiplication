import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the first matrix A, m1 and n1:");
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		System.out.println("Enter the number of rows and columns of the second matrix B, m1 and n1:");
		int m2 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 != m2) {
			System.out.println("Matrix multiplication not possible!");
			sc.close();
			return;
		}
		int A[][] = new int[m1][n1];
		int B[][] = new int[m2][n2];
		int C[][] = new int[m1][n2];
		System.out.println("Enter the elements of matrix A:");
		for (int i=0; i<m1; i++) {
			for (int j=0; j<n1; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix B:");
		for (int i=0; i<m2; i++) {
			for (int j=0; j<n2; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<m1; i++) {
			for (int j=0; j<n2; j++) {
				C[i][j] = 0;
				for(int k=0; k<n1; k++) {
					C[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		System.out.println("The matrix A is:");
		for (int i=0; i<m1; i++) {
			for (int j=0; j<n1; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("The matrix B is:");
		for (int i=0; i<m2; i++) {
			for (int j=0; j<n2; j++) {
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("The product matrix is:");
		for (int i=0; i<m1; i++) {
			for (int j=0; j<n2; j++) {
				System.out.print(C[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}

import java.util.Scanner;
class Employee {
	double salary, DA, HRA, salary1;
	Employee(double salary, double DA, double HRA) {
		this.salary = salary;
		this.DA = DA;
		this.HRA = HRA;
	}
	void display() {
		System.out.println("EMPLOYEE");
	}
	void calcSalary() {
		salary1 = salary + salary*(DA/100) + salary*(HRA/100);
		System.out.println("Gross Salary of the Employee = "+salary1);
} }
class Engineer extends Employee {
	Engineer(double salary, double DA, double HRA) {
		super(salary, DA, HRA);
	}
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("ENGINEER");
	}
	void calcSalary() {
		System.out.println("Gross Salary of the Engineer = "+(salary1*2));
} }
public class MethodOverriding {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the basic salary of the Employee:");
		double empsalary = sc.nextDouble();
		System.out.println("Enter DA% of Employee:");
		double da = sc.nextDouble();
		System.out.println("Enter HRA% of Employee:");
		double hra = sc.nextDouble();
		Engineer e = new Engineer(empsalary,da,hra);
		e.display();
		e.calcSalary();
		sc.close();
} }

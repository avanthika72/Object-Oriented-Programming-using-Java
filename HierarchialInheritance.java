import java.util.Scanner;
class Employee {
	String name,address;
	int age;
	long phoneno;
	double salary;
	Employee(String empName,int empAge,long empPhone,String empAddress,double empSalary) {
		name = empName;
		age = empAge;
		phoneno = empPhone;
		address = empAddress;
		salary = empSalary;
	}
	void printEmployee() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone number: "+phoneno);
		System.out.println("Address: "+address);
	}
	void printSalary() {
		System.out.println("Salary: "+salary);
	}
}
class Officer extends Employee {
	String specialization;
	Officer(String empName,int empAge,long empPhone,String empAddress,double empSalary,String empSpecialization) {
		super(empName,empAge,empPhone,empAddress,empSalary);
		specialization = empSpecialization;
	}
	void printSpecialization() {
		System.out.println("Specialization: "+specialization);
	}	
}
class Manager extends Employee {
	String department;
	Manager(String empName,int empAge,long empPhone,String empAddress,double empSalary,String empDepartment) {
		super(empName,empAge,empPhone,empAddress,empSalary);
		department = empDepartment;
	}
	void printDepartment() {
		System.out.println("Department: "+department);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of Officer");
		System.out.println("Enter Name:");
		String offname = sc.next();
		System.out.println("Enter Age:");
		int offage = sc.nextInt();
		System.out.println("Enter Phone Number:");
		long offphno = sc.nextLong();
		System.out.println("Enter Address:");
		String offaddrs = sc.next();
		System.out.println("Enter Salary:");
		double offsal = sc.nextDouble();
		System.out.println("Enter Specialization:");
		String offspc = sc.next();
		Officer off = new Officer(offname,offage,offphno,offaddrs,offsal,offspc);
		System.out.println();
		
		System.out.println("Enter the details of Manager");
		System.out.println("Enter Name:");
		String mgname = sc.next();
		System.out.println("Enter Age:");
		int mgage = sc.nextInt();
		System.out.println("Enter Phone Number:");
		long mgphno = sc.nextLong();
		System.out.println("Enter Address:");
		String mgaddrs = sc.next();
		System.out.println("Enter Salary:");
		double mgsal = sc.nextDouble();
		System.out.println("Enter Department:");
		String mgdep = sc.next();
		Manager mg = new Manager(mgname,mgage,mgphno,mgaddrs,mgsal,mgdep);
		System.out.println();
		
		System.out.println("DETAILS OF OFFICER");
		off.printEmployee();
		off.printSalary();
		off.printSpecialization();
		System.out.println();
		System.out.println("DETAILS OF MANAGER");
		mg.printEmployee();
		mg.printSalary();
		mg.printDepartment();
		
		sc.close();
	}
}

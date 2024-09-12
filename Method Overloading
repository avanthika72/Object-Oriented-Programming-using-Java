import java.util.Scanner;
class MethodOv {
	void area(double r) {
		System.out.println("Area of circle = "+3.14*r*r);
	}
	void area(int l, int b) {
		System.out.println("Area of rectangle = "+l*b);
	}
	void area(double b, double h) {
		System.out.println("Area of triangle = "+0.5*b*h);
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodOv mo = new MethodOv();
		System.out.println("Enter radius of the circle: ");
		double radius=sc.nextDouble();
		mo.area(radius);
		System.out.println("Enter length and breadth of the rectangle: ");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		mo.area(length,breadth);
		System.out.println("Enter base and height of the triangle: ");
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		mo.area(base,height);
		sc.close();
	}
}

package CS046;

import java.util.Scanner;

public class CircleDemo {
	public static void main(String [] args)
	{
		int radius;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = scanner.nextInt();
		System.out.println("The area is " + Circle.Area(radius));
		System.out.println("The perimeter is " + Circle.Perimeter(radius));
	}
}

package CS046;

import java.util.Scanner;

public class PosNeg {
	
		public static void main(String args[])
		{
		int n;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter a number");
		n=scanner.nextInt();
		
		if(n>0)
			System.out.println("Positive");
		else if(n<0)
			System.out.println("negative");
		else if(n==0)
			System.out.println("zero");
		}

}

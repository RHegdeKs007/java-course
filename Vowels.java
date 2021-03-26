package CS046;

import java.util.Scanner;

public class Vowels {
	public static void main(String args[])
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a char");
		char s=scanner.next().charAt(0);
		boolean flag=false;
		switch(s)
		{
		case 'A' :flag=true;
		case 'a' :flag=true;
		case 'E' :flag=true;
		case 'e' :flag=true;
		case 'I' :flag=true;
		case 'i' :flag=true;
		case 'O' :flag=true;
		case 'o' :flag=true;
		case 'U' :flag=true;
		case 'u' :flag=true;
			
			break;
			
		}
		if(flag==true)
			System.out.println("vowel");
		else
		{
			System.out.println("consonent");
		}
	}

}

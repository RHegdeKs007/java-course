package CS046;

import java.util.Scanner;

public class Concatenate {
    public static void main(String args[])
    {
    	String capital;
    	String country;
    	String output;
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("enter a country name:");
    	country=scanner.next();
    	System.out.println("enter the capital:");
    	capital=scanner.next();
    	
    	output=capital +"\t"+country;
    	System.out.println(output);
    			
    }
}

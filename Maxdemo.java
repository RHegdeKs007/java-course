package CS046;

import java.util.Scanner;

public class Maxdemo {
      public static void main(String args[])
      {
    	  int a,b;
    	  Scanner scanner=new Scanner(System.in);
    	   System.out.println("enter 2 numbers");
    	   
    	   a=scanner.nextInt();
    	   b=scanner.nextInt();
    	   
    	   System.out.println(Math.max(a,b));
      }
}
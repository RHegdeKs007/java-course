package CS046;

import java.util.Scanner;

public class CalculatorDemo {
 public static void main(String args[])
 {
	 int a,b;
	 int option;int result=0;
	 
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("enter two numbers:");
	 a=scanner.nextInt();
	 b=scanner.nextInt();
	 
	 System.out.println("1.ADD");
	 System.out.println("2.SUB");
	 System.out.println("3.MUL");
	 System.out.println("4.DIV");
	 System.out.println("5.MOD");
	 
	 System.out.println("enter the option");
	 option=scanner.nextInt();
	 
	 switch(option)
	 {
	 case 1:result = Calculator.add(a, b);
	          break;
	 case 2: result=Calculator.sub(a, b);
	          break;
	 case 3: result=Calculator.mul(a, b);
	         break;
	 case 4:  result=Calculator.div(a, b);
	         break;
	 case 5: result=Calculator.mod(a, b);
	        break;
	       
	        
	 }
 System.out.println(result);
 }
}

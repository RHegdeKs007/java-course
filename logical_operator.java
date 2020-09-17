package cs046;

public class logical_operator {
         public static void main(String[] args) {
        	 int x = 5;
        	    System.out.println(x > 3 && x < 10);
        	    // returns true because 5 is greater than 3 AND 5 is less than 10
        	    //--------------------------------------------------------------------------------------
        	    int x1 = 5;
        	    System.out.println(x1 > 3 || x1 < 4);
        	    // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
        	  //---------------------------------------------------------------------------------------------
        	    int x2 = 5;
        	    System.out.println(!(x2 > 3 && x2 < 10)); 
        	    // returns false because ! (not) is used to reverse the result
         }
         
}

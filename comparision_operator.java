package cs046;

public class comparision_operator {
	public static void main(String[] args) {
		//==------------------------------------------------------------------------------------
		  int x = 5;
		    int y = 3;
		    System.out.println(x == y); // returns false because 5 is not equal to 3
		    //----------------------------------------------------------------------------------------
		    int x1 = 5;
		    int y1 = 3;
		    System.out.println(x1 != y1); // returns true because 5 is not equal to 3
		    //------------------------------------------------------------------------------------------
		    int x2 = 5;
		    int y2 = 3;
		    System.out.println(x2 > y2); // returns true because 5 is greater than 3
		    //------------------------------------------------------------------------------------------
		    int x3 = 5;
		    int y3 = 3;
		    System.out.println(x3 < y3); // returns false because 5 is not less than 3
		    //---------------------------------------------------------------------------------------------
		    int x4 = 5;
		    int y4 = 3;
		    System.out.println(x4 >= y4); // returns true because 5 is greater, or equal, to 3
		    //-------------------------------------------------------------------------------------------
		    int x5 = 5;
		    int y5 = 3;
		    System.out.println(x5 <= y5); // returns true because 5 is greater, or equal, to 3
	}

}

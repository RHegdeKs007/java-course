package cs046;

public class casting {
	public static void main(String[] args) {
		//widening casting.
		int myint=34;
		double mydouble=myint;//automatic conversion from integer to double
		  System.out.println(myint);
	      System.out.println(mydouble);
	   
	      //narrowing casting.
	      double myd=65.8d;
	      int myi=(int)myd;// manually converting double to integer.
	      System.out.println(myd);
          System.out.println(myi);	      
	}

}

package cs046;

public class string_operations {
	public static void main(String[] args) {
		String name="RK";
		 System.out.println("Hello" + name);
	//-------------------------------------------------------------------------------------
	//length()
	String text="abcdefghijklmnopqrstuvwxyz";
	System.out.println("Length of the string="+ text.length());
	//upper and lower case-----------------------------------------------------------------
	String r="Star Wars";
	System.out.println("uppercase="+ r.toUpperCase());
	System.out.println("lowercase="+ r.toLowerCase());
	//finding a character------------------------------------------------------------------
	String x="naval criminal investigative service";
	System.out.println(x.indexOf("invest"));
	////concatenate------------------------------------------------------------------------
	 String firstname="Rakshith";
	 String lastname="Hegde";
	System.out.println(firstname +" "+ lastname);
	//or
	String fullname=firstname+lastname;
	System.out.println(fullname);
	//or
	String fname="Darth ";
	String lname="Vader";
    System.out.println(fname.concat(lname)); 
	//----------------------------------------------------------------------------
	//special characters.
    String txt="it\'s alright";
    System.out.println(txt);
    //
    String txt1= "My Name is \"obi-wan kanobi\" and I am a Jedi knight";
	System.out.println(txt1);
	//
	String txt2 = "The character \\ is called backslash.";
    System.out.println(txt2);
    //----------------------------------------------------------------------------
	}

}

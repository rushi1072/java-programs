
//VARIOUS METHODS IN STRING

class str{
	public static void main (String[]args){
		String Fname="   Rush  ikesh   ";
		String Lname="Pawar";
		Fname= Fname.trim();//Trim Method is used to remove the spaces before and after  but this mehod dose not remove in between sapce
		System.out.println(Fname+" "+Lname);
	int a=1072;
	String s1="ruShikESH";
	System.out.println(s1.toUpperCase());//to convert string in uppercase
	System.out.println(s1.toLowerCase());//to convert string in lowercase
	System.out.println("==============================");
		System.out.println(s1.startsWith("a"));//to Check weather string starts eith given letter
		System.out.println(s1.endsWith("H"));//to Check weather ending starts eith given letter
			
		System.out.println("==============================");
		
		System.out.println(s1.charAt(5));// it shows the character present in given string at given index
		System.out.println("==============================");
		
		System.out.println(s1.indexOf("h"));//to show index
		
		System.out.println("==============================");
		System.out.println(s1.length());//to show length of string
		
		System.out.println("==============================");
		System.out.println(s1.valueOf(a));//to show Value of variable in Sring

			System.out.println("==============================");

		//To replace value in string
		String s2="JAVA IS PROGRAMING LANGUAGE";
		System.out.println(s2);
		System.out.println(s2.replace("PROGRAMING", "Globle"));
		System.out.println(s2.replaceAll("A","e"));
		
		
		System.out.println("==============================");
		
		// compare
		String ss="Java";
		String aa="Java";
		System.out.println(ss.compareTo(aa));//To compare values
		System.out.println(ss.equals(aa));//to check values are equal or not
		System.out.println(ss==aa);	
		
		
	
	
	}
}

class strbuff{
	public static void main(String[]args){
		//TO CHECK CAPACITY OF STRING BUFFER
	StringBuffer b=new StringBuffer();
	System.out.println(b.capacity());
	
	StringBuffer b1= new StringBuffer(100);
	System.out.println(b1.capacity());
	
	StringBuffer b2=new StringBuffer("Welcome");
	System.out.println(b2.capacity());
	
	StringBuffer b3=new StringBuffer("India is my country");
	System.out.println(b3.capacity());
	
	
	//TO ADD VALUES IN STRING BUFFER WE USE APPEND 
	StringBuffer b4= new StringBuffer("JAVA");
	System.out.println(b4.append("   PROGRAMMING"));
	
	//TO REVERSE
		System.out.println(b4.reverse());
		
		// 	TO INSERT
		
		StringBuffer b5= new StringBuffer("MY Country");
		System.out.println(b5.insert(1,"core"));
	}
}
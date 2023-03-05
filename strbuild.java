class strbuild{
	public static void main(String []args){
		StringBuilder s1= new StringBuilder();
		System.out.println(s1.capacity());
		
		StringBuilder b1= new StringBuilder(100);
	System.out.println(b1.capacity());
	
	StringBuilder b2=new StringBuilder("Welcome");
	System.out.println(b2.capacity());
	
	StringBuilder b3=new StringBuilder("India is my country");
	System.out.println(b3.capacity());
	
	//TO ADD VALUES IN STRING BUFFER WE USE APPEND 
	StringBuilder b4= new StringBuilder("JAVA");
	System.out.println(b4.append("   PROGRAMMING"));
	
	//TO REVERSE
		System.out.println(b4.reverse());
		
		// 	TO INSERT
		
		StringBuilder b5= new StringBuilder("MY Country");
		System.out.println(b5.insert(1,"core"));
	}
}
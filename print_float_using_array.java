class ar3{//Array reverse
	public static void main(String[]args){
		double a[]={1.1,2.1,3.1,4.1,5.1,6.1,7.1,8.1,9.1,10.1,11.1,12.1,13.1};
		
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}
		
		
		System.out.println("============================");
		// Insert Float values in array using for () loop
		float [] s=new float[21];
		
		for(int i=0;i<s.length;i++){
			s[i]=(float)((0.1*i)+1);
		//	System.out.println(s[i] + " " + i);
		}
		for(float i:s){
			System.out.println(i);
			
		}
		
	}
}
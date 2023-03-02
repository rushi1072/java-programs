import java.util.*;

class ar{
	public static void main(String[]args){
		int a[]= new int[7];
		 a[0]=20;
		// a[7]=30; we can not retrive because size=6
		 a[5]=10;
		 a[4]=47321;
		 a[3]=123;
		 a[1]=1000;
		 a[6]=80;
		 //a[-1]=234;// no such position
		 a[2]=123;
		
		//System.out.println(a);// it will gives the memory adress.
		//System.out.println(a[6]);
		
		// USING FOR LOOP
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+"\n");
		}
		
		
		//USING FOR EACH LOOP
		
		System.out.println("\n");
		for(int j:a){
			System.out.println(j);
		}
		
		// USING TO STRING METHOD
		
		System.out.println(Arrays.toString(a));// to print array in whole line
		
		
		
		

	}   
	
}
class arloop{// SHOW THE VALUES OF ARRAY UPTO THE DESIRED POSITION
	public static void main(String[]args){
		int a[]=new int[7];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		for(int i=0;i<a.length;i++){
			
			if(i==5){
				break;
			}
			System.out.println(a[i]);
			
		}
		//RETRIVING THE VALUES OF ARRAY WHICH ARE NOT DECLAIRED IN POSITION
	System.out.println("\n");
	int b[]=new int [100];
	b[0]=100;
	b[1]=200;
	b[2]=300;
	b[3]=400;
	b[4]=500;
	b[5]=600;
	b[6]=700;
	b[7]=800;
	b[8]=900;
	b[9]=1000;
	
	System.out.println(b[11]);
	for( int j:b){
		System.out.println(j);
	}
	}
}
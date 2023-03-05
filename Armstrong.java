public class Armstrong{
	public static void main(String args[]){
		//int prevnum=0;
		int ans=0;
		int num=123;
		int temp=num;
		while(num!=0)
		{
			int digit=num%10;
			num=num/10;
			ans=digit*digit*digit+ans;
		}
		if(temp==ans){
			System.out.println("Armstrong");
		}
		
		else{
			System.out.println("not Armstrong");
	    }
     }
}
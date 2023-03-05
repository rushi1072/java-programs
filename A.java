public class Sum{
	public static void main(String args[]){
		//int prevnum=0;
		int ans=1;
		int num=1234;
		int temp=num;
		while(num!=0)
		{
			int digit=num%10;
			num=num/10;
			ans=ans*digit;
		}
		System.out.println(ans);
     }
}
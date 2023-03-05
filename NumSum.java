import java.util.*;
/*class NumSum{
	public static void main(String [] args){
			int prevnum=0;
			
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no to check weather it is palindrom or not");
		int num=sc.nextInt();
		int temp=num;
		while(num!=0)
		{
			int digit=num%10;
			num=num/10;
			prevnum=prevnum*10+digit;
		}
		if(temp==prevnum){
			System.out.println(prevnum);
			System.out.println("palindrom");
		}
		
		else{
			System.out.println(prevnum);

			System.out.println("not palindrom");
			}
}
}
class Armstrong{
	
	public static void main(String[]args){
			int ans=0;
				// prevnum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no to check weather it is  or not");
		int num=sc.nextInt();
		int temp=num;
		while(num!=0)
		{
			int digit=num%10;
			num=num/10;
			ans = digit*digit*digit+ans;
		}
		if(ans==temp){
			System.out.println(ans);
			System.out.println("Amstrong");
		}
		
		else{
			
			System.out.println("not Amstrong");
	} 
	
}
}*/

class SumOfDigits{
	public static void main(String [] args){
			int prevnum=0;
			int ans=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no to check weather it is palindrom or not");
		int num=sc.nextInt();
	
		while(num!=0)
		{
			int digit=num%10;
			num=num/10;
			ans=digit+ans;
		}
		System.out.println("the ans is"+""+ans);
}

}
class MultOfDigits{
	public static void main(String [] args){
			int prevnum=0;
			int ans=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no to check weather it is palindrom or not");
		int num=sc.nextInt();
	
		while(num!=0)
		{
			int digit=num%10;
			num=num/10;
			ans=digit*ans;
		}
		System.out.println("the ans is"+""+ans);
}
}



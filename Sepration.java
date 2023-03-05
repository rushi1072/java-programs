import java.util.Scanner;
public class Sepration{
	public static void main(String args[]){
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
		/*if(temp==prevnum){
			System.out.println(prevnum);
			System.out.println("palindrom");
		}
		
		else{
			System.out.println(prevnum);

			System.out.println("not palindrom");
	    }*/
		System.out.println(prevnum);
		
     }
}
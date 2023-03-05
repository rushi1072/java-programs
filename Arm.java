
 import java.util.Scanner;
class Arm{
public static void main (String []args)
{
   int prenum=0;
   
   Scanner sc=new Scanner(System.in);
   System.out.println("enter  number");
   int num=sc.nextInt();
   int temp=num;
    while (num!=0)
	{
	 int digit = num%10;
	 num=num/10;
	// ans=digit*digit*digit+ ans;
	//ans=digit + ans;
	prenum=prenum*10+digit;
	
	 }
	 if (temp==prenum)
	 {
	 System.out.println("this is palindrome");
	 }
	 else
	 {
	  System.out.println("this is not palindrome");
	  }
	 //System.out.println(ans);
	 
	/* if (temp==ans)
	 
	 {
	 System.out.println("this is armstrong");
	 }
	 else
	 {
	  System.out.println("this is not armstrong");
	  }*/
	  }
	  }
class hollow{
	public static void main(String[]args)
	{
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if((j==0)||(i==8)||(i==j))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
					
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<=8;i++)
		{
			for(int j=i;j<=8;j++)
			{
				if((i==0)||(j==8)||(i==j))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
					
				}
			}
			System.out.println();
		}
	}
}
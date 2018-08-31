class Q10
{

	public static void main(String args[])
	{
		int a[]= {13,39,7,26,19};
		int x=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		boolean f1=false,f2=false;
		for (int i=0;i<5;i++)
		{
			if (a[i]==x && f1==false)
				f1=true;
			if (a[i]==b && f2==false)
				f2=true;
		}
		
		System.out.println("Your first number was: "+x);
		System.out.println("Your second number was: "+b);
		if (f1==true && f2==true)
			System.out.println("Its Bingo!");
		else System.out.println("Not found!\n The array was: ");
		for (int j=0;j<5;j++)
			System.out.print(a[j]+" ");
	}
}

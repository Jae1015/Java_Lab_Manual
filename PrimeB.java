import java.io.*;
import java.util.*;
class PrimeB
{
	public static void main(String args[])
	{
		System.out.println("Prime/Composite Number\nEnter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (a==2||a==3)
			System.out.println(a+" is prime");
		for (int i=2;i<=a/2;i++)
		{
			if (a%i==0)
			{
				System.out.println(a+" is not prime");
				break;
			}
			else
			{
				if(i==a/2)
				System.out.println(a+" is prime");
			
			}
		}
	}
}

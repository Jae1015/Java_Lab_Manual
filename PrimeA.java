import java.io.*;
import java.util.*;
class PrimeA
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Prime/Composite Number\nEnter a number");
		BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
		String s=br.readLine();
		int a=Integer.parseInt(s);
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

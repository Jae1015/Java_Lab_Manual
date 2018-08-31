import java.io.*;
import java.util.*;
class EvenA
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Even/Odd Number\nEnter a number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int a =Integer.parseInt(s);
		if (a%2==0)
			System.out.println(a+" is even");
		else
			System.out.println(a+" is odd");
	
	}
}

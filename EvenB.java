import java.io.*;
import java.util.*;
class EvenB
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Even/Odd Number\nEnter a number");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		if (a%2==0)
			System.out.println(a+" is even");
		else
			System.out.println(a+" is odd");
	
	}
}

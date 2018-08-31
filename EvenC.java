import java.io.*;
import java.util.*;
class EvenC
{
	public static void main(String args[])
	{
		System.out.println("Even/Odd Number\nEnter a number");
		int a =Integer.parseInt(args[0]);
		if (a%2==0)
			System.out.println(a+" is even");
		else
			System.out.println(a+" is odd");
	
	}
}

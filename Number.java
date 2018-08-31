import java.io.*;
import java.util.*;

class Number
{
	int a,b;
	double result;
	Number(int x, int y)
	{
		a=x;b=y;
	}
	
	double add()
	{
		result=a+b;
		return result;
	}

	
	double sub()
	{
		result=a-b;
		return result;
	}

	
	double mul()
	{
		result=a*b;
		return result;
	}

	
	void div()
	{
		result=0.0;
		if(b==0)
		{
			try{
				throw new ArithmeticException();
			   }
			catch(ArithmeticException e)
			   {
				System.out.println("DivisionByZeroException:Divisor is 0");	
			   }
		}
		else 
		{
			result=a/b;
			System.out.println("Result of division: "+result);
		}
	}	
}

class NumberMain
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter 2 numbers:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int x=Integer.parseInt(s);
		s=br.readLine();
		int y=Integer.parseInt(s);
		Number ob=new Number(x,y);
		System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
		System.out.println("Enter your choice");
		s=br.readLine();

		int c=Integer.parseInt(s);
		switch(c)
		{
			case 1:
			double r=ob.add();
			System.out.println("Result of addition: "+r);
			break;

			case 2:
			r=ob.sub();			
			System.out.println("Result of subtraction: "+r);
			break;
			
			case 3:
			r=ob.mul();
			System.out.println("Result of multiplication: "+r);
			break;

			case 4:
			ob.div();
			break;

		}
	}
}

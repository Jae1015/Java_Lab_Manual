import java.io.*;
import java.util.*;
import java.lang.*;

class Rectangle1Main
{
	public static void main(String args[])  throws IOException
	{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			
			int i=1;
			System.out.println("Rectangle:"+i);
			i++;
			Rectangle1 r1=new Rectangle1();
			r1.area();			
			r1.peri();
			
			System.out.println("Rectangle:"+i);
			i++;
			System.out.println("Enter length:");
			String s=br.readLine();
			float l1 =Float.parseFloat(s);			
			System.out.println("Enter breadth:");
			s=br.readLine();
			float b1 =Float.parseFloat(s);
			Rectangle1 r2=new Rectangle1();
			r2.set_l(l1);
			r2.set_b(b1);
			r2.get_l();
			r2.get_b();
			r2.area();
			r2.peri();
			
	}
}

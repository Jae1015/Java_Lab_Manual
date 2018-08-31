import java.io.*;
import java.util.*;
class TestRectangle
{
	public static void main(String args[])  throws IOException
	{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			
			int i=1;
			System.out.println("Rectangle:"+i);
			i++;
			Rectangle r1=new Rectangle();
			r1.display();
			r1.area();			
		
			
			System.out.println("Rectangle:"+i);
			i++;
			System.out.println("Enter length:");
			String s=br.readLine();
			int l1 =Integer.parseInt(s);			
			System.out.println("Enter breadth:");
			s=br.readLine();
			int b1 =Integer.parseInt(s);
			Rectangle r2=new Rectangle(l1,b1);
			r2.display();
			r2.area();

			
			System.out.println("Rectangle:"+i);
			i++;
			System.out.println("Enter length:");
			s=br.readLine();
			int l2 =Integer.parseInt(s);
			System.out.println("Enter breadth:");
			s=br.readLine();
			int b2 =Integer.parseInt(s);
			Rectangle r3=new Rectangle(l2,b2);
			r3.display();
			r3.area();
			
			
			System.out.println("Rectangle:"+i);
			i++;
			Rectangle r4=new Rectangle(3,4);
			r4.display();
			r4.area();
	
			
			System.out.println("Rectangle:"+i);
			i++;
			Rectangle r5=new Rectangle(5,6);
			r5.display();			
			r5.area();
	
			
	}
}

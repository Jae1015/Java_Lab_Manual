import java.util.*;
import java.io.*;
import java.lang.*;

class Book
{
	String title;
	float price;
	
	void setter(String t,float p)
	{
		title=t;
		price=p;
	}
	
	void display()
	{
		System.out.println("title: "+title+" price: "+price+"\n");
	}
}

class BookMain
{
	
	static Book createBooks(Book b) throws IOException
	{
		Book temp=new Book();
		System.out.println("Enter title for book:");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		System.out.println("Enter price of book:");
		String s2=br.readLine();
		float n=Float.parseFloat(s2);
		temp.setter(s1,n);
		return temp;
	}
	static void showBooks(Book b[],int n)
	{
		System.out.println("Book Title\t\tPrice\n");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i].title+"\t\t"+b[i].price+"\n");
		}
	}
	public static void main(String args[]) throws IOException
	{	
		int n;
		System.out.println("Enter count for books:");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		n=Integer.parseInt(s);
		Book b[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			b[i]=createBooks(b[i]);
		}
		System.out.println("Info of books:\n");
		showBooks(b,n);
		
	}
}

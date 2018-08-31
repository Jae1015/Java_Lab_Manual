import java.io.*;

class Date
{
	int d,m,y;
	Date()
	{
		d=16;m=07;y=1996;	
	}
	Date(int d1,int m1,int y1)
	{
		if(d1>=1 && d1<=31)
			d=d1;
		if(m1>=1 && m1<=12)
			m=m1;
		if(y1>1950 && y1<=2018)
			y=y1;
	}
	void addDate(int days)
	{
		d=d+days;
		if(d>31){
			d -= 31;
			m++;
		}
		if(m>12){
			m -= 12;
			y++;
		}
	}
	public String toString(){
		return "{"+d + "/" + m + "/" + y + "}"; 
	}
}

class EmployeeDate
{
	int empno;
	String name;
	Date date;
	EmployeeDate(int emp, String n, Date _date)
	{
		empno=emp;
		name=n;
		date = _date;
	}
	
	void display()
	{
		System.out.println("Emp num: " + empno+", Name: "+name+", " + "Date: " + date.toString());
	}
	
	public static void main(String args[]) throws IOException
	{	
		System.out.println("EMP 1");
		EmployeeDate e1=new EmployeeDate(1,"jas",new Date(25,8,2018));
		e1.display();
		
		System.out.println("EMP 2");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee number:");
		String s1=br.readLine();
		int num=Integer.parseInt(s1);

		System.out.println("\nEnter Employee name:");
		s1=br.readLine();

		System.out.println("Enter Date for DOJ:");
		String s2=br.readLine();
		int d=Integer.parseInt(s2);
		System.out.println("Enter Month:");
		s2=br.readLine();
		int m=Integer.parseInt(s2);
		System.out.println("Enter Year:");
		s2=br.readLine();
		int y=Integer.parseInt(s2);
		EmployeeDate e2=new EmployeeDate(num,s1,new Date(d,m,y));
		e2.display();
		
	}
		
}

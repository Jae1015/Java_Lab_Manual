class Rectangle
{
	int len,br;
	Rectangle()
	{
		len=br=0;	
	}
	Rectangle(int l,int b)
	{
		len=l;
		br=b;	
	}
	void display()
	{
		System.out.println("len= "+len+" breadth= "+br+"\n");
	}
	void area()
	{
		System.out.println("area= "+len*br+"\n");	
	}
}

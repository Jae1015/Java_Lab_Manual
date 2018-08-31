class Rectangle1
{
	float len,br;
	Rectangle1()
	{
		len=br=1.0f;	
	}
	void set_l(float l)
	{
		if (l>0.0f && l<20.0f)
			len=l;
	}
	
	void set_b(float b)
	{
		if (b>0.0f && b<20.0f)
			br=b;
	}
	void get_l()
	{
		System.out.println("len= "+len+"\n");
	}
	void get_b()
	{
		System.out.println("breadth= "+br+"\n");
	}
	void area()
	{
		System.out.println("area= "+len*br+"\n");	
	}
	void peri()
	{
		System.out.println("peri= "+2*(len+br)+"\n");
	}
}

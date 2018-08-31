class Term
{
	int coef;
	int expo;
}

class Polynomial
{
	Term T[]=new Term[10];
	Polynomial()
	{
		for(int i=0;i<10;i++)
		{
			T[i].coef=0;
			T[i].expo=0;
		}
	}

	void setTerm(int c, int e)
	{
		if (i=10)
			System.out.println("Array out of Bounds");
		else if (e<0)
		{
			System.out.println("Negative Exponent");
		}
		else 
		{	
			int i=0;
			T[i].coef=c;
			T[i].expo=e;	
			++i;
		}
	}
	void sort()
	{
		
	}
	
	void display()
	{
		for(int i=0;i<10;i++)
		{
			
			System.out.println("i\nCoefficient"+T[i].coef);
			System.out.println("Exponent"+T[i].expo);
		}		

	}
}

class PolyMain
{
	Polynomial p1=new Polynomail();
	p1.setTerm(10,2);
}

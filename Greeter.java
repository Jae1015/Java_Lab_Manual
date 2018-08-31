package igit.roll.jaspreet;

public class Greeter
{
	String name;
	
	public Greeter(String aName)
	{
		name=aName;	
	}
	
	public void sayHello()
	{
		System.out.println("Hello "+name);
	}

	public void sayGoodBye()
	{
		System.out.println("Good Bye "+name);	
	}
}


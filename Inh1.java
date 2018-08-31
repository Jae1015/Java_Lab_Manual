abstract class Instrument
{
	abstract void play(); //abstract should be used before void
}

class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing tan tan tan tan");
	}
}

class Flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin");
	}
}

class InstrumentMain
{
	public static void main(String args[])
	{
		Instrument a[]=new Instrument[10];
		for (int i=0;i<10;i++)
		{
			if (i<3)
				a[i]=new Piano();
			else if (i<=6)	
				a[i]=new Flute();
			else a[i]=new Guitar();
		}
		a[0].play();
		a[6].play();
		a[9].play();
		a[1].play();

		for (int i=0;i<10;i++)
		{	
			System.out.println(i);
			System.out.println("Is a["+i+"] instanceof Flute: "+(a[i] instanceof Flute));
			System.out.println("Is a["+i+"] instanceof Piano: "+(a[i] instanceof Piano));
			System.out.println("Is a["+i+"] instanceof Guitar: "+(a[i] instanceof Guitar));
		}
	}
}

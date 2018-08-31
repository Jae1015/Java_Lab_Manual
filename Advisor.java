package igit.roll.jaspreet;

public class Advisor
{
	String message[]=new String[5];

	public Advisor()
	{
		/*for (int i=0;i<5;i++)	
			message[i]=Integer.toString(i);
		*/
		message[0]="You are lucky";
		message[1]="Have a great day";
	 	message[2]="Dont say no"; 
		message[3]="Always keep smiling";
		message[4]="Be happy";	
	}

	public void getAdvise()
	{
		int x=(int)(Math.random()*5+1);
		System.out.println("Advice "+x+": "+message[x]);	
	}
}

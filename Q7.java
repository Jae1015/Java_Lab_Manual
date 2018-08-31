class Q7
{
	
	public static void main(String args[])
	{
		System.out.println("String in command line arguments: "+args[0]+"\nIts length: "+args[0].length());
		System.out.println("Uppercase: "+args[0].toUpperCase());
		char word[]= args[0].toCharArray();
		int len=args[0].length()-1;
		int i=0,j=len;
		for (;i<len/2||j>len/2;i++,j--)
		{
			if (word[i]!=word[j])
			{
				System.out.println("Not a palindrome");
				break;
			}
			if (i==Math.floor(len/2-1))
				System.out.println("Palindrome");		
		}
	}
}

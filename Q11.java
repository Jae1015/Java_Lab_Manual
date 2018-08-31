class Q11
{
	public static void main(String args[])
	{
		int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int sum=0,smallest=A[0];
		for (int i=0;i<15;i++)
		{
			sum+=A[i];
			if(smallest>A[i])
				smallest=A[i];	
		}
		A[15]=sum;
		A[16]=(int)sum/14;
		System.out.println("sum: "+A[15]+"\naverage: "+A[16]+"\nsmallest: "+smallest);
	}
}

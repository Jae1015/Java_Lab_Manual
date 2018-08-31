class CalcAverage
{
	public double avgFirstN(int N)
    {
	if(N<0)
        {
            try{
                throw new NumberFormatException();
            }
            catch(NumberFormatException nf){
                System.out.println("We Must To Enter The POsitive Number");
            }
        }
        else
        {
            int c=N*10;
       
        System.out.println("THe Average is a = "+c);
        }
       
        return N;   
   }
   
public static void main(String[] args) {
       
       
        CalcAverage t=new CalcAverage();
        t.avgFirstN(10);   
    }

}

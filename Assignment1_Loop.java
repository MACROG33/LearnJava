//Assignment1_Loop
class Assignment1_Loop 
{
	public static void main(String[] args) 
	{
		
		int result;
		result=0;
		for (int i=1;i<=10 ;i++ )
		{
			result+=i;
			System.out.print(i+"+");
		}
		System.out.println("\b="+result);
	}
}

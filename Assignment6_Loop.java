//Assignment6_Loop
import java.util.Scanner;
class Assignment6_Loop 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int number,result,count;
		double avg;
		count=0;
		result=0;
		number=1;
		for (int i=1;number>0 ;i++ )
		{
			number=kb.nextInt();
			
			if (number>0)
			{
				result+=number;
				count+=1;
			}
		}
		avg=(double)result/count;
		System.out.println("Sum = "+result+"\nAverage = "+avg);
		
	}
}

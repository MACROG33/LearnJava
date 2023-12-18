//Assignment2_Loop
import java.util.Scanner;
class Assignment2_Loop 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int number,result;
		float avg;
		result=0;
		for (int i=1;i<=5 ;i++ )
		{
			System.out.print("input: ");
			number=kb.nextInt();
			result+=number;
		}
		avg=(float)result/5;
		System.out.println("Sum = "+result+"\nAverage = "+avg);
		
	}
}

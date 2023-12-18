//Assignment3_Loop
import java.util.Random;
class Assignment3_Loop 
{
	public static void main(String[] args) 
	{
		
		Random random=new Random();
		int number;
		for (int i=1;i<=10 ;i++ )
		{
			number=random.nextInt(10)+1;
			if (number%2==0)
			{
				System.out.println(number+" EVEN");
			}
			else{
				System.out.println(number+" ODD");
			}
		}
		
	}
}

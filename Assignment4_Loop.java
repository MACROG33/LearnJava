//Assignment4_Loop
import java.util.Random;
class Assignment4_Loop 
{
	public static void main(String[] args) 
	{
		Random random=new Random();
		int number,even,odd;
		even=0;
		odd=0;
		for (int i=1;i<=10 ;i++ )
		{
			number=random.nextInt(10)+1;
			System.out.print(number+" ");
			if (number%2==0)
			{
				even+=1;
			}
			else{
				odd+=1;
			}
		}
		System.out.print("\n");
		System.out.println(even+" Even number\n"+odd+" Odd nuber");
		
		
		
	}
}

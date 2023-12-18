//Assignment7_Loop
import java.util.Random;
class Assignment7_Loop 
{
	public static void main(String[] args) 
	{
		Random random=new Random();
		int number,count,result;
		count=0;
		result=0;
		for (int i=1;i>0 ;i++ )
		{
			number=random.nextInt(4)+4;
			System.out.println(number);
			result+=1;
			if (number==5)
			{
				count+=1;
				if(count==3)
					break;
			}
		}
		System.out.println("Random "+result+" times");
		
	}
}

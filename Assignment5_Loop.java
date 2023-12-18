//Assigment5_Loop
import java.util.Random;
class Assignment5_Loop 
{
	public static void main(String[] args) 
	{
		Random random=new Random();
		int character;
		
		for (int i=1;i<=10 ;i++ )
		{
			character=(int)random.nextInt(26)+65;
			System.out.println((char)character);

		}
		
	}
}

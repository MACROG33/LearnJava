//Assigment8_Loop
import java.util.Scanner;
class Assignment8_Loop 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		String word="",str;

		for (int i=1;!word.equals("x")&&!word.equals("X") ;i++ )
		{
			System.out.print("Menu: ");
			word=kb.nextLine();

			if (word.equals("C")||word.equals("c"))
			{
				str="Circle";
				System.out.println(str);
			}
			else if (word.equals("R")||word.equals("r"))
			{
				str="Rectangle";
				System.out.println(str);
			}
			else if (word.equals("T")||word.equals("t"))
			{
				str="Triangle";
				System.out.println(str);
			}
		
		}
		System.out.println("Exit");
		
		
	}
}

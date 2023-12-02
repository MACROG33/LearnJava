//Assignment1 input
import java.util.Scanner;
class Assignment1 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		String fName,lName;
		long code;
		int birth,age;


		System.out.print("Input  FristName: ");
		fName=kb.nextLine();
		System.out.print("Input LastName: ");
		lName=kb.nextLine();
		System.out.print("Input Code: ");
		code=kb.nextLong();
		System.out.print("Input Birth: ");
		birth=kb.nextInt();

		age=2566-birth;
		
		System.out.println("Hello My name is "+fName+" "+lName);
		System.out.println("ID "+code);
		System.out.println("I was born "+birth+" i have "+age+" years old.");

	}
}

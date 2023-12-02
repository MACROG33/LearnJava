//Assignment2 input and process
import java.util.Scanner;
class Assignment2 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int number1,number2,result1,result2,result3,result5;
		float result4;
		System.out.print("Number1: ");
		number1=kb.nextInt();
		System.out.print("Number2: ");
		number2=kb.nextInt();

		result1=number1+number2;
		result2=number1-number2;
		result3=number1*number2;
		result4=(float)number1/number2;
		result5=number1%number2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	}
}

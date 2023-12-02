//Assignment1_Selection
import java.util.Scanner;
class Assignment1_Selection 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int number;

		System.out.print("Number: ");
		number=kb.nextInt();

		if(number%9==0){
			System.out.println(number+" Division by Nine Perfectly");
		}
		System.out.println("**************************");	
	}
}

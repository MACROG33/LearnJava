//Assignment4
import java.util.Scanner;
class Assignment4 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int income;
		float mother,child,remant;


		System.out.print("Income: ");
		income=kb.nextInt();

		mother=(float)45/100*income;
		child=(float)15/100*income;
		remant=income-(mother+child);

		System.out.println("Income: "+income);
		System.out.println("Mother: "+mother);
		System.out.println("Child: "+child);
		System.out.println("Father: "+remant);
	}
}

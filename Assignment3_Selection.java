//Assignment3_Selection
import java.util.Scanner;
class Assignment3_Selection 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int income;
		float salary,bonus;
		
		System.out.print("Income: ");
		income=kb.nextInt();

		
		if(income*10/100<=5000){
			bonus=income*12.5f/100;
			salary=income+bonus;
			System.out.println("New income: "+salary);
		}
		else{
			bonus=income*2.5f/100;
			salary=income+bonus;
			System.out.println("New income: "+salary);
		}
	}
}

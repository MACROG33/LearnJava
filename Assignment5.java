//Assignment5
import java.util.Scanner;
class Assignment5 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int price;
		float pay,sale;

		System.out.print("Price: ");
		price=kb.nextInt();

		sale=(float)30/100*price;
		pay=(float)price-sale;

		System.out.println("Sale = "+sale);
		System.out.println("Sale = "+pay);
	}
}

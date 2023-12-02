//Assignment3
import java.util.Scanner;
class Assignment3 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		String product;
		int price,amount,pay,cost,change;
		
		System.out.print("Product: ");
		product=kb.nextLine();
		System.out.print("Price: ");
		price=kb.nextInt();
		System.out.print("Amount: ");
		amount=kb.nextInt();
		System.out.print("Pay: ");
		pay=kb.nextInt();

		cost=price*amount;
		change=pay-cost;
		

		System.out.println("Buy "+product+" Price "+price+" bath,Amount "+amount);
		System.out.println("Cost = "+cost+" Bath");
		System.out.println("Pay = "+pay+" Bath");
		System.out.println("Change = "+change+" Bath");
	}
}

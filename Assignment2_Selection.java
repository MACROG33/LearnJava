//Assignment2_Selection
import java.util.Scanner;
class Assignment2_Selection 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int price,pay,change;

		System.out.print("Input price: ");
		price=kb.nextInt();
		System.out.print("Input pay: ");
		pay=kb.nextInt();

		if(price<pay){
			change=pay-price;
			System.out.println("******************************");
			System.out.println("Change "+change);
		}
	}
	
	
	
}

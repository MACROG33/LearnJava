//Assignment6
import java.util.Scanner;
class Assignment6 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int rice,remant,pack;

		System.out.print("Rice (Kg.): ");
		rice=kb.nextInt();

		remant=rice%12;
		pack=(rice-remant)/12;

		System.out.println("Packaging "+pack+" bag.");
		System.out.println("Remaining "+remant+" Kg.");
	}
}

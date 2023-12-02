//Asignment7
import java.util.Scanner;
class  Assignment7
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int mango;
		float logan,rambutan,sum;

		System.out.print("Mango (Kg.): ");
		mango=kb.nextInt();
		System.out.print("Rambutan (Kg.): ");
		rambutan=kb.nextInt();


		logan=(float)85/100*mango;
		rambutan=(float)mango*(100/27);
		sum=mango+logan+rambutan;

		
		System.out.println("Mango "+mango+" Kg.");
		System.out.println("Logan "+logan+" Kg.");
		System.out.println("Sum "+sum+" Kg.");
	}
}


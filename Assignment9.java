//Assignment9
import java.util.Scanner;
class Assignment9 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		float width,length,height,area,pay;

		System.out.print("Width: ");
		width=kb.nextFloat();
		System.out.print("Length: ");
		length=kb.nextFloat();
		System.out.print("Heigth: ");
		height=kb.nextFloat();

		area=((length*height)*2)+((height*width)*2);
		pay=25.25f*area;

		System.out.println("Area: "+area);
		System.out.println("Pay "+pay+" Bath");
	}
}

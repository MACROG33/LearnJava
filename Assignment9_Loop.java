//Assignment9_Loop
import java.util.Scanner;
class Assignment9_Loop 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		String word="";
		double area;
		int width,height,high,base,radius;
		
		for (int i=1;!word.equals("X")&&!word.equals("x") ;i++ )
		{
			System.out.print("Menu: ");
            word = kb.next();
			
			if (word.equals("C")||word.equals("c"))
			{
				System.out.print("r: ");
				radius=kb.nextInt();
				area=Math.PI*Math.pow(radius,2);
				System.out.println("Area = "+area);
			}
			else if (word.equals("R")||word.equals("r"))
			{
				System.out.print("Width: ");
				width=kb.nextInt();
				System.out.print("Height: ");
				height=kb.nextInt();
				area=width*height;
				System.out.println("Area = "+area);
			}
			else if (word.equals("T")||word.equals("t"))
			{
				System.out.print("Base: ");
				base=kb.nextInt();
				System.out.print("High: ");
				high=kb.nextInt();
				area=(double)1/2*(base*high);
				System.out.println("Area = "+area);
			}
		}
		System.out.println("Exit");
	}
}

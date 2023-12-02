//Assignment5_Selection
import java.util.Scanner;
class Assignment5_Selection 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int room,unit,fristUnit,twoUnit,threeUnit,cost;

		System.out.print("Room: ");
		room=kb.nextInt();
		System.out.print("Unit: ");
		unit=kb.nextInt();
		System.out.println("*************************************");
		
		if(unit<=10){
			cost=unit*5;
			System.out.println("Room : "+room);
			System.out.println("cost : "+cost);
		}
		else if(unit>10&&unit<20){
			fristUnit=8*10;
			twoUnit=(unit-10)*15;
			cost=fristUnit+twoUnit;
			System.out.println("Room : "+room);
			System.out.println("Cost : "+cost);
		}
		else if(unit>20){
			fristUnit=10*10;
			twoUnit=10*20;
			threeUnit=(unit-20)*50;
			cost=fristUnit+twoUnit+threeUnit;
			System.out.println("Room : "+room);
			System.out.println("Cost : "+cost);
		}
		
	}
}

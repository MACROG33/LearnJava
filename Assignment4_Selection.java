//Assignment4_Selection
import java.util.Scanner;
class Assignment4_Selection 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		String text,str;

		System.out.print("Input Text: ");
		text=kb.nextLine();

		if(text.equals("excellent")){
			str="Grade A";
		}
		else if(text.equals("good")){
			str="Grade B";
		}
		else if(text.equals("fair")){
			str="Grade C";
		}
		else if(text.equals("pass")){
			str="Grade D";
		}
		else if(text.equals("fail")){
			str="Grade F";
		}
		else{
			str="Have not Grade";
		}
		System.out.println(str);
	}
}

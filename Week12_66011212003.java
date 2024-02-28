//Kitsanaphon Sukdee
import java.util.Scanner;
class Week12_66011212003 
{
	public static void main(String[] args) 
	{
		Week12_66011212003 obj=new Week12_66011212003();
		String idCard=obj.getInput();
		String idCardReplace = obj.getReplace(idCard);
		if (obj.isNumeric(idCardReplace)) {
            char idCardSeparate[] = obj.getToChar(idCardReplace);
            int result[] = obj.getCharToInt(idCardSeparate);
            int resultPlus = obj.getPlus(result);
            int resultMod = obj.getMod(resultPlus);
            int resultMinus = obj.getMinus(resultMod);
            boolean compare = obj.getCompare(idCardSeparate, resultMinus);
            obj.setPrintShow(idCard, compare);
        } else {
            System.out.println(idCard+" false");
        }
	}
	void setPrintShow(String idCard,boolean compare){
		System.out.println(idCard+" "+compare);
	}
	boolean isNumeric(String input) {
        return input.matches("\\d+");
	}
	//รับค่าบัตรประชาชนผ่านทางคีร์บอร์ด
	String getInput(){
		Scanner kb=new Scanner(System.in);
		String idCard;
		System.out.print("Input ID CARD: ");
		idCard=kb.nextLine();
		return idCard;
	}
	//ทำให้ช่องวางและขีดหายไป
	String getReplace(String idCard){
		String idCardReplace=idCard.replaceAll(" ","");
		String idCardReplace2=idCardReplace.replaceAll("-","");
		return idCardReplace2;
		
	}
	//แปลง String เป็น char
	char[] getToChar(String idCard){
		char separate[]=idCard.toCharArray();
		return separate;
	}
	//แปลง char เป็น int
	int[] getCharToInt(char idCardSeparate[]){
		int result[]=new int[idCardSeparate.length];
		int mainNumber[]={13,12,11,10,9,8,7,6,5,4,3,2};
		for (int i=0;i<mainNumber.length;i=i+1) {
        	result[i]=Character.getNumericValue(idCardSeparate[i])*mainNumber[i];
		}
		return result;
	}
	//หาผลบวกรวมกัน
	int getPlus(int result[]){
		int resultPlus=0;
		for(int i=0;i<result.length;i++){
			 resultPlus+=result[i];
		}
		return resultPlus;
	}
	//หารกันเอาเศษ
	int getMod(int resultPlus){
		int resultMod;
		resultMod=resultPlus%11;
		return resultMod;
	}
	//หาผลลบ
	int getMinus(int resultMod){
		int resultMinus;
		resultMinus=(11-resultMod)%10;
		return resultMinus;
	}
	//เปรียบเทียบ
	boolean getCompare(char idCardSeparate[], int resultMinus){
		boolean compare=Character.getNumericValue(idCardSeparate[12])==resultMinus;
		return compare;
	}
}
		
		


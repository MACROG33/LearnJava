import java.util.Scanner;
class Week10_66011212003 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		
		Week10_66011212003 obj=new Week10_66011212003();
		int n,i,j;
		System.out.print("N: ");
		n=kb.nextInt();
		System.out.print("(O/X/E):");
		char cha=kb.next().charAt(0);
		char str[][]=new char[n][n];
		obj.fill_toCharArray(str);
		
		for(;;){
			if(cha=='X'||cha=='x'){
				System.out.print("Index(X):");
				i=kb.nextInt();
				System.out.print("Colum(X):");
				j=kb.nextInt();
				if(i<n&&j<n){
					obj.setXtoArray2D(str,i,j);
				}
				else{
					System.out.println("Please input again");
					System.out.print("Index(X):");
					i=kb.nextInt();
					System.out.print("Colum(X):");
					j=kb.nextInt();
					obj.setXtoArray2D(str,i,j);
					
				}
			}
			else if(cha=='O'||cha=='o'){
				System.out.print("Intdex(O):");
				i=kb.nextInt();
				System.out.print("Colum(O):");
				j=kb.nextInt();
				if(i<n&&j<n){
					obj.setOtoArray2D(str,i,j);
				}
				else{
					System.out.println("Please input again");
					System.out.print("Index(O):");
					i=kb.nextInt();
					System.out.print("Colum(O):");
					j=kb.nextInt();
					obj.setXtoArray2D(str,i,j);
				}
			}
			else if(cha=='E'||cha=='e'){
				break;
			}
			else{
				break;
			}
			obj.printCharArray2D(str);
			System.out.print("-------------------\n");
			System.out.print("(O/X/E):");
			cha=kb.next().charAt(0);
		}
	}
	void printCharArray2D(char str[][]){
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[i].length;j++){
				System.out.print(str[i][j]+"\t");
			}System.out.println();
		}
	}
	void fill_toCharArray(char str[][]){
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str.length;j++){
				str[i][j]='_';
			}
		}
	}
	void setXtoArray2D(char x[][],int i,int j){
		if(x[i][j]!='X'&&x[i][j]!='O'){
			x[i][j]='X';
		}
		else{
			System.out.println("Please enter X again.");
		}
	}
	void setOtoArray2D(char o[][],int i,int j){
		if(o[i][j]!='X'&&o[i][j]!='O'){
			o[i][j]='O';
		}
		else{
			System.out.println("Please enter O again.");
		}
	}
}
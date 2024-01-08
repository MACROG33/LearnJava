//Assignment6
import java.util.Scanner;
class Assignment6_Array 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int n;
		System.out.print("N: ");
		n=kb.nextInt();
		int number[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j){
					number[i][j]=1;
				}
				else{
					number[i][j]=0;
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(number[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}

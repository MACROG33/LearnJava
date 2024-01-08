//Assignment5
class Assignment5_Array 
{
	public static void main(String[] args) 
	{
		int A[]=new int[10],B[]=new int[10];
		String OR[]=new String[10];
		for(int i=0;i<10;i++){
			A[i]=(int)(Math.random()*2);
			B[i]=(int)(Math.random()*2);
		}
		System.out.print("A");
		for(int i=0;i<10;i++){
			System.out.print("\t"+A[i]);
		}
		System.out.print("\nB");
		for(int i=0;i<10;i++){
			System.out.print("\t"+B[i]);
		}
		for(int i=0;i<10;i++){
			if(A[i]==1||B[i]==1){
				OR[i]="True";
			}
			else{
				OR[i]="False";
			}
		}
		System.out.print("\nAND");
		for(int i=0;i<10;i++){
			System.out.print("\t"+OR[i]);
		}
		System.out.println("\n");
	}
}

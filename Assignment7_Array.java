import java.util.Scanner;
class Assignment7_Array {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int m,n;
        System.out.print("M: ");
        m=kb.nextInt();
        System.out.print("N: ");
        n=kb.nextInt();
        int number[][]=new int[m][n];
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number[i].length;j++){
                number[i][j]=(int)(Math.random()*10+1);
            }
        }
        System.out.println("Metic A:");
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number[i].length;j++){
                System.out.print(number[i][j]+"\t");
            }
            System.out.println();
        }
        
        //การทำทรานโพส
        System.out.println("Metic At:");
        int number2[][]=new int[n][m];
        for(int i=0;i<number2.length;i++){
            for(int j=0;j<number2[i].length;j++){
                number2[i][j]=number[j][i];
            }
        }
        for(int i=0;i<number2.length;i++){
            for(int j=0;j<number2[i].length;j++){
                System.out.print(number2[i][j]+"\t");
            }
             System.out.println();
        }
    }    
}

import java.util.Scanner;
class Assignment8_Array {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.print("N: ");
        n=kb.nextInt();
        int data[][]=new int[n][n];
        System.out.println("DATA:");
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                data[i][j]=(int)(Math.random()*10+1);
            }
        }
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("DATAAVERAGE:");
        float dataAverage[][]=new float[n][n];
        for(int i=0;i<dataAverage.length;i++){
            int sum=0;
            for(int j=0;j<dataAverage[i].length;j++){
                sum+=data[i][j];
            }
            dataAverage[i][i]=(float)sum/n;
        }
        for(int i=0;i<dataAverage.length;i++){
            for(int j=0;j<dataAverage[i].length;j++){
                if(dataAverage[i][j]<=0){
                    System.out.print((int)dataAverage[i][j]+"\t");
                }
                else{
                    System.out.print(dataAverage[i][j]+"\t");
                }
            }
            System.out.println();
        }
        
    }
}

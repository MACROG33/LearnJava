//Assignment1-3
import java.util.Scanner;
class Assignment1_Array {
	public static void main(String[] args) {
      Scanner kb=new Scanner(System.in);
      int kon;
      System.out.print("Kon: ");
      kon=kb.nextInt();
      kb.nextLine();
      String name[]=new String[kon];//array
      int score[]=new int[kon],score2[]=new int[kon],totalScore[]=new int[kon];//array
      for(int i=0;i<kon;i++){
         System.out.print("Name"+(i+1)+": ");
         name[i]=kb.nextLine();
         System.out.print("Miterm"+(i+1)+": ");
         score[i]=kb.nextInt();
         kb.nextLine();
         System.out.print("Final"+(i+1)+": ");
         score2[i]=kb.nextInt();
         kb.nextLine();
		 totalScore[i]=score[i]+score2[i];//Calculate total score
      }
	  //Maxmin Mid
	  int maxM,minM;
	  maxM=score[0];
	  minM=score[0];
	  for(int i=0;i<kon;i++){
		if(score[i]>maxM){
			maxM=score[i];
		}
		if(score[i]<minM){
			minM=score[i];
		}
	  }
	  //Maxmin Final
	  int maxF,minF;
	  maxF=score2[0];
	  minF=score2[0];
	  for(int i=0;i<kon;i++){
		if(score2[i]>maxF){
			maxF=score2[i];
		}
		if(score2[i]<minF){
			minF=score2[i];
		}
	  }
	  System.out.print("Name\tMidterm\tFinal\tScore\n");
	  for(int i=0;i<kon;i++){
         System.out.println(name[i]+"\t"+score[i]+"\t"+score2[i]+"\t"+totalScore[i]);
      }
	  //Calculate totalMax and Min
	  int totalMax,totalMin;
	  totalMax=maxM+maxF;
	  totalMin=minM+minF;
	  System.out.println("Min\t"+minM+"\t"+minF+"\t"+totalMin+"\nMax\t"+maxM+"\t"+maxF+"\t"+totalMax);
	  //Calculate maxmin Name
	  int minMid=0,maxMid=0,minFinal=0,maxFinal=0,minScore=0,maxScore=0; 
	  for (int i = 1;i < kon; i++) {
		  if (score[i] < score[minMid]) {
                minMid = i;
            }
            if (score[i] > score[maxMid]) {
                maxMid = i;
            }
            if (score2[i] < score2[minFinal]) {
                minFinal = i;
            }
            if (score2[i] > score2[maxFinal]) {
                maxFinal = i;
            }
            if (totalScore[i] < totalScore[minScore]) {
                minScore = i;
            }
            if (totalScore[i] > totalScore[maxScore]) {
                maxScore = i;
            }
	 }
	 System.out.println("Min Midterm\t" + name[minMid]+"\nMax Midterm\t"+name[maxMid]+"\nMin Final\t"+name[minFinal]+"\nMax Final\t"+name[maxFinal]);
	 System.out.println("Min Score\t"+name[minScore]+"\nMax Score\t"+name[maxScore]);
  }
}

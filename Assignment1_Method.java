import java.util.Scanner;
class Assignment1_Method {
    public static void main(String[] args) {
        Assignment1_Method method=new Assignment1_Method();
        int scoreMid=method.getMid();
        int scoreFinal=method.getMid();
        int totalScore=method.getTotalScore(scoreMid, scoreFinal);
        char grade=method.getGrade(totalScore);
        method.setShowMonitor(scoreMid, scoreFinal, totalScore, grade);
    }
    int getMid(){
        Scanner kb=new Scanner(System.in);
        int scoreMid;
        System.out.print("ScoreMid: ");
        scoreMid=kb.nextInt();
        return scoreMid;
    }
    int getFinal(){
        Scanner kb=new Scanner(System.in);
        int scoreFinal;
        System.out.print("ScoreFinal: ");
        scoreFinal=kb.nextInt();
        return scoreFinal;
    }
    int getTotalScore(int scoreMid,int scoreFinal){
        int result=scoreMid+scoreFinal;
        return result;
    }
    char getGrade(int totalScore){
        char grade;
        if(totalScore>=70){
            grade='S';
        }
        else{
            grade='U';
        }
        return grade;
    }
    void setShowMonitor(int scoreMid,int scoreFinal,int totalScore,char grade){
        System.out.print("=====================================================\n");
        System.out.println("Midterm: "+scoreMid+"\nFinal: "+scoreFinal+"\nTotalScore: "+totalScore+"\nGrade: "+grade);
    }
}

import java.util.Scanner;
public class Assignment3method {
    Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        Assignment3method obj = new Assignment3method();
        int sizeArray = obj.getSizeArray();
        int scoreMid[] = new int[sizeArray];
        int scoreFin[] = new int[sizeArray];
        char grade[] = new char[sizeArray];

        obj.setScoreMid(scoreMid);
        obj.setScoreFin(scoreFin);
        obj.setCalculateGrade(scoreMid, scoreFin, grade);
        obj.setPrintShow(scoreMid,scoreFin,grade);
    }
    //รับค่าขนาดของ Array
    int getSizeArray() {
        int n;
        System.out.print("SizeArray: ");
        n = kb.nextInt();
        return n;
    }
    //รับคะแนนกลางภาค
    void setScoreMid(int scoreMid[]) {
        for (int i = 0; i < scoreMid.length; i++) {
            System.out.print("ScoreMid "+(i+1)+": ");
            scoreMid[i] = kb.nextInt();
        }
    }
    //รับคะแนนปลายภาค
    void setScoreFin(int scoreFin[]) {
        for (int i = 0; i < scoreFin.length; i++) {
            System.out.print("ScoreFin "+(i+1)+": ");
            scoreFin[i] = kb.nextInt();
        }
    }
    //รวมคะแนนกลางภาคและปลายภาค กับ เช็คว่าได้เกรดอะไร
    void setCalculateGrade(int inputMid[], int inputFin[], char grade[]) {
        for (int i = 0; i < inputMid.length; i++) {
            int totalScore = inputMid[i] + inputFin[i];

            if (totalScore >= 80) {
                grade[i] = 'A';
            } else if (totalScore >= 70) {
                grade[i] = 'B';
            } else if (totalScore >= 60) {
                grade[i] = 'C';
            } else if (totalScore >= 50) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }
    }
    //แสดงผล
    void setPrintShow(int scoreMid[],int scoreFin[],char grade[]){
        for (int i = 0; i < scoreMid.length; i++) {
            System.out.print(scoreMid[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < scoreMid.length; i++) {
            System.out.print(scoreFin[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < grade.length; i++) {
            System.out.print(grade[i] + "\t");
        }
        System.out.println();
    }
}

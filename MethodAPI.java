import java.util.Scanner;
class MethodAPI {
    public static void main(String[] args) {
        MethodAPI obj=new MethodAPI();
        String history=obj.setInput();
        int numeric=obj.getNumeric(history);
        int lowerCase=obj.getLowercase(history);
        int upperCase=obj.getUppercase(history);
        int totalWord=obj.getTotalWord(history);
        obj.setPrint(numeric,lowerCase,upperCase,totalWord);

    }
    void setPrint(int numeric,int lowerCase,int upperCase,int totalWord){
        System.out.println(numeric+" Numberic"+"\n"+lowerCase+" LowerCase"+"\n"+upperCase+" UpperCase"+"\n"+totalWord+" TotalWord");
    }
    String setInput(){
        Scanner kb=new Scanner(System.in);
        System.out.print("Input History: ");
        String history=kb.nextLine();
        return history;
    }
    int getNumeric(String history){
        char numeric[]=history.toCharArray();
        int sum=0;
        for(int i=0;i<numeric.length;i++){
            boolean result=Character.isDigit(numeric[i]);
            if(result==true){
                sum+=1;
            }
        }
        return sum;
    }
    int getLowercase(String history){
        char numeric[]=history.toCharArray();
        int sum=0;
        for(int i=0;i<numeric.length;i++){
            boolean result=Character.isLowerCase(numeric[i]);
            if(result==true){
                sum+=1;
            }
        }
        return sum;
    }
    int getUppercase(String history){
        char numeric[]=history.toCharArray();
        int sum=0;
        for(int i=0;i<numeric.length;i++){
            boolean result=Character.isUpperCase(numeric[i]);
            if(result==true){
                sum+=1;
            }
        }
        return sum;
    }
    int getTotalWord(String history){
        String word[]=history.split(" ");
        return word.length;
    }
    
    
}

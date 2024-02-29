import java.util.ArrayList;
import java.util.Scanner;
class Assignment2method {
    public static void main(String[] args) {
        Assignment2method obj=new Assignment2method();
        ArrayList<Integer> priceProduct=obj.getInputPrice();
        int totalPrice=obj.getTotalPrice(priceProduct);
        double discount=obj.getDiscount(totalPrice);
        double realPrice=obj.getRealPrice(totalPrice,discount);
        obj.setPrintShow(totalPrice,discount,realPrice);
    
    }
    //ทำหน้าที่รับข้อมูลจากผู้ใช้
    ArrayList<Integer> getInputPrice(){
        Scanner kb=new Scanner(System.in);
        ArrayList<Integer> myList=new ArrayList<>();
        int priceProduct;
        for(;true;){
            System.out.print("PriceProduct:");
            priceProduct=kb.nextInt();
            if(priceProduct<1){
                break;
            }
            myList.add(priceProduct);
        }
        return myList;
    }
    //ทำหน้าที่รวมข้อมูลเรื่อยๆ
    int getTotalPrice(ArrayList<Integer> priceList){
        int resultPrice=0;
        for(int priceProduct : priceList){
            resultPrice+=priceProduct;
        }
        return resultPrice;
    }
    //คำนวณหาส่วนลด
    double getDiscount(int resultPrice){
        double discount;
        discount=(double)3/100*resultPrice;
        return discount;
    }
    //คำนวณราคาที่ต้องจ่ายจริง
    double getRealPrice(int totalPrice,double discount){
        double realPrice;
        realPrice=totalPrice-discount;
        return realPrice;
    }
    void setPrintShow(int totalPrice,double discount,double realPrice){
        System.out.println("TotalPriceProduct = "+totalPrice+" Bath.\nDiscount = "+discount+" Bath.\nTotalPrice = "+realPrice+" Bath.");
    }

    
    
}

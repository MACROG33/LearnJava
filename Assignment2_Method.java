import java.util.Scanner;
class Assignment2_Method {
    public static void main(String[] args) {
        Assignment2_Method method=new Assignment2_Method();
        int priceProduct=method.getPriceProduct();
        double discount=method.getDiscount(priceProduct);
        double totalPay=method.getTotalPay(priceProduct,discount);
        method.setShowMonitor(priceProduct,discount,totalPay);
    }
    int getPriceProduct(){
        Scanner kb=new Scanner(System.in);
        int price,totalPrice=0;
        for(;;){
            System.out.print("PriceProduct: ");
            price=kb.nextInt();
            if(price==0){
                break;
            }
            else{
                totalPrice+=price;
            }
        }
        return totalPrice;
    }
    double getDiscount(int totalPrice){
        double discount=(3.0/100)*totalPrice;
        return discount;
    }
    double getTotalPay(double totalPrice,double discount){
        double totalPay;
        totalPay=totalPrice-discount;
        return totalPay;
    }
    void setShowMonitor(double priceProduct,double discount, double totalPay){
        System.out.println("TotalPrice: "+priceProduct+"\nDiscount: "+discount+"\nTotalPay: "+totalPay);
    }
    
 
}

import java.util.Scanner;
class Week10_66011212003 
{
	public static void main(String[] args) 
	{
		Week10_66011212003 method=new Week10_66011212003();
		int x1=method.getX1();
		int y1=method.getY1();
		int x2=method.getX2();
		int y2=method.getY2();
		int x3=method.getX3();
		int y3=method.getY3();
		double sideLenghtA=method.getSideLenghtA(x1,y1,x2,y2);
		double sideLenghtB=method.getSideLenghtB(x1,y1,x3,y3);
		double sideLenghtC=method.getSideLenghtC(x2,x3,y2,y3);
		double s=method.getS(sideLenghtA,sideLenghtB,sideLenghtC);
		double area=method.getArea(s,sideLenghtA,sideLenghtB,sideLenghtC);
		method.setShowMonitor(sideLenghtA,sideLenghtB,sideLenghtC,s,area);
		
	}
	int getX1()
	{
		int x1;
		Scanner kb=new Scanner(System.in);
		System.out.print("x1: ");
		x1=kb.nextInt();
		return x1;
	}
	int getY1()
	{
		int y1;
		Scanner kb=new Scanner(System.in);
		System.out.print("y1: ");
		y1=kb.nextInt();
		return y1;
	}
	int getX2()
	{
		int x2;
		Scanner kb=new Scanner(System.in);
		System.out.print("x2: ");
		x2=kb.nextInt();
		return x2;
	}
	int getY2()
	{
		int y2;
		Scanner kb=new Scanner(System.in);
		System.out.print("y2: ");
		y2=kb.nextInt();
		return y2;
	}
	int getX3()
	{
		int x3;
		Scanner kb=new Scanner(System.in);
		System.out.print("x3: ");
		x3=kb.nextInt();
		return x3;
	}
	int getY3()
	{
		int y3;
		Scanner kb=new Scanner(System.in);
		System.out.print("y3: ");
		y3=kb.nextInt();
		return y3;
	}
	double getSideLenghtA(int x1,int y1,int x2,int y2)
	{
		double sideA=Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)));
		return sideA;
	}
	double getSideLenghtB(int x1,int y1,int x3,int y3)
	{
		double sideB=Math.sqrt((Math.pow((x1-x3),2))+(Math.pow((y1-y3),2)));
		return sideB;
	}
	double getSideLenghtC(int x2,int x3,int y2,int y3)
	{
		double sideC=Math.sqrt((Math.pow((x2-x3),2))+(Math.pow((y2-y3),2)));
		return sideC;
	}
	double getS(double sideA,double sideB,double sideC)
	{
		double s=(sideA+sideB+sideC)/2;
		return s;
	}
	double getArea(double s,double sideA,double sideB,double sideC)
	{
		double area=Math.sqrt((s*(s-sideA)*(s-sideB)*(s-sideC)));
		return area;
	}
	void setShowMonitor(double sideLenghtA,double sideLenghtB,double sideLenghtC,double s,double area)
	{
		System.out.print("=====================================================\n");
        System.out.println("A: "+(float)sideLenghtA+"\nB: "+(float)sideLenghtB+"\nC: "+(float)sideLenghtC+"\nS: "+(float)s+"\nArea: "+(float)area);
	}
}
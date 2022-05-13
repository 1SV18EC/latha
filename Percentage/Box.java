package Percentage;

import java.util.Scanner;

public class Box {
	double dblWidth;
	double dblHeight;
	double dblDepth;
	static int boxid;

	public Box(double dblWidth,double dblHeight,double dblDepth) {
	this.dblWidth =dblWidth;
		this.dblHeight= dblHeight;
		this.dblDepth= dblDepth;
	}
	public Box() 
	{
	}
	public double calcVolume()
	{
		double dblTemp;
		dblTemp=dblWidth*dblHeight*dblDepth;
		return dblTemp;
	}
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the width of the Box");
    double w=sc.nextDouble();
    System.out.println("Enter the height of the Box");
    double h=sc.nextDouble();
    System.out.println("Enter the depth of the Box");
    double v=sc.nextDouble();
    Box b1=new Box(w,h,v);
    System.out.println("Volume of the box is:" +b1.calcVolume());
	}

}

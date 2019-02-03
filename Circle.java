import java.io.*;
import java.util.*;
class Circle
{
	double radius,area;
	Circle()
	{
	radius=0.0d;
	area=0.0d;
	}
	Circle(double r)
	{
	this.radius=r;
	}
	void calculateArea()
	{
	area=3.14*radius*radius;
	System.out.println("The area of circle:"+area);
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	Circle ob1=new Circle(r);
	ob1.calculateArea();
	}
}	
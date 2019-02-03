import java.io.*;
class Overload
{
	public float myMethod(int a,float b)
	{
		return a+b;
	}
	public float myMethod(float var1,int var2)
	{
		return var1+var2;
	}
	public static void main(String[] args)
	{
		Overload ob=new Overload();
		System.out.println(ob.myMethod(5,5.5f));
		System.out.println(ob.myMethod(5,5));
		
	}
}
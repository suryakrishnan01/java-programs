import java.io.*;
import java.util.*;
class MinMax
{
	public static void main(String args[])
	{
	int array[]=new int[]{10,20,8,30,5,75};
	int max=getMax(array);
	System.out.println("The max value is"+max);
	int min=getMin(array);
	System.out.println("The min value is"+min);
	}
	
	public static int getMax(int[] inputarray)
	{
	
	int maxValue=inputarray[0];
	for(int i=0;i<inputarray.length;i++)
	{
		if(inputarray[i]>maxValue)
		{
		maxValue=inputarray[i];
		}
		
	}
	return maxValue;
	}
	
	public static int getMin(int[] inputarray)
	{
	int minValue=inputarray[0];
	for(int i=0;i<inputarray.length;i++)
	{
		if(inputarray[i]<minValue)
		{
		minValue=inputarray[i];
		}
	}
	return minValue;
	}

}
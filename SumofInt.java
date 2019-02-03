import java.io.*;
import java.util.*;
class SumofInt
{
	public static void main(String args[])
	{
	int num=0,digit=0,sumofDigit=0,reversedInteger=0,originalInteger;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number:");
	num=sc.nextInt();
	originalInteger=num;
	while(num !=0)
	{
	digit=num %10;
	sumofDigit+=digit;
	reversedInteger=reversedInteger*10+digit;
	num=num/10;
	}
	System.out.println("Sum of individual of a given number is:"+sumofDigit);
	if (originalInteger == reversedInteger)
        System.out.println("given num is a palindrome="+ originalInteger);
        else
        System.out.println("given num is not a palindrome="+ originalInteger);
}
}
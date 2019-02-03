import java.io.*;
import java.util.*;
class Switch
{
	public static void main(String args[])
	{
	char ch;
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your operator(+,-,/,*,%)");
	ch=sc.next().charAt(0);
	System.out.println("Enter the values of a and b\n");
	a=sc.nextInt();
	b=sc.nextInt();
	switch(ch)
	{
	case '+':c=a+b;
	         System.out.println("addition of two numbers is"+ c);
		 break;

	case '-':c=a-b;
	         System.out.println("subtraction of two numbers is"+ c);
		 break;
	case '*':c=a*b;
	         System.out.println("multiplication of two numbers is"+c);
		 break;
	case '/':c=a/b;
	         System.out.println("division of two numbers is "+ c);
		 break;
	case '%':c=a%b;
	         System.out.println("modulus of two numbers is"+c);
		 break;
	default:System.out.println("invalid operator");
		break;
	}
}
}



  
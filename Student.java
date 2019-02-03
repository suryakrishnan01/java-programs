import java.io.*;
import java.util.*;
class Student
{
	public static void main(String args[])
	{
	int n,i;
	String reg,name;
	float cgpa;
	String program;
	String school;
	String procName;
	boolean val;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students:");
	n=sc.nextInt();

	for(i=0;i<=n;i++)
	{
	System.out.println("Enter students reg num:");
	reg=sc.next();
	System.out.println("Enter students name:");
	name=sc.nextLine();
	sc.next();
	System.out.println("Enter the students cgpa:");
	cgpa=sc.nextFloat();
	System.out.println("Enter the program:");
	program=sc.next();
	System.out.println("Enter schools name:");
	school=sc.nextLine();
	sc.next();
	System.out.println("Enter the proctor name:");
	procName=sc.nextLine();
	sc.next();
	System.out.println("do you want to continue, then type true");
	val=sc.nextBoolean();
	if(val!=true)
	{
	break;
	}
	}
	
}}

/*output
C:\Users\batch1>javac Studen

C:\Users\batch1>java Student
Enter the number of students
3
Enter students reg num:
16bit0443
Enter students name:
surya
Enter the students cgpa:
10
Enter the program:
b.tech
Enter schools name:
site school
Enter the proctor name:
madhu
do you want to continue
true
Enter students reg num:
16bit0333
Enter students name:
raj
Enter the students cgpa:
9
Enter the program:
smec
Enter schools name:
site
Enter the proctor name:
saravana
do you want to continue
false

C:\Users\batch1>
*/

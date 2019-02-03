import java.io.*;
import java.util.*;
class RandomGenerator
{

public static void main(String args[])
{
	int l;
	String f;
	String [][] a={{"ITA1001","ITA1002","ITA1003","ITA1004","ITA1005","ITA1006"},
{"ITA2001","ITA2002","ITA2003","ITA2004","ITA2005","ITA2006"},{"ITE1001","ITE1002",
"ITE1003","ITE1004","ITE1005","ITE1006"},{"ITE2001","ITE2002","ITE2003","ITE2004",
"ITE2005","ITE2006"},{"SWE1001","SWE1002","SWE1003","SWE1004","SWE1005","SWE1006"},
{"SWE2001","SWE2002","SWE2003","SWE2004","SWE2005","SWE2006"}};

	String b[]=new String[5];
	System.out.println("Courses for next semester:");
	for(int x=0;x<args.length;x++)
	{
	b[x]=args[x];
	System.out.println(b[x]);
	}
	

	int course[]=new int[5];
	int c=0;
	for(int i=0;i<args.length;i++)
		for(int j=0;j<6;j++)
			for(int k=0;k<6;k++)
				if(a[j][k].equalsIgnoreCase(args[i]))
				{
					course[c++]=j;
					break;
				}

			while(c<5)
			{
				Random r=new Random();
				int n=r.nextInt(36);
				int row=n/6;
				int col=n%6;
				boolean flag=true;
				for(int i=0;i<c;i++)
				if(row==course[i])
				{
					flag=false;
					break;
				}
				if(flag==true)
				{
					System.out.println(a[row][col]);
					course[c++]=row;
				}
			}
}
		
}

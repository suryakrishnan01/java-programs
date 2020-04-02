import java.io.*;
import java.util.*;
class AddMul
{
	public static void main(String args[])
	{
	int[][] a=new int[10][10];
	int[][] b=new int[10][10];
	int[][] mul=new int[10][10];
	int r1,c1,r2,c2,i,j,k;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row and column for first matrix:");
	r1=sc.nextInt();
	c1=sc.nextInt();
	System.out.println("Enter the row and column for second matrix:");
	r2=sc.nextInt();
	c2=sc.nextInt();
	
	while(c1 !=r2)
	{
		System.out.println("Error! column of first matrix not equal to row of second.\n]n");
		System.out.println("Enter the row and column for first matrix:");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the row and column for second matrix:");
		r2=sc.nextInt();
		c2=sc.nextInt();
	}
	
	System.out.println("enter the elements of first matrix 1:\n");
	for(i=0;i<r1;++i)
		for(j=0;j<c1;++j)
			{
			System.out.println("enter the elements a"+(i+1)+""+(j+1));
			a[i][j]=sc.nextInt();
			}
	
	System.out.println("enter the elements of second matrix 1:\n");
	for(i=0;i<r2;++i)
		for(j=0;j<c2;++j)
		{
			System.out.println("enter the elements a"+(i+1)+""+(j+1));
			b[i][j]=sc.nextInt();
		}
	
	for(i=0;i<r1;++i)
		for(j=0;j<c2;++j)
		{
			mul[i][j]=0;
		}
	
	for(i=0;i<r1;++i)
		for(j=0;j<c2;++j)
			for(k=0;k<c1;++k)
			{
				mul[i][j]+=a[i][k]*b[k][j];
			}
	
	System.out.println("\nOutput Matrix:\n");
	for(i=0;i<r1;++i)
		for(j=0;j<c2;++j)
		{
			System.out.println(mul[i][j]);
			if(j==c2-1)
				System.out.println("\t\t");
		}
}
	
}	
//addmatrix	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

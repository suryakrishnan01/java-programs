import java.io.*;
import java.util.*;
class AddMatrix
{
	public static void main(String args[])
	{
	int[][] a=new int[10][10];
	int[][] b=new int[10][10];
	int[][] sum=new int[10][10];
	int r,c,i,j,k;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows(between 1 and 100):");
	r=sc.nextInt();
	System.out.println("Enter the number of columns(between 1 and 100):");
	c=sc.nextInt();
	
	System.out.println("enter the elements of first matrix 1:\n");
	for(i=0;i<r;++i)
		for(j=0;j<c;++j)
			{
			System.out.println("enter the elements a"+(i+1)+""+(j+1));
			a[i][j]=sc.nextInt();
			}
	
	System.out.println("enter the elements of second matrix 1:\n");
	for(i=0;i<r;++i)
		for(j=0;j<c;++j)
		{
			System.out.println("enter the elements a"+(i+1)+""+(j+1));
			b[i][j]=sc.nextInt();
		}
	
	for(i=0;i<r;++i)
		for(j=0;j<c;++j)
		{
			sum[i][j]=a[i][j]+b[i][j];
		}
		
	System.out.println("\nSum of two matrix is:\n\n");
	for(i=0;i<r;++i)
		for(j=0;j<c;++j)
		{
		System.out.print(sum[i][j]+" ");
		if(j==c-1)
		{
			System.out.println();
		}
		}
	}
}	
//commenting

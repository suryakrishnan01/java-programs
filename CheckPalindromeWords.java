import java.io.*;
import java.util.*;

class CheckPalindromeWords
{
	// create object of buffer class.
	
 
	// function to check palindrome
	boolean IsPalindrome(String s)
	{
		int l=s.length();
		String rev="";
		for(int i=l-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
			return true;
		else
			return false;
	}
 
	public static void main(String args[])throws IOException
    {
		Scanner br=new Scanner(System.in);
		// create function of palindromewords.
		CheckPalindromeWords ob=new CheckPalindromeWords();
        
		// enter the sentence.
		System.out.print("Enter the sentence : ");
        String s=br.nextLine();
        
        // to convert into upper case.
        s=s.toUpperCase();
 
        StringTokenizer str = new StringTokenizer(s,".?! ");
        int w=str.countTokens(); 
 
        String word[]=new String[w];
        for(int i=0;i<w;i++)
        {
            word[i]=str.nextToken();
        }
 
        int count=0;
        System.out.print("OUTPUT : ");
        for(int i=0; i<w; i++)
        {
            if(ob.IsPalindrome(word[i])==true)
            {
                count++;
                System.out.print(word[i]+" ");
            }
        }
 
        // To show the palindrome or not.
        if(count==0)
        System.out.println("No Palindrome Words");
        else
        System.out.println("\nNumber of Palindromic Words : "+count);
    }
}

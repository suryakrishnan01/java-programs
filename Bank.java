import java.io.*;

class Bank
{
    private String account_name;
    private int account_no;
    private String account_type;
    private double account_balance;
    Bank(String n,int no,String t,double b)
    {
        this.account_name=n;
        this.account_no=no;
        this.account_type=t;
        this.account_balance=b;
    }
    
    public void deposit(int amount)
    {
        account_balance+=amount;
        System.out.println("Deposited Successfully...");
    }
    
    public void withdraw(int money)
    {
        if(account_balance<money)
        {
            System.out.println("Withdraw Not Possible...");
        }
        else
        {
            account_balance-=money;
            System.out.println("Money after Withdrawn- " + account_balance);
        }
    }
    public void display()
    {
        System.out.println("Name- " + account_name);
        System.out.println("Balance- " + account_balance);
    }

	public static void main (String[] args) 
	{
	    
	  
	    Bank b=new Bank("surya",12345,"Savings",1000);
	    b.display();
	    b.withdraw(500);
	    b.deposit(200);
	    b.display();
		
	}
}
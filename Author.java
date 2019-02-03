import java.io.*;
class Author
{
    String firstName,lastName;
	Author(String fname,String lname)
	{
		this.firstName=fname;
		this.lastName=lname;
	}
	public void setFirstName(String fname)
	{
		firstName=fname;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String lname)
	{
		lastName=lname;
	}
	public String getlastName()
	{
		return lastName;
	}
	public static void main(String[] args)
	{
		Author a=new Author("surya","krish");
		a.setFirstName("krish");
		System.out.println(a.getFirstName());
		a.setLastName("surya");
		System.out.println(a.getlastName());
	}
}
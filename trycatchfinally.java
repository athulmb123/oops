public class trycatchfinally
{
public static void main(String args[])
{
	try
	{
	int [] num = { 1,2,3};
	System.out.println(num[7]);
	}
	catch (Exception e)
	{
	System.out.println("error occured in program");
	}
	finally
	{
	System.out.println("Try & Catch executed succesfully");
	}
}
}

package thread;
import java.util.*;
class NegativeBalance extends Exception 
{
	public String getMessage()
	{
		return "you have entered negative amount";
	}
}
class MinimumBalance extends Exception 
{
	public String getMessage()
	{
		return "you have entered excess amount";
	}
}
class Bank
{
	int amt,bal;
	Bank(int x)
	{
		bal=x;
	}
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter amount you want withdraw");
		amt=scan.nextInt();
	}
	void display()
	{
		try
		{
			if(amt<=0)
			{
				throw new NegativeBalance();
			}
			else if(amt>bal)
			{
				throw new MinimumBalance();
			}
			else
			{
				bal=bal-amt;
				System.out.println("please take your cash");
				System.out.println("your remaining balance is"+bal);
			}
		}
		catch(NegativeBalance e)
		{
			System.out.println(e.getMessage());
		}
		catch(MinimumBalance e)
		{
			System.out.println(e.getMessage());
		}
	}
}

public class Customexception {

	public static void main(String[] args) {
		Bank b=new Bank(10000);
		b.input();
		b.display();

	}

}

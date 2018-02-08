package example;
import java.util.*;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter an string");
		s=scan.nextLine();
		reverse r=new reverse();
		System.out.println(r.print(s));
		
	}
	public String print(String s)
	{
		String s1[]=s.split(" ");
		int m=s1.length;
		String st=new String();
		for(int i=m-1;i>=0;i--)
		{
			st=st+s1[i]+" ";
		}
		return st;
	}
}


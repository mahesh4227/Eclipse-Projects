package sample;
import java.util.*;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        String s,s1,s2;
        System.out.println("enter input");
        s=scan.next();
        int len=s.length();
        if(len%2!=0)
        {
        	System.out.println("false");
        	System.exit(0);
        }
         
        s1=s.substring(0, len/2);
        s2=s.substring(len/2, len);
        int m=s1.length();
        char a[]=s1.toCharArray();
        for(int i=0;i<m;i++)
        {
        	char temp=a[i];
        	a[i]=a[m-1];
        	a[m-1]=temp;
        }
        String s3=new String(a);
       if(s3.equals(s2)==true)
       {
    	   System.out.println("true");
       }
       else
       {
       System.out.println("false");
       }
	}

}

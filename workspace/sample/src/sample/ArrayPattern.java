package sample;

import java.util.Scanner;

public class ArrayPattern {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter n value");
      int n=scan.nextInt();
      int a[][]=new int[n][n];
      for(int i=0;i<n;i++)
      {
    	  for(int j=0;j<n;j++)
    	  {
    		  a[i][j]=scan.nextInt();
    		  }
    	  }
      cal(a,0,0,n,n);
	}

	private static void cal(int[][] a, int mlow, int nlow, int m, int n) {
		
		for(int j=0;j<n;j++)
		{
			System.out.println(a[mlow][j]);
		}
		for(int i=0;i<m;i++)
		{
			System.out.println(a[i][n-1]);
		}
		for(int i=n-1;i>=mlow;i--)
		{
			System.out.println(a[m-1][i]);
		}
		for(int i=m-1;i>mlow;i--)
		{
			System.out.println(a[i][nlow]);
		}
		if(nlow<n && mlow<=m)	
			cal(a,++mlow,++nlow,--m,--n);
		
	}
 

}

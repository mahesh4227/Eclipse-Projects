package sample;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("enter array size");
     int n=scan.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
    	 a[i]=scan.nextInt();
     }
     rev(a,n);
     for(int i=0;i<n;i++)
     {
    	 System.out.println(a[i]);
     }
	}
   public static int[] rev(int a[],int n)
   {
   int i,j;
     for(i=0;i<n/2;i++)
    	 {
    	 int temp=a[i];
     	 a[i]=a[n-1-i];
     	 a[n-1-i]=temp;
     	 
    	 }
     return a;
     
	}
}

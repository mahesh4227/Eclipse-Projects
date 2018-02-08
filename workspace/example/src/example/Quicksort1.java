package example;

import java.util.Scanner;

public class Quicksort1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter array size");
	    int n=scan.nextInt();
	    int a[]=new int[n];
	  for(int i=0;i<n;i++)
	    {
	    	a[i]=scan.nextInt();
	    }
	      sort (a,0,n-1);
	      for(int j=0;j<n;j++)
	      {
	    	  System.out.print(a[j]+" ");
	      }
		}

	private static void sort(int[] a, int start, int end) {
       if(start<end)
    	   
       {
    	   int p=partition(a,start,end);
    	   sort(a,start,p-1);
    	   sort(a,p+1,end);
       }
	}

	private static int partition(int[] a, int start, int end) {
		int pivot=a[end];
		int index=start-1;
		int temp=0;
		for(int k=start;k<end;k++)
		{
			if(a[k]<=pivot)
			{
				index++;
				if(index!=k)
				{
					temp=a[index];
					a[index]=a[k];
					a[k]=temp;
				}
			}
		}
		temp=a[index+1];
		a[index+1]=a[end];
		a[end]=temp;
		return index+1;
	}
	}



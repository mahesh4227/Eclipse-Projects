package example;

import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter array size");
    int n=scan.nextInt();
    int a[]={1,2,1,3,5,7};
  for(int i=0;i<n;i++)
    {
    	a[i]=scan.nextInt();
    }
      sort (a,0,n-1);
      for(int j=0;j<n;j++)
      {
    	  System.out.print(a[j]);
      }
	}

	private static void sort(int a[], int start, int end) {
		if(start<end)
		{
			int index=partition(a,start,end);
			sort(a,start,index-1);
			sort(a,index+1,end);
		}
		
	}

	private static int partition(int[] a, int start, int end) {
		int pivot=a[end];
		int index=start;
		for(int i=start;i<end;i++)
		{
			if(a[i]<=pivot)
			{
				swap(a[i],a[index]);
				index++;
			}
		}
		swap(a[index],a[end]);
		return index;
}

	private static void swap(int i, int j) {
      int temp=i;
      i=j;
      j=temp;
	}
}

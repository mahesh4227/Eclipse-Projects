package sample;

import java.util.Scanner;

public class Mergesorting {
	 static void merge(int arr[], int left, int middle, int right)
	    {
	        int n1 = middle - left + 1;
	        int n2 = right - middle;
	 
	        int Left[] = new int [n1];
	        int Right[] = new int [n2];
	 
	        for (int i=0; i<n1; ++i)
	            Left[i] = arr[left + i];
	        for (int j=0; j<n2; ++j)
	            Right[j] = arr[middle + 1+ j];
	          int i = 0,j = 0;
		        int k = left;
	        while (i < n1 && j < n2)
	        {
	            if (Left[i] <= Right[j])
	            {
	                arr[k] = Left[i];
	                i++;
	            }
	            else
	            {
	                arr[k] = Right[j];
	                j++;
	            }
	            k++;
	        }
	       while (i < n1)
	        {
	            arr[k] = Left[i];
	            i++;
	            k++;
	        }
	 	        while (j < n2)
	        {
	            arr[k] = Right[j];
	            j++;
	            k++;
	        }

	    }
	  static void sort(int arr[], int left, int right)
	    {
	        if (left < right)
	        {
	            int middle = (left+right)/2;
	 	            sort(arr, left, middle);
	               sort(arr , middle+1, right);
	 	            merge(arr, left, middle, right);
	        }
	    }
	 	    public static void main(String args[])
	    {
	 	    	Scanner scan=new Scanner(System.in);
	 	    	System.out.println("select the sorting technique");
	 	    	System.out.println("enter 1 for MergeSort");
	 	    	System.out.println("enter 2 for selection sort");
	 	    	int m=scan.nextInt();
	 	    	if(m>2)
	 	    	{
	 	    		System.out.println("please enter valid number");
	 	    	}
	 	    	if(m==1)
	 	    	{
	 	    		System.out.println("welcome to merge sort");
	 	    		System.out.println("enter n value");
		 	    	int n=scan.nextInt();
		        int arr[] = new int[n];
		        for(int i=0;i<n;i++)
		        {
		        	arr[i]=scan.nextInt();
		        }
		        sort(arr, 0, arr.length-1);
		        for(int j=0;j<n;j++)
		        {
		        	System.out.println(arr[j]);
		        }
		 	    } 
	 	    	if(m==2)
	 	    	{
	 	    		System.out.println("welcome to selection sort");
	 	    		System.out.println("enter n value");
		 	    	int n=scan.nextInt();
		        int a[] = new int[n];
		        for(int i=0;i<n;i++)
		        {
		        	a[i]=scan.nextInt();
		        }
		        selectionsort(a);
		        for(int j=0;j<a.length;j++)
		        {
		        	System.out.println(a[j]);
		        }
	 	    	}
	 	    	}

			private static int[] selectionsort(int[] a) {
				for(int i=0;i<a.length;i++)
				{
					int index=i;
					for(int j=i+1;j<a.length;j++)
					{
						if(a[j]<a[index])
						{
							index=j;
						}
						int temp=a[index];
						a[index]=a[i];
						a[i]=temp;
					}
				}
				return a;
              				
			}
	 	    	
	}


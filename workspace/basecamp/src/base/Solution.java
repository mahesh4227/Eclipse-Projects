package base;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static void customSort(int[] arr) {
	        int n=arr.length;
	        int a[]=new int[n+1];
	        //int arr[]=new int[m];
	        for(int i=0;i<n;i++)
	        {
	            for(int j=1;j<n;j++)
	            {
	                if(arr[i]>arr[j])
	                {
	                    int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	        Arrays.fill(a,0);
	        for(int i=0;i<n;i++)
	        {
	            a[arr[i]]++;
	        }
	        int max=0;
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]>=max)
	            {
	                max++;
	            }
	        }
	        for(int i=1;i<=max;i++)
	        {
	            for(int j=1;j<a.length;j++)
	            {
	            if(a[j]==max)
	            {
	            System.out.println(arr[j]);
	            }
	            }
	        }

	    }

	}

}

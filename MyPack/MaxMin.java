package MyPack;
import java.util.Scanner;

public class MaxMin {
	
	public static int getSmallest(int[] a, int total)
	{  
		int temp;  
		for (int i = 0; i < total; i++)   
		{  
			for (int j = i + 1; j < total; j++)   
		    {
				if (a[i] > a[j])   
		        {  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
		        }  	
		    }  
		}  
		return a[0];  
	}
	
	public static int getLargest(int[] a, int total){
		int temp;
		for (int i = 0; i < total; i++) 
		        {
		            for (int j = i + 1; j < total; j++) 
		            {
		                if (a[i] > a[j]) 
		                {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		        }
		       return a[total-1];
		}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		int largest,smallest;
		int maxSum,minSum,sum=0;
		//System.out.println("Number of elements in first array : ");
		n = scan.nextInt();
		int a[] = new int[n];
		//System.out.println("Enter elements : ");
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		
		largest = getLargest(a,n);
		smallest = getSmallest(a,n);
		
		for(int i=0;i<n;i++) {
			sum = sum + a[i];
		}
		
		maxSum = sum-smallest;
		minSum = sum-largest;
		
		System.out.println(minSum+" "+maxSum);
		
//		System.out.println(smallest);
//		System.out.println(largest);	
	}

}

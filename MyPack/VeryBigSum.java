package MyPack;
import java.util.Scanner;

public class VeryBigSum {
	
	public void calculation(Scanner scan) {
		int[] intArray = new int[20];
		int n = scan.nextInt();
		long sum=0;
		for(int i=0;i<n;i++)
		{
			intArray[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			sum = sum + intArray[i];
		}
		
		System.out.println(sum);
			
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//int n;
		VeryBigSum sum = new VeryBigSum();
		sum.calculation(scan);
	
	}

}

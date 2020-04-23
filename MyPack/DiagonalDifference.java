package MyPack;
import java.util.Scanner;
import java.lang.*;

public class DiagonalDifference {
	
	public void calculation(Scanner scan) {
		int first_sum = 0;
		int second_sum = 0;
		int[][] intArray = new int[20][20];
		int n = scan.nextInt();
		for(int i = 0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				intArray[i][j]=scan.nextInt(); 
			}
		}
		
		for(int i=0;i<n;i++) {
			first_sum = first_sum + intArray[i][i];
		}
		
		for(int i=0,j=n-1;i<n&&j>=0;i++,j--)
		{
			second_sum = second_sum + intArray[i][j];
		}
		
		System.out.println(Math.abs(first_sum-second_sum));
	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DiagonalDifference dd = new DiagonalDifference();
		dd.calculation(scan);
	}
}

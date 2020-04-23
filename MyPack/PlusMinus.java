package MyPack;
import java.util.Scanner;

public class PlusMinus {
	
	public void calculation(Scanner scan) {
		
		double pos = 0;
        double neg = 0;
        double zero = 0;
		int n = scan.nextInt();
		int[] intArray = new int[n];
		for(int i =0;i<n;i++)
		{
			intArray[i] = scan.nextInt();
		}
		
		for(int i =0;i<n;i++)
		{
			if(intArray[i]>0)
			{
				pos = pos + 1;
			}
			
			else if(intArray[i]<0)
			{
				neg = neg +1;
			}
			
			else
			{
				zero = zero + 1;
			}
		}
		
		System.out.println(pos/n);
		System.out.println(neg/n);
		System.out.println(zero/n);
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PlusMinus pm = new PlusMinus();
		pm.calculation(scan);		
	}
}

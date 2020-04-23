package MyPack;
import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		int i,j;
		
		for(i=0;i<n;i++)
		{
			for(j=2*(n-i); j>=0; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
			
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("# "); 
            } 
              
            // ending line after each row 
            System.out.println(); 
			
		}
		
	}

}



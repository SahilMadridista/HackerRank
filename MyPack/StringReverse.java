package MyPack;

import java.util.Scanner;

public class StringReverse {

	public StringReverse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		 	Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B = new StringBuilder(A).reverse().toString();

	        System.out.println(B);
	        System.out.println(A.equals(B) 
	        ? "Yes" : "No" );
	        
	        sc.close();

	}

}

package com.Pattern;
/*
          				1         
				      2 3 2       
				    3 1 2 3 3     
				  4 -1 0 1 2 3 4   
				5 5 5 5 5 5 5 5 5
 */
import java.util.Scanner;

public class pattern35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}

	private static void pattern(int n) {
		
		for(int row =1; row<=n; row++)
		{
			
			 for(int col=1; col<=(n*2)-1; col++)
			 {
				 if((row+col==n+1) || (col-row==n-1) || row==n)
				 {
					 System.out.print(row+" ");
					
				 }
				 else if(row+col>=n+1 && col-row<n-1)
				 {
					 System.out.print(col-row+" ");
					 
				 }
				 else 
				 {
					 System.out.print("  ");
				 } 
				
			 }
			
			 System.out.println();
		}
		
	}

}

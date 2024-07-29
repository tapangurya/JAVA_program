package com.Pattern;
/*
							  		1         
							      2 Z 2       
							    3 Y X W 3     
							  4 V U T S R 4   
							5 5 5 5 5 5 5 5 5 
  						
 */
import java.util.Scanner;

public class hw36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}

	private static void pattern(int n) {
		char ch = 'Z';
		for(int row =1; row<=n; row++)
		{
			 for(int col=1; col<=(n*2)-1; col++)
			 {
				 if((row+col==n+1) || (col-row==n-1)||row==n)
				 {
					 System.out.print(row+" ");
					 
				 }
				 else if(row+col>=n+1 && col-row<n-1)
				 {
					 System.out.print(ch +" ");
					 ch--;
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

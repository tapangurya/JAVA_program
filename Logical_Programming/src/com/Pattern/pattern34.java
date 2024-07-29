
package com.Pattern;
											/*
											 	        5         
												      4 5 6       
												    A B C D E     
												  2 3 4 5 6 7 8   
												1 2 3 4 5 6 7 8 9 
											 */
import java.util.Scanner;

public class pattern34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}

	private static void pattern(int n) {
		
		for(int row=1; row<=n;row++)
		{
			
			char ch = 'A';
			for(int col=1; col<=(n*2-1); col++)
			{
				if(row+col>=n+1 && col-row<=n-1) 
				{
					if(row==(n+1)/2) {
						System.out.print(ch+" ");
						
						ch++;
					}
					else
					{
						System.out.print(col+" ");
						
					}
					
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

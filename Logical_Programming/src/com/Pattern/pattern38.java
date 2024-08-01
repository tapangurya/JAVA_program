package com.Pattern;

import java.util.Scanner;
/*
 				        1         
				      1 2 3       
				    1 2 3 4 5     
				  1 2 3 4 5 6 7   
				1 2 3 4 5 6 7 8 9 
 */
public class pattern38 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
	}

	private static void pattern(int n) {
		
		for(int row =1; row<=n; row++)
		{
			int n2=1;
			for(int col=1; col<=n*2-1; col++)
			{
				if(row+col>=n+1 && col-row<=n-1 )
				{
					
					System.out.print(n2+" ");
					n2++;
					
				}
				
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}

}


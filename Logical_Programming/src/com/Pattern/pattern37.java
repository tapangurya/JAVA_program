package com.Pattern;

import java.util.Scanner;

public class pattern37 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
	}

	private static void pattern(int n) {
		for(int row =1; row<=n; row++)
		{
			for(int col=1; col<=n*2-1; col++)
			{
				if(row+col>=n+1 && col-row<=n-1 )
				{
					
					
					
				}
				
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}

}

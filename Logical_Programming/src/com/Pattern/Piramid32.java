package com.Pattern;

import java.util.Scanner;
public class Piramid32 {
	
	
	private static void pyramid(int num) 
	{	
		for(int row =1 ; row<=num; row++)
		{  

			for(int col=1; col<=(num*2-1); col++)
			{
				if(row+col>=num+1 && col-row<=num-1) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
			
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pyramid(n);
	}

}
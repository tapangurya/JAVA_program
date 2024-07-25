package com.Pattern;

			/*
				9   8 
				 8 9  
				 8 9  
				9   8 
			 */

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt(); 
		pattern(num);

	}

	public static void pattern(int num) 
	{
		char ch ='Z';
		for(int row=1;row<=num;row++)
		{ 
			for(int col=1; col<=num;col++)	
			{
				if((row+col==num+1) || (row==col)) 
				{
					if(col%2==1) {
					System.out.print("9 ");
					}
					else 
					{
						System.out.print( "8 ");
					}
				}
				else 
				{
					System.out.print(ch+" ");	
				}
			}
			System.out.println();
			ch--;
			
		}
		
	}

}


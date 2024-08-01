package com.Pattern;

/*
 * 								1 2 3 4 5 4 3 2 1 
								  2 3 4 5 4 3 2   
								    3 4 5 4 3     
								      4 5 4       
								        5
								        
								        
 */

import java.util.Scanner;

public class pattern45 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	pattern(num);
}

private static void pattern(int num) {
	int no2=0;
	for(int row =1; row<=num;row++)
	{
		for(int col=1; col<=num*2-1; col++)
		{
			if(row<=col && row+col<= num*2)
			{
				if(col<=num)
				{
					System.out.print(col+" ");
					no2 =col;
				}
				else
				{
					System.out.print(--no2+" ");
					
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

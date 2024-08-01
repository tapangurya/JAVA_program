package com.Pattern;
/*
 *                              1 2 3 4 5 
								1 2 3 4   
								1 2 3     
								1 2       
								1 
 */
import java.util.Scanner;

public class pattern43 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
	}

	private static void pattern(int num) {
		for(int row =1; row<=num; row++)
		{
			for(int col =1; col<=num; col++)
			{
				if(row+col<=num+1)
				System.out.print(col+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

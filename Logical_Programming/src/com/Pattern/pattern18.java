package com.Pattern;
/*
 *       	1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
 */
import java.util.Scanner;

public class pattern18 {
	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			Program(num);
		}

		private static void Program(int num) 
		{
			for(int row= 1; row <=num; row++)
			{
				for(int col=1; col<=row; col++)
				{
					System.out.print(col+" ");
				}
				System.out.println();
			}
			
		}
	}


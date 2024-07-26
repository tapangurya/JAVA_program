package com.Pattern;

/*
        1 
		2 2 
		3 3 3 
		4 4 4 4 
 */
import java.util.Scanner;

public class pattern19 {
	
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
					System.out.print(row+" ");
				}
				System.out.println();
			}
			
		}
	}


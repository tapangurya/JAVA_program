package com.Pattern;

import java.util.Scanner;

public class pattern23 {
	
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
				for(int col=1; col<=num; col++)
				{
					
						if(col==1) {
							System.out.print("1 ");
						}
						else if(row==col)
						{
							System.out.print("3 ");
						}
						else if(row==num) {
							System.out.print("2 ");
						}
						
						else if(row>col) {
							System.out.print("6 ");
							
						}
					
					
				}
				System.out.println();
			}
			
		}
	}


package com.Pattern;
/*
 					*               
					* *             
					*   *           
					*     *         
					*       *       
					*         *     
					*           *   
					* * * * * * * *
 */
import java.util.Scanner;

public class pattern20 {
	
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
					if(row==col||col==1||row==num )
					{
					System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			
		}
	}


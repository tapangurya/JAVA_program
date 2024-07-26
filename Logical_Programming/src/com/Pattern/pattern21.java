package com.Pattern;
/*
           [num =5;]
 		A         
		B C       
		D   E     
		F     G   
		H I J K L 
 */
import java.util.Scanner;

public class pattern21 {
	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			Program(num);
		}

		private static void Program(int num) 
		{
			char ch ='A';
			
			for(int row= 1; row <=num; row++)
			{
				
				for(int col=1; col<=num; col++)
				{
					if(row==col||col==1||row==num )
					{
					System.out.print(ch+" ");
					ch++;
					}
					else
						System.out.print("  ");
					
				}
				
				System.out.println();
			}
			
		}
	}


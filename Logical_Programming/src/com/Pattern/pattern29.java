package com.Pattern;
/*
 *      		  1 
			    B B 
			  3 3 3 
			D D D D 
 */
import java.util.Scanner;

public class pattern29 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
		

	}

	private static void pattern(int n) {
		char ch = 'A';
		for(int row=1; row<=n; row++)
		{
			
			for(int col=1; col<=n; col++)
			{
				if( row+col>=n+1)	
					{
						if(row%2==1)
						System.out.print(row+" ");
						else
						{
							System.out.print(ch+" ");
						}
					}
				  else 
					{
						System.out.print("  ");
					}
					
					
			}
			
			ch++;	
			
			System.out.println();
			
		}
		
	}

}

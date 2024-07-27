package com.Pattern;
/*
 *					    1 2 3 A 
						4 5 B C 
						6 D E F 
						G H I J  
 */
import java.util.Scanner;

public class pattern31 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
		

	}

	private static void pattern(int n) {
		char ch = 'A';
		int a = 1;
		for(int row=1; row<=n; row++)
		{
			
			for(int col=1; col<=n; col++)
			{
				if( row+col>=n+1)	
					{
						System.out.print(ch+" ");
						ch++;
					}
				  else 
					{
						System.out.print(a+" ");
						a++;
						
					}
					
				
					
			}
			
				
			
			System.out.println();
			
		}
		
	}

}

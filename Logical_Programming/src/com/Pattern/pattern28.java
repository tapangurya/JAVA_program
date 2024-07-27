package com.Pattern;
/*
 			A 
	      A B 
	    A B C 
	  A B C D 
	A B C D E 
 */
import java.util.Scanner;

public class pattern28 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
		

	}

	private static void pattern(int n) {
		
		for(int row=1; row<=n; row++)
		{
			char ch = 'A';
			for(int col=1; col<=n; col++)
			{
				
					if( row+col>=n+1)
					{
						System.out.print(ch+" ");
						ch++;
					}
					else {
						System.out.print("  ");
					}
				
			}
			System.out.println();
		}
		
	}

}

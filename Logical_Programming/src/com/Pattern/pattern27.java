package com.Pattern;
/* 
  							
 
 						* 
				      * * 
				    * * * 
				  * * * * 
				* * * * * 
 */
import java.util.Scanner;

public class pattern27 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
		

	}

	private static void pattern(int n) {
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=n; col++)
			{
				
					if( row+col>=n+1)
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				
			}
			System.out.println();
		}
		
	}

}

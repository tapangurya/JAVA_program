package com.Pattern;
/*
 *					    a a a a a 
						c 1 2 1 d 
						c 3 1 3 d 
						c 1 4 1 d 
						b b b b b   
 */
import java.util.Scanner;

public class pattern32 
{

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
				if(row==1)	
				{
					System.out.print("a"+" ");
				}
				else if(row==n)
				{
					System.out.print("b"+" ");
				}
				else if(col==1)	
				{
					System.out.print("c"+" ");
				}
				else if(col==n)
				{
					System.out.print("d"+" ");
				}
				else if (col+row==n+1){
					System.out.print("1"+" ");
				}
				else if(row==col) {
					System.out.print("1"+" ");
				}
				else {
					System.out.print(row+" ");
				}
			}
			
			System.out.println();
			
		}
		
	}

}

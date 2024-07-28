package com.Pattern;
/*
						 1
						 1 1
						 1 2 1
						 1 3 3 1
						 1 4 6 4 1
 */
import java.util.Scanner;

public class pascalePattern {

	public int factorial(int i)
	{
		if (i == 0)
		{
			return 1;
			
		}
		return i * factorial(i - 1);
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}
	private static void pattern(int n) {
pascalePattern g = new pascalePattern();
		int row, col;
		for (row = 0; row <= n; row++) {
			
			for (col = 0; col <= row; col++) 
			{

				// nCr formula
				System.out.print(
					" "
					+ g.factorial(row)
						/ (g.factorial(row - col)
							* g.factorial(col))
						);
			}

			// for newline
			System.out.println();
		}
		
	}
		
	}

	



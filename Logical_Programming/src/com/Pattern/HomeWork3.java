package com.Pattern;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		pattern(num);

	}

	private static void pattern(int num) 
	{	
		for(int row =1 ; row<=num; row++)
		{  
			char ch = 'P';
			for(int col=1; col<=num; col++)
			{
				if(row+col==num+1||col==row)
				{
					System.out.print(ch+" ");
				}
				else 
				{
					System.out.print((row+col)/2+" ");
				}
				ch++;
			}
			System.out.println();
			
		}
	}

}

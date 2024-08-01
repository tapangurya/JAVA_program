package com.Pattern;



import java.util.Scanner;

public class pattern47 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	pattern(num);
}

private static void pattern(int num) {
	for(int row =1; row<=num;row++)
	{
		for(int col=1; col<=num*2-1; col++)
		{
			if (row<=col && row+col<=num*2)
			{
				if(row==1)
				{
					System.out.print("*"+" ");
				}
				else if( row==col)
				{
					System.out.print("$"+" ");
				}
				else if(row+col== num*2)
				{
					System.out.print("+"+" ");
				}
				
				else {
					System.out.print(row+col+" ");
				}
				
			}
			else 
			{
				System.out.print("  ");
				
		    }
			
		}
		System.out.println();
	}
	
}
}

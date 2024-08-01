package com.Pattern;
/*
 				* * * * * * * * * 
				  $ 3 4 5 6 7 +   
				    $ 4 5 6 +     
				      $ 5 +       
				        $  
 */


import java.util.Scanner;

public class pattern49 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	pattern(num);
}

private static void pattern(int num) {
	for(int row =1; row<=num;row++)
	{
		char ch ='Z';
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
				else if(row<col)
				{
					System.out.print(col+" ");
				}
				
				else if(col==num || col+row<=num*2) {
					System.out.print(ch+" ");
					ch--;
				}
				else
				{
					System.out.print("  ");
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

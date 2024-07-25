package com.Pattern;
/*
 			Z   Z 
			 Y Y  
			 X X  
			W   W 

 */
import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		pattern(num);

	}

	public static void pattern(int num) {
		char ch = 'Z';
		for(int row =1 ; row<=num; row++)
		{  
			for(int col=1; col<=num; col++)
			{
				if(row+col==num+1||col==row)
				{
					System.out.print(ch+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			ch--;
		}
		
	}

}

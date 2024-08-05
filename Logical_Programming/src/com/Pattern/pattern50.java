package com.Pattern;



import java.util.Scanner;
/*
 	Diomnd
 							    *    
							   ***   
							  *****  
							 ******* 
							*********
							 ******* 
							  *****  
							   ***   
							    *   
 */
public class pattern50 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	pattern(num);
}

private static void pattern(int num) {
	int ne = num*2-1;
	for(int row =1; row<=ne;row++)
	{
		for(int col=1; col<=ne; col++)
		{
			if ((row+col>=num+1)&& (col-row<=num-1) && (row-col<=num-1) && (row+col<=num*3-1)) {
				System.out.print("*");
				
			} else {
					System.out.print(" ");
			}
		}
		
		System.out.println();
	}
	
}
}

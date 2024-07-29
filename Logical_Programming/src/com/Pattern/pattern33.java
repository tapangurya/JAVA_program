
package com.Pattern;

import java.util.Scanner;

/*
 							        1         
							      A 2 B       
							    C D 3 E F     
							  G H I 4 J K L   
							M N O P 5 Q R S T 
 */
public class pattern33 {
	
	
	private static void pyramid(int num) 
	{	
		char ch = 'A';
		for(int row =1 ; row<=num; row++)
		{  
			
			for(int col=1; col<=(num*2-1); col++)
			{
				if(row+col>=num+1 && col-row<=num-1) 
				{
					if(col==(num*2)/2)
					{
						System.out.print(row+" ");
						
						
					}
					else
					{
						System.out.print(ch+" ");
						
						ch++;
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
			
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pyramid(n);
		
	}

}
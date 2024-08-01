package com.Pattern;



import java.util.Scanner;

public class pattern48 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	pattern(num);
}

private static void pattern(int num) {
	char ch = 'A';
	int num2 =0;
	for(int row =1; row<=num;row++)
	{
		for(int col=1; col<=num*2-1; col++)
		{
			if (row<=col && row+col<=num*2) {
				if (col<=num) {
					System.out.print(ch+" ");
					ch++;
					num2=col;
				}
				else
				{
					System.out.print(--num2+" ");
				}
				
			} else {
					System.out.print("  ");
			}
		}
		
		System.out.println();
	}
	
}
}

package com.Pattern;
/*
				    1 
					1 1 
					1 2 1 
					1 3 3 1 
					1 4 6 4 1
 */
import java.util.Scanner;

public class patternH26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt(); // You can change this to generate more or fewer rows
        generatePascalsTriangle(numRows);
    }

    public static void generatePascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][];
        
        // Initialize the triangle
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
        }
        
        // Fill the triangle
        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        
        // Print the triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    	
	}
}

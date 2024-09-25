package binsearch;
import java.util.Scanner;

public class findbybinsearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = " ";
		int number = 0;
		
		//int [] matrix = new int[]{1,2,3,4};

		int [][] matrix = new int[][] {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
	
		
		/*
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			*/
		
		System.out.println("Enter a number between 1 and 12");
		input = scan.nextLine();
		number = Integer.parseInt(input);
		//System.out.println(number);
		
		if(number <= 12) {
			//call binary search function
			System.out.println(b_search(matrix, number));
		}else {
			System.out.println("Incorrect Number, try again");
		}
		}
	
	public static int b_search(int[][]matrix, int number) {
		//this is the linear search
		for(int i = 0; i < matrix.length; i++) {
			//what is matrix[i]
			for(int j = 0; j < matrix[i].length; j++) {
				//matrix[i][j] is the item at row i, column j
				if (matrix[i][j] == number) {
					return i, j;
				}
			}
		}
		return -1;
	}
	}

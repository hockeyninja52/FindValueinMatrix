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
		int start = 0;	//1
		int end = matrix.length - 1;	//1
		while(start <= end) { //1
			int mid = (start + end) / 2; //1
			if (mid == number) { //1
				return mid;
			} else {
				if (mid < number) { //search the larger part of the half of the array //1
					start = mid + 1; //1
				} else { //search the smaller part of the half of the array
					end = mid - 1;
				}
			}
		} //4 * log(n) + 2 
		return -1;
	}
	}
	
			
			//System.out.println("The item int(" + r + "([" + c + "] is " + matrix[r][c]);


	








package chap01.array.twoD;

import java.util.Scanner;

public class ArraysInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[5][5];
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

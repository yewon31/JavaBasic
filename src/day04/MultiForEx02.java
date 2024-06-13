package day04;

import java.util.Scanner;

//중첩 for문 - 사각형
public class MultiForEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int col = scan.nextInt(); //가로(열)
		int row = scan.nextInt(); //세로(행)
		
		/*
		 * 
		ex)5,4 
		*****
		*****
		*****
		*****
		 */
		
		
		//반복의 중첩
		for(int i = 1; i <= row; i++) { //세로(행)
			for(int j = 1; j <= col; j++ ) { //가로(열)
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
}

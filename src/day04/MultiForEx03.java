package day04;

import java.util.Scanner;

//중첩 for문 - 별 찍기
public class MultiForEx03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();

		/*
★
★★
★★★
★★★★
★★★★★
		*/
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		/*
★★★★★
★★★★
★★★
★★
★
	*****
	*/
		
		System.out.println("====================");
		
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= star+1-i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		/*
★★★★★
★★★★
★★★
★★
★
	*/
		
		System.out.println("====================");
		
		for(int i = 1; i <= star; i++) {
			for(int j = star+1-i; j >= 1; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		/*
    *
   **
  ***
 ****
*****
		*/
		
		System.out.println("====================");
		
		for(int i = 1; i <= star; i++) { //행
			for(int j = 1; j <= star-i; j++ ) { //공백
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++ ) { //별
				System.out.print("★");
			}
			System.out.println();
		}
		
		/*
    * 1 1+0
   *** 3 2+1
  ***** 5 3+2
 ******* 7 4+3
********* 9 5+4
		*/
		
		System.out.println("====================");
		
		for(int i = 1; i <= star; i++) { //행
			for(int j = 1; j <= star-i; j++) { //공백
				System.out.print(" ");
			}
			for(int k = 1; k <= i*2-1; k++ ) { //별
				System.out.print("★");
			}
			System.out.println();
		}
	} //main
}

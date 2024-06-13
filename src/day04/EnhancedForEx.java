package day04;

//향상된 for문
public class EnhancedForEx {
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9};

		/***** 기본 for문 *****/
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("==================");
		
		
		/***** 향상된 for문 *****/
		for(int v : arr) {
			System.out.print(v + " "); //배열의 값을 순서대로 v에 담는다.
		}
		System.out.println("");
		System.out.println("==================");
		
		
		
		
		char[] arr2 = {'A', 'B', 'C', 'D', 'E'};
		for(char c : arr2) {
			System.out.print(c + " ");
		}
		System.out.println("");
		System.out.println("==================");

		
		//향상된 for문을 이용해서 합계와, 평균(실수부분)을 출력.
		int[] score = {33, 55, 43, 23, 43, 66};
		int sum = 0;
		for(int tmp : score) {
			sum += tmp;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/score.length);
		System.out.printf("평균 : %.2f\n", (double)sum/score.length);
		System.out.println("==================");
	}
}

package day05;

import java.util.Arrays;

//배열 정렬(버블정렬, 가장 큰 수를 뒤로) + 퀵정렬
public class Arraysort2 {
	
	public static void main(String[] args) {
		
		//정렬을 하는 방법 9~10개 정도 됨
		//선택정럴, 버블정렬 <- 좀 느림
		
		/************ 버블정렬 ************/
		//가장 느림
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
		/*
		1회전
				5, 1, 23, 43, 100, 40, 200
		2회전
				1, 5, 23, 43, 40, 100, 200
		3회전
				1, 5, 23, 40, 43, 100, 200 끝
		 */
		

		
		/*
		 * i:0 → j:0, 1, 2, 3, 4, 5, 6
		 * i:1 → j:0, 1, 2, 3, 4, 5
		 * i:2 → j:0, 1, 2, 3, 4
		 * i:3 → j:0, 1, 2, 3
		 * i:4 → j:0, 1, 2
		 * i:5 → j:0, 1
		 * 
		 */
		
		//바깔 반복문 - 회전수
//		for(int i = 0; i < arr.length - 1; i++) {
//			//안쪽 반복문 - 자리바꿈
//			for(int j = 0; j < arr.length-1-i; j++) {
//				if(arr[j] > arr[j+1]) {
//					int tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}
//			}
//			System.out.println((i+1) +"회전 : " + Arrays.toString(arr));
//		}
//		
//		System.out.println();
//		System.out.println(Arrays.toString(arr));
		
		/************ 퀵정렬 ************/
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

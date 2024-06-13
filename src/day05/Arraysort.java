package day05;

import java.util.Arrays;

//배열 정렬(선택정렬, 가장 작은 수를 앞으로)
public class Arraysort {
	
	public static void main(String[] args) {
		
		//정렬을 하는 방법 9~10개 정도 됨
		//선택정럴, 버블정렬 <- 좀 느림
		
		/************ 선택정렬 ************/
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
		/*
		1회전 : 1번 칸 맞추기
				1, 23, 5, 43, 200, 100, 40 (5와 1을 비교, 1이 더 작아서 바뀜)
		2회전 : 2번 칸 맞추기
				1, 5, 23, 43, 200, 100, 40
		3회전
				1, 5, 23, 43, 200, 100, 40
		4회전
				1, 5, 23, 40, 200, 100, 43
		5회전
				1, 5, 23, 40, 43, 200, 100
		마지막
				1, 5, 23, 40, 43, 100, 200
		 */
		
		/*
		 * i:0 → j:1, 2, 3, 4, 5, 6
		 * i:1 → j:2, 3, 4, 5, 6
		 * i:2 → j:3, 4, 5, 6
		 * i:3 → j:4, 5, 6
		 * i:4 → j:5, 6
		 * i:5 → j:6
		 * 
		 */
		
		//바깔 반복문 - 회전수
		for(int i = 0; i < arr.length - 1; i++) { //0~5
			//안쪽 반복문 - 자리바꿈
			for(int j = i+1; j < arr.length; j++) { //1~6
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println((i+1) +"회전 : " + Arrays.toString(arr));
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}

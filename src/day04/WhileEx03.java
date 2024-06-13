package day04;

import java.util.Arrays;

//배열
public class WhileEx03 {
	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		
//		int i = 0;
//		int sum = 0;
//		
//		while(i<arr.length) {
//			//System.out.println(arr[i]);
//			sum += arr[i];
//			i++;
//		}
//		
//		System.out.println("배열 요소 합 : " + sum);
		
		//배열에 순서대로 값 저장
		int[] arr = new int[10];
		int i=0;
		while(i<arr.length) {
			arr[i] = ++i;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}
}

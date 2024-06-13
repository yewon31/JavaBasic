package day05;

import java.util.Arrays;

//배열 삭제
public class ArrayDelete {

	public static void main(String[] args) {
		
		//배열의 삭제 - 사실 배열은 삭제가 없음.
		//마치 삭제된것 처럼 보이게함
		/*
		1. 삭제할 위치 다음값들을 하나씩 당겨옴
		2. 길이 -1 인 새로운 배열에 값을 옮겨담음.
		*/
		
		int[] arr = {1,2,3,4,5,6,7, 8,9,10};
		
		int targetIndex = 5;

		for(int i = targetIndex; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		int[] newArr = new int[arr.length - 1];

		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		
		arr = newArr; //arr이 newArr로 바뀜
		
		newArr = null;
		
		System.out.println(Arrays.toString(arr));
	}
}

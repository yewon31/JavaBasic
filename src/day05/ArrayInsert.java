package day05;

import java.util.Arrays;

//배열 맨 뒤에 값 추가
public class ArrayInsert {

	public static void main(String[] args) {

		//배열은 크기가 고정 - 마치 추가되는 것처럼
		/*
		1. 원본 배열의 + 1 크기의 새로운 배열을 만든다.
		2. 값을 옴긴다.
		3. 마지막에 값을 하나 추가한다.
		*/
		
		int[] arr = {10,20,30,40,50};
		int data = 60; //추가할 값

		//1.
		int[] newArr = new int[arr.length + 1];
		
		//2.
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		//3.
		newArr[newArr.length-1] = data;
		
		//4.
		arr = newArr; //arr이 newArr로 바뀜
		
		//5. newArr삭제
		newArr = null;
		
		System.out.println(Arrays.toString(arr));
	}

}

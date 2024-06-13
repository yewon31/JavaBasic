package day06;

import java.util.Arrays;

//Queue(큐)
public class MethodEx06 {
	public static void main(String[] args) {
		//Queue - First In First Out (FIFO)

		push(5);
		push(6);
		push(7);
		push(8);
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(Arrays.toString(arr));
	}

	/*** 전역변수 ***/
	static int[] arr = {1,2,3,4};
	
	static void push(int data) {
		
		//1. 배열크기 +1
		//2. 원본배열의 요소를 복사
		//public static <T> T[] copyOf(T[] original, int length);
		int[] temp = Arrays.copyOf(arr, arr.length + 1 ); //배열명, 복사할 길이
		//3. 마지막에 데이터를 추가
		temp[temp.length - 1] = data;
		//4. 원본배열 변경
		arr = temp;
		temp = null;
		
	}
	
	//pop - 특정요소를 마지막에서 삭제, 반환 - 삭제된 데이터를 반환
	static int pop() {
		
		if(arr.length > 0) {
			//1. 삭제할 데이터를 백업
			int data = arr[0];
			
			//2. arr가 -1 인 사본 배열을 만든다.
			//int[] temp = new int[arr.length - 1];
			
			//3. 배열의 1번째 요소~마지막까지 복사
			//for(int i=1; i<arr.length; i++) {
			//	temp[i-1] = arr[i];
			//}
			
			//4. 원본배열을 바꾼다.
			arr = Arrays.copyOfRange(arr, 1, arr.length); //복사할배열, 시작위치, 끝위치
			
			//5. 삭제된 데이터를 반환 1-> 2 -> 3 ....- > 8 삭제순서
			return data; //삭제한 데이터를 반환
		}
		return 0;
		
	}
}

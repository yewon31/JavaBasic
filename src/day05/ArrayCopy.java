package day05;

import java.util.Arrays;

//배열의 복사(얕은 복사 / 깊은 복사)
public class ArrayCopy {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		
		/********** 얕은 복사 **********/
		//주소값을 동한 복사 (원본배열에도 실제 영향을 미침) //똑같은 키를 줌
		int[] newArr = arr; //키만 복사해서 줌

		System.out.println(newArr == arr); //true
		System.out.println();
		
		newArr[0] = 100; //원본배열에 영향 o
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		
		System.out.println();
		
		
		/********** 깊은 복사 **********/
		//완전 새로운 배열을 만들어서 복사 //똑같은 방을 줌
		// 깊은복사
		int[] arr2 = new int[arr.length]; //5

		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}

		System.out.println(arr2 == arr); //false
		System.out.println();
		
		arr2[0] = 1000; //원본배열에 영향 x
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}
}

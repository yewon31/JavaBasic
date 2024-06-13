package day05;

import java.util.Arrays;

//이진탐색 알고리즘
public class ArraySearch2 {
	
	public static void main(String[] args) {
		//이진탐색 - 반반 분할해서 값을 찾아가는 방법.
		//조건 - 배열이 정럴이 되어있어야함
		
		/*
			1. start = 0, end = 배열의마지막 을 처음에 2개를 배치
			2. 중간값을 구함
			3. 중간값이 찾는값인지 확인
			4. 찾는값이 중간값보다 작으면, end 중간값 -1
			5. 찾는값이 중간값보다 크면, start 중간값 +1
			반복
			start와 end가 교차되면 끝 
		 */
		
		
		int[] arr = {1,3,10,20,80,100};

		int find = 80;
		int start = 0; 
		int end = arr.length - 1;
		
		while(start<=end) { //end가 start보다 작으면 실행x

			int mid = (start + end) / 2; //짝수, 홀수 상관x
			if(arr[mid] == find) { //찾음
				System.out.println("찾는 값은 " + mid + "번째 위치함");
				break; //더이상 값을 찾을 필요가 없음
			}
			
			if(arr[mid] < find) {
				start = mid + 1; //시작값을 중간값 + 1
				} else {
				end = mid - 1;
			}
		}
		
		if(start>end) {
			System.out.println(find + "는 없습니다.");
		}
		
		System.out.println(Arrays.binarySearch(arr, find)); //배열이름, 찾을 값
		//음수가 나오면 값이 없다는 뜻
		//양수가 나오면 해당 위치가 나옴		
	}
}

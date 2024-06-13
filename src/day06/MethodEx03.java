package day06;

//메서드(함수) + 반환유형x(void)
public class MethodEx03 {
	
	public static void main(String[] args) {
		
		/*
		반환유형(return type)
		1. 반환유형은 메서드가 돌려주는 값에 대한 타입.
		2. 반환유형이 있는 메서드는 호출문이 값이되기 때문에, println() 구문안에서 출력 가능
		3. 반환이 없는 경우에는 반환 유형자리에 void라고 적습니다.
		*/
		
		System.out.println( add(1, 2) );
		System.out.println( add( add(1, 2), add(3, 4) ) );
		
		//System.out.println( sub(5, 3) );
		//int result = sub(5, 3);
		sub(5, 3); //반환이 없는 메서드는 단순히 호출만 가능합니다.
		
		confirm(-100);

	}//main

	//매개변수 2개 받아서, 두 매개변수의 합을 리턴
	static int add(int a, int b) {
		return a + b;
	}
	
	//반환유형이 없는 메서드
	static void sub(int a, int b) {
		System.out.println("a - b = " + (a-b) );
		return;
	}
	
	//이 매개변수는 반드시 양수여야 합니다.
	static void confirm(int num) {
		
		if(num < 0) {
			System.out.println("0보다는 큰값을 입력하세요");
			return; //함수의 종료
			//int a = 10; //return문 아래에는 프로그램 코드를 적을 수 없음.
		}
		System.out.println("전달받은 매개변수 : " + num);
	}
	
	
}

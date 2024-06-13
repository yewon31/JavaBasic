package day06;

//메서드(함수)
public class MethodEx01 {
	
	public static void main(String[] args) {
		
		/*
			- 메서드는, 다른 메서드안에서 선언할 수 없음.
			- main은 사실 메서드 입니다.
			- main밖에, 클래스안 어디서든 선언할 수 있습니다.
		*/
		
		//함수의 호출
		int result = calSum();
		System.out.println("1~10까지 합 : " + result);
		
		String result3 = randomStr();
		System.out.println("A~Z까지 합 : " + result3);
		
		//리턴이 있는 함수는 출력문 안에서 바로 호출이 됩니다.
		System.out.println("A~Z까지 합 : " + randomStr());
	}//main
	
	//반환유형 메서드이름()
	static int calSum() {

		System.out.println("calSum 호출됨");
		
		//1~10까지 합계
		int sum = 0;
		
		for(int i =1; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String randomStr() {
		System.out.println("randomStr 호출됨");
		
		//A~Z까지 합계
		String str = "";
		
		for(char c='A'; c<='Z'; c++) {
			str += c;
		}
		
		return str;
	}
}

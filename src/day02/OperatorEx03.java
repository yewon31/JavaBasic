package day02;

//2항 연산자(논리 연산자)
public class OperatorEx03 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//&& : 만일 왼쪽 항이 false일 경우에는 오른쪽 항을 수행하지 않고 무조건 false를 반환합니다.
		if( x != 10 && ++y == 21 ) { //F & T = F
			 System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		System.out.println("x 값은 : " + x);
		System.out.println("y 값은 : " + y);
		System.out.println("---------------------");
		
		//|| : 만일 왼쪽 항이 true일 경우에는 오른쪽 항을 수행하지 않고 무조건 true를 반환합니다.
		if( x == 10 || ++y == 21 ) { //T | F = T
			 System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		System.out.println("x 값은 : " + x);
		System.out.println("y 값은 : " + y);
		System.out.println("---------------------");
		
	}
}

package day06;

//메서드 안에서 메서드 호출, 재귀호출
public class MethodEx07 {
	public static void main(String[] args) {

		method01(); //동기적인 호출 (순서대로)

		//재귀적인 호출 - 메서드 안에서 자신을 호출시킴, 성능은 안좋음
		recursive(1);
		System.out.println( factorial(5) );
	}

	static void method01() {
		System.out.println("method1 start");
		method02();
		System.out.println("method1 end");
	}

	static void method02() {
		System.out.println("method2 start");

		System.out.println("method2 end");
	}
	
	
	static void recursive(int a) {
		if(a==10) return; //탈출 구문
		System.out.println(a + "");
		a++;
		recursive(a);
	}
	
	static int factorial(int a) {
		if(a==1) return 1; //탈출 구문
		return a * factorial(a-1);
	}

}

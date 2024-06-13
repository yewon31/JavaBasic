package day01;

//연산 시 형변환
public class CastingEx03 {

	public static void main(String[] args) {
		
		char c = 'A';
		int i = 2;
		System.out.println(c+i); //67
		
		char cc = (char)(c+i); //괄호해야함
		System.out.println(cc); //C
		
		//규칙1) int보다 작은 타입의 연산은 무조건 int
		//byte + byte -> int
		//byte + short -> int
		//int + byte -> int
		//char + int -> int
		
		int k = 3;
		double d = 3.14;
		System.out.println(k+d); // 6.1400..1
	}
}
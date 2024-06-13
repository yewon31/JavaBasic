package day02;

//2항 연산자
public class OperatorEx02 {
	public static void main(String[] args) {
		//산술연산
		int i = 7/3;
		int j = 7%3;
		int k = 7*3;
		
		System.out.println("i = " + i); //2
		System.out.println("j = " + j); //1
		System.out.println("k = " + k); //21
		System.out.println("------------------1");
		
		//비교연산
		System.out.println( i == j );
		System.out.println( i != j );
		System.out.println( i >= j );
		System.out.println( i <= j );
		System.out.println( i < j );
		System.out.println("------------------2");
		System.out.println( k % 2 == 0 ); //21 나머지 2 //짝수
		System.out.println( k % 2 != 0 ); //홀수
		System.out.println( k % 5 == 0 ); //5의 배수
		System.out.println("------------------3");
		
		//비트연산자
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		System.out.println( a&b ); //둘다 1이면 1 //0000 0001
		System.out.println( a|b ); //하나라도 1이면 1 //0000 0111
		System.out.println( a^b ); //다르면 1 //0000 0110
		System.out.println("------------------4");
		
		//비트 쉬프트 >> <<
		int num = 192; //1100 0000
		System.out.println( num >> 2 );//48 //0011 0000
		System.out.println( num << 2 );//768 //0011 0000 0000
		System.out.println("------------------5");
		
	}
}

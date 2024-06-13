package day02;

//단항 연산자
public class OperatorEx01 {
	public static void main(String[] args) {
		
		//부호 연산자
		int i = +3;
		int j = -i;
		
		
		//증감 연산자
		int k = 1;
		int h = k++; //후위 연산 - 먼저 값이 대입되고 그 다음에 증가
		System.out.println("k값 : " + k); //2
		System.out.println("h값 : " + h); //1
		System.out.println("--------------------");
		
		int x = 1;
		int y = ++x; //전위 연산 - 증가되고 대입
		
		System.out.println("x값 : " + x); //2
		System.out.println("y값 : " + y); //2
		System.out.println("--------------------");
		
		//보통 이렇게 사용
		x = 1;
		x++;
		++x;
		System.out.println("x값 : " + x); //3
		System.out.println("--------------------");
		
		//비트연산자 ~
		byte b = 10; //0000 1010
		System.out.println( ~b ); //1111 0101 → -11
		System.out.println( ~b + 1 ); //-10 → 반대로 뒤집고 +1하면 보수
		System.out.println("--------------------");
		
		//논리 반전 연산자 ~
		System.out.println( !true );
		System.out.println( !false ); //조건식을 세울 때 사용됨
		System.out.println("--------------------");
		
		boolean bool = !true;
	}
}

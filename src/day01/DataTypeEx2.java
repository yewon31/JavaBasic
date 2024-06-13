package day01;

public class DataTypeEx2 {

	public static void main(String[] args) {
		
		//단일 문자를 저장하는 char 타입
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1); //A
		System.out.println(c2); //A (아스키코드 65)
		System.out.println("-----------------------------");
		
		//유니 코드 2byte
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uC00D';
		
		System.out.println(c3); //가
		System.out.println(c4); //가 (유니코드)
		System.out.println(c5); //쀍 (유니코드 C00D)
		System.out.println("-----------------------------");
		
		String s1 = "Hello ";
		String s2 = "World ";
		String s3 = "^0^";
		System.out.println(s1 + s2 + s3);
		System.out.println("hello" + 100);
		System.out.println("200" + 100); //200100
		System.out.println(100+200 + "300"); //300300
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10); //75 → 문자(char)와 문자열의 차이, char+int->int
		System.out.println("-----------------------------");
		
	}
}







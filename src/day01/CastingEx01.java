package day01;

//자동형변환
public class CastingEx01 {

	public static void main(String[] args) {
		
		byte b = 10;
		short s = b; // byte → short 자동 형변환
		int i = b; // byte → int 자동 형변환
		long l = b; // byte → long 자동 형변환
		
		char c = '가'; //2byte
		int j = c; // char >> int 자동 형변환
		System.out.println(j);
		
		int k = 1000;
		double d = k;
	}
}







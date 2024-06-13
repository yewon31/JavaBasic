package day01;

public class DataTypeEx {

	public static void main(String[] args) {
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b2 = -32768;
		
		int c = 2147483647; //최대값 2,147,483,647
		int c2 = -2147483648; //기본타입
		
		long d = 123123123123L; //L 붙임
		System.out.println(d);
		
		/*
		 * 2진수 - 0b 붙임
		 * 8진수 - 0 붙임
		 * 16진수 - 0x 붙임
		 */
		
		int bin = 0b1010; // 2진수 1010 = 10진수 10
		System.out.println("2진수 1010 = " + bin + "입니다.");
		System.out.println("-----------------------------");
		
		//실수형 타입
		float f1 = 3.14F; // F 붙임
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);

		float f2 = 3.141592653F; // F 붙임
		double d2 = 3.141592653;
		System.out.println(f2); //float 실수7자리까지
		System.out.println(d2); //double 실수15자리까지
		
		//e표기법
		//나타낼 수 있는 소수점 자리가 너무 크거나, 작은 경우 컴퓨터가 알아서 표기
		float f3 = 314.15e-2F; //e-2자리
		float f4 = 0.031415e2f; //e2자리
		System.out.println(f3); //3.1415
		System.out.println(f4); //3.1415
		System.out.println("-----------------------------");
		
		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);
	}
}







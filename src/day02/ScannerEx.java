package day02;

import java.util.Scanner;

//스캐너
public class ScannerEx {
	public static void main(String[] args) {
		
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
				
		//2. 스캐너로 데이터 입력받기
		System.out.print("이름 > ");
		String name = scan.next(); //공백앞까지 입력받음
		
		System.out.print("나이 > ");
		int age = scan.nextInt(); //정수를 입력받음
		
		System.out.print("키 > ");
		double cm = scan.nextDouble(); //실수를 입력받음
		
		//nextLine과 다른 입력구문을 사용하면, 입력이 무시되고 넘어가는 경우가 있음
		//이전에 이름/나이/키 입력할 때 enter 입력했던 게 남아있었음
		//next() 메서드를 사용한 후 nextLine() 메서드를 한 번 더 사용하면 버퍼에 남아있는 개행 문자를 제거하여 다음 nextLine() 호출에서 정상적으로 입력을 받을 수 있음
		System.out.print("자기소개 > ");
		scan.nextLine(); //버퍼에 남아있는 개행 문자 제거
		String intro = scan.nextLine(); //공백 포함 문자열을 입력받음

		System.out.println();
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 키 : " + cm);
		System.out.println("자기소개 : " + intro);
		
		//3. 스캐너 종료
		scan.close();
	}
}

package day03;

import java.util.Scanner;

public class IfEx02 {
	
	public static void main(String[] args) {
		
		//점수를 입력받아서 학점 부여
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력 > ");
		int point = scan.nextInt();
		
		
		if(point >= 90) {
			//90이상일때 또다른 조건을 검사하고 싶어짐
			if(point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
		} else if(point >= 80) {
			System.out.println("B학점");
		} else if(point >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("재수강");
		}
	}
}

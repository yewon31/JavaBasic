package day03;

import java.util.Arrays;

public class IfEx01 {
	
	public static void main(String[] args) {
		
		//0~100 랜덤 점수 생성
		int point = (int)(Math.random() * 101);
		System.out.println("랜덤 점수 : " + point);
		
		String grade;
		if (point >= 60) {
			System.out.println("합격입니다!");
			grade = "A";
		} else {
			System.out.println("불합격입니다 :(");
			grade = "F";
		}
		System.out.println("당신의 등급은 " + grade + "입니다");
	}
}

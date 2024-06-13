package day04;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		/*
		 * 소수 판별하기
		 * 소수 - 약수가 1과 자기 자신인 수
		 * 2, 3, 5, 7
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 > ");
		int num = scan.nextInt();
		int cnt = 0; //카운트를 셀 변수
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) { //i는 num의 약수
				cnt++;
			}
		}
		
		if(cnt==2) { //소수
			System.out.println(num + " : 소수");
		} else {
			System.out.println(num + " : 소수 x");
		}
		
	}
}

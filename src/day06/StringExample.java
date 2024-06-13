package day06;

import java.util.Arrays;

//문자열 관련 함수
public class StringExample {
	
	public static void main(String[] args) {
		
		//문자열을 다루는 다양한 방법.
		//문자열은 사실은 char문자들의 배열이 합쳐진것 ...
		//index를 가집니다.

		//문자열. 메서드명()
		String str = "안녕하세요~";
		
		//문자열 인덱스번호 자르기
		char c = str.charAt(0);
		System.out.println("0번째 인덱스 : " + c);
		//문자열길이
		System.out.println("문자열길이 : " + str.length() );
		//문자찾기
		System.out.println("녕이 있는위치:" + str.indexOf("녕") );
		System.out.println(str.indexOf("흠") ); //없는 문자라면, -1반환
		//문자변경하기
		String r1 = str.replace("안녕", "hello"); //대상문자, 변경할문자
		System.out.println(r1);
		System.out.println(str); //원본문자열은 그대로

		String str2 = "아 집에 가고 싶다~ TT";
		str2 = str2.replace(" ", ""); //원본문자열 공백 삭제
		System.out.println(str2);
		
		//문자열자르기
		System.out.println( str.substring(2) ); //2번 미만 절삭
		System.out.println( str.substring(0, 2) ); //0이상~2미만 추출
		
		//문자열자르기
		String str3 = "010-1234-5678";
		String[] r3 = str3.split("-"); //- 기준으로 잘라서 배열로 반환
		String[] r4 = str3.split(""); //한글자로 잘라줌
		char[] r5 = str3.toCharArray();

		System.out.println( Arrays.toString(r3) );
		System.out.println( Arrays.toString(r4) ); //String[]
		System.out.println( Arrays.toString(r5) ); //char[]
		
		//양측공백제거
		String str4 = " hello world ";
		System.out.println( str4.trim() );
		
		//문자열비교
		System.out.println( "홍길동".equals("홍길동") ); //문자열이 같으면 true
		System.out.println( "홍길동".equals("이순신") ); //문자열이 다르면 false

		//문자열 대소비교 ( 앞문자아스키코드의 합 - 뒤문자아스키코드의 합 )
		System.out.println( "ABC".compareTo("ABC") ); //0 = 같은문자
		System.out.println( "ABC".compareTo("ABD") ); //-1 = 음수라면 앞문자가 사전적으로 앞에 있음
						//	65-66-67 - 65-66-68
		System.out.println( "ABC".compareTo("ABB") ); //1 = 양수라면 ~
		
		//문자열 합치기
		System.out.println(String.join("->","홍", "길", "동") );
		System.out.println(String.join("->", "홍", "길", "동", "입", "니", "다"));
		
	}
}

package day03;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		int a = 1;

		//switch 에 들어가는 값은 [정수 or 문자 or 문자열]
		switch(a) {
		case 1:
			System.out.println("1");
			break; //switch 문 탈출
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default :
			System.out.println("1,2,3,4가 아닙니다.");
		}
	}
}

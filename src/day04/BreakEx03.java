package day04;

//중첩반복에서 break
public class BreakEx03 {
	
	public static void main(String[] args) {
		
		//중첩반복에서 break
		
		/*** [1] 플래그 변수 활용 ***/
		boolean bool = false;
		
		for(char c = 'A'; c <= 'Z'; c++) {
			for(char l = 'a'; l <= 'z'; l++) {
				//System.out.println(c + "-"+ l);
				if(l == 'e') {
					bool = true; //if문을 실행했음을 나타냄
					break;
				}
			}
			if(bool) break; //true였으면 완전 탈출
		}
		
		/*** [2] 이름 붙이기  ***/
		//중첩반복문에서 바깥반복문을 완전히 탈출하려면 탈출할 반복문에 이름을 붙여줍니다.
		ex: for(char c = 'A'; c <= 'Z'; c++) {
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(c + "-" + l);
				if(l == 'e') {
					break ex;
				}
			}
		}
		
	} //main
}
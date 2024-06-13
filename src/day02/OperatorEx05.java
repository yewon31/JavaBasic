package day02;

//3항 연산자
public class OperatorEx05 {
	public static void main(String[] args) {
		
		//double d = Math.random(); //랜덤한 실수를 돌려줌(0 이상 1 미만)
		//System.out.println(d);
		
		int d = (int)(Math.random()*10)+1; //1~10 랜덤수 
		System.out.println("랜덤수 : " + d);
		
		String result = d % 2 == 0 ? "짝수" : "홀수";
		System.out.println("result : " + result);
	}
}

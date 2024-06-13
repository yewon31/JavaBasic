package day01;

//명시적 형변환
public class CastingEx02 {

	public static void main(String[] args) {
		
		int i = 70;
		char c = (char)i; //F
		byte b = (byte)i; //70
		System.out.println(c);
		System.out.println(b);
		
		double d = 3.14;
		int j = (int)d;
		System.out.println(j);
		
		int k = 1000;
		byte b2 = (byte)k; //byte는 127(8칸)까지 표현 가능
		System.out.println(b2); //-24 //1000은 2진수로 0011 1110 1000 //8칸만 저장해서 1110 1000으로 인식
		
		char cc = 'A';
		short ss = (short)cc; //동일한 2byte이지만 타입이 달라서 명시적 형변환
		System.out.println(ss); //65
	}
}







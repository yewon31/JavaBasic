package day04;

//continue
public class ContinueEx01 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue; //반복문의 다음
			}
			//System.out.println(i);
		}
		
		System.out.println("---------------------------------");

		int i = 1;
		while(i <= 10) {
			if(i == 5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	} //main
}
package day01;

public class VariableScope {

	public static void main(String[] args) {
		
		int num = 100;
		int num2 = 200;
		
		if(true) {
			int num1 = 10;
			System.out.println(num);
			num2 = 20;
		}
		System.out.println(num2);
	}
}

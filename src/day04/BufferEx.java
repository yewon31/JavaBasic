package day04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferEx {
	public static void main(String[] args) {
		
		
		/************************* BufferedReader 사용 *************************/
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
		
		try {
			
			String str = br.readLine(); //입력
			bw.write(str);//출력
			bw.flush();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

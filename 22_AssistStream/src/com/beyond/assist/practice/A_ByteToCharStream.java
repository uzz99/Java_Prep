package com.beyond.assist.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A_ByteToCharStream {
	
	public void inputStreamReader() {
		try {
//			1) InputStreamReader 사용
//			char[] array = new char[10];
//			InputStreamReader isr = new InputStreamReader(System.in);// 기반 스트림을 인자로 받
//			isr.read(array);//파일 읽어올 때랑 똑같이 사용자로부터 입력 받은 값도 read로 
//			System.out.println(Arrays.toString(array));
//			System.out.print("문자열 입력 > ");
//			
//			br.read(array);
//			
//			for (char c : array) {
//				System.out.print(c);
//			}

//			2) BufferedReader 사용 (보조 스트림을 여러개 사용)
			String line = null;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//, isr로 문자열 받고, br로 성능 향상
			System.out.print("문자열 입력 > ");
			
			line = br.readLine();
			
			System.out.println(line);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void outputStreamWriter() {
		try {
//			1) OutputStreamWriter 사용
//			OutputStreamWriter osw = new OutputStreamWriter(System.out);
//			osw.write("안녕하세요. 저는 홍길동입니다.\n");
//			osw.write("힘내세요~^^\n");
//				
//			osw.flush();// 버퍼를 비워줘야 출력이 가능

			
//			2) BufferedWriter 사용 (보조 스트림 여러개)
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//성능 향상
			
			bw.write("안녕하세요. 저는 홍길동입니다.");
			bw.newLine();
			bw.write("힘내세요~^^");
			bw.newLine();
				
			bw.flush();// 버퍼를 비워줘야 출력이 가능
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

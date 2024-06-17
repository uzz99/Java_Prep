package com.beyond.assist.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_BufferedStream {
	
	public void fileSave() {
		
		try {
			//기반 스트림
			BufferedWriter bw = new BufferedWriter(new FileWriter("a_buffer.txt",true));//기반 스트림 writer 받음
				bw.write("안녕하세요.");
				bw.newLine();//BufferedWriter가 추가적으로 제공하는 메소드: 개행 시 사용 
				bw.write("줄바꿈이 적용되었나요??");
				bw.newLine();
				bw.flush();
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {;//shift alt i (인라인처리 단축키)
		try(BufferedReader br = new BufferedReader(new FileReader("a_buffer.txt"))) {
			String line = null;
			
			// BufferedReader가 제공하는 메소드
			// 파일에서 한 줄을 읽어올 때 사용
//			line = br.readLine();// 읽어올 데이터가 없으면 null return
//			System.out.println(line);
//			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
	}
}

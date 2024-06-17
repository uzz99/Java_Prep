package com.beyond.file.practice;

import java.io.File;
import java.io.IOException;

public class A_File {
	/*
	 * File 클래스
	 *  - 파일 크기, 속성, 이름 등의 정보를 얻어내는 기능과 파일 생성 및 삭제 기능을 제공
	 *  - 파일 클래스로는 파일의 내용을 읽고 쓰는 기능 지원 x
	 *  - 파일의 데이터를 읽고 쓰기 위해서는 파일 관련 입출력 스트림을 사용
	 */
	public void method1() {
		try {
			// File file = new File("test.txt");//C:/Users/Playdata/
			File file = new File("C:/Users/Playdata/test.txt");
			// 슬래시로 주면 os에 맞춰서 알아서 변환해줌
			// 메모리 상에만 존재하는 객체(힙 영역에 x)
			
			System.out.println("파일명 : " + file.getName());// 파일 이름을 가져오는 메소드
			System.out.println("파일 경로 : " + file.getAbsolutePath());//파일의 경로를 포함한 파일명
			System.out.println("파일 용량 : " + file.length());
			System.out.println("파일 존재 여부 : " + file.exists());
			System.out.println("파일 여부 : " + file.isFile());
			System.out.println("디렉터리 여부 : " + file.isDirectory());
			
			if(file.exists()) {
				file.delete();// 파일 또는 디렉 삭제
			}else {
				file.createNewFile();// 실제 파일 생성
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void method2() {
		try {
			boolean result = false;
			
//			File temp = new File("C:/Users/Playdata/develop/temp");
//			File temp = new File("C:/Users/Playdata/develop/temp/demo/");
			File temp = new File("C:/Users/Playdata/develop/temp/demo/test");
			File file = new File("C:/Users/Playdata/develop/temp/demo/test/test.txt");

			if(!temp.exists()) {
				// 폴더 생성
				result = temp.mkdirs();// 상위폴더까지
				System.out.println("폴더 생성 여부 : " + result);
			}
			if(!temp.exists()) {
				/*
				 * 파일 생성
				 * 
				 * test 폴더가 없는 상태에서 txt 파일을 만듦 -> 에러
				 * 존재하는 경로까지 지정해 주면 해당 위치에 파일을 생성
				 * 만약에 존재하지 않는 경로를 제시하면 IOException이 발생
				 * 
				 * -> 없는 폴더 먼저 생성하고, 파일 만들게끔 해야 함
				 */
				result = file.createNewFile();
				System.out.println("파일 생성 여부 : " + result);
			}
			if (!file.exists()) {
				file.createNewFile();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	
}

package com.beyond.io.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDao {
	
	
	Scanner sc = new Scanner(System.in);

	String str = null;
	
	public FileDao() {
		
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
//		ArrayList<String> list = new ArrayList<>();
		char c = '\u0000';
		String fileName = null;
		
		while(true) {
			System.out.println("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝)");
			str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}
			else {
				sb.append(str);
				sb.append("\n");
			}
		}
		
		System.out.println("저장하시겠습니까? (y/n)");
		c=sc.nextLine().charAt(0);

		if((c=='y') || (c=='Y')) {
			System.out.println("저장할 파일명을 입력해주세요.");
			fileName = sc.nextLine();		
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName+".txt"))) { 
				
	            bw.write(sb.toString());
	            bw.newLine();
	            System.out.println(fileName+".txt" +"에 성공적으로 저장하였습니다.");
			 
			}catch( IOException e ) {
				 e.printStackTrace();
			 }
		}else {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
		
	}
	
	public void fileOpen() {
		
		System.out.println("열기 할 파일명: ");
		
		String fileName = sc.nextLine();
		
		String line = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName+".txt"))) {

			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(FileNotFoundException e ) {
			System.out.println("존재하는 파일이 없습니다.");
		}catch(IOException e ) {
			e.printStackTrace();
		}

	}
	
	public void fileEdit() {
		
		System.out.println("수정 할 파일명 : ");
		
		sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		
		String line = null;
		char c = '\u0000';
		
		StringBuilder sb = new StringBuilder();
//		ArrayList<String> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName+".txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName+".txt",true))) {
			
			// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			// “파일에 추가할 내용을 입력하시오 : “
			// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder에 담기
			
			while(true) {
				System.out.println("파일에 추가할 내용을 입력하시오 : ");
				str = sc.nextLine();
				if(str.equals("exit")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				else {
					sb.append(str);
					sb.append("\n");
					
				}
			}
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			c = sc.nextLine().charAt(0);
			
			if((c=='y') || (c=='Y')) {
	            bw.write(sb.toString());
	            System.out.println(fileName+".txt" + "파일의 내용이 변경되었습니다.");
			}else {
				System.out.println("다시 메뉴로 돌아갑니다.");
			}
			
			}catch( FileNotFoundException e ) {
			e.printStackTrace();
			}catch( IOException e ) {
			e.printStackTrace();
			}

		
		
	}
}

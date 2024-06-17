package com.beyond.fileio.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_FileCharStream {
	public void fileSave() {
		//try-with-resource 문을 통해서 사용한 리소스를 자동으로 close()
		// finally를 위해 예외를 한번 더 선언할 필요 없어짐
		try(FileWriter fw = new FileWriter("b_char.txt",true)){//try 안 인자의 예외 발생 여부와 관계없이 자동으로 close
			fw.write('A');
			fw.write('\n');
			fw.write('홍');
			fw.write('\n');
			fw.write(new char[] {'a','p','p','l','e'});
			fw.write('\n');
			fw.write(new char[] {'a','p','p','l','e'},2,3);
			fw.write('\n');
			fw.write("안녕하세요\n");
			fw.write("IO 재미있으신가요....???\n");
			fw.write("IO 재미있으신가요....???\n",10,8);
			
			fw.flush();
			
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
	
	
	
	public void fileRead() {
		try(FileReader fr =  new FileReader("b_char.txt")) {//close 시 발생하는 IOException에 대한 예외처리가 없
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

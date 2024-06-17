package com.beyond.fileio.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class A_FileByteStream {
	
	public void fileSave() {
		FileOutputStream fos = null;//try 안에서 사용하면 finally에서 사용 불가능
		byte[] array = {99,100,101,102};
		
		try { 
			fos = new FileOutputStream("a_byte.dat",true);
			
			fos.write(97);
			fos.write('b');
			fos.write(10);//줄바꿈 문자
			fos.write('a');
			fos.write(10);
			fos.write('홍');// 한글은 2바이트로 표현되기에 제한이 있음
			fos.write(10);
			fos.write(array);
			fos.write(10);
			fos.write(array,1,2);
			
			
			fos.flush();// 버퍼에 남아있는 모든 문자 출력
			
			
// 위의 write() 메소드에서 IOException이 발생했을 경우 아래 코드가 실행되지 않음 
// 따라서 반드시 실행될 수 있게끔 finally 안에서 close() 메소드를 실행해야 함
//			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {// IOException이 더 상위 예외이므로 밑에 적어주기
			e.printStackTrace();
		}finally {
			try {//close에 대해서도 예외처리가 필요
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileRead() {
//		System.out.println("fileRead() - 호출");
		FileInputStream fis = null;
		byte[] array = new byte[50];
		
		try {
			//파일이 존재하지 않으면 FileNotFoundException
//			fis = new FileInputStream("a_byte1.dat");
			fis = new FileInputStream("a_byte.dat");
			
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			// 'b' 로 입력 -> 인자를 int형으로 인식하기 때문에 98로 형변환 후 -> 'b'로 기록 됨 | 출력 시에는 반대로, 따라서 문자로 출력하고싶으면 형변환
			
//			System.out.println((char)fis.read());// 한 바이트 읽음
//			System.out.println(fis.read(array));
//			System.out.println(fis.read(array,10,10));
//			System.out.println(Arrays.toString(array));
//			System.out.println(fis.read());
//			
			//read() 메소드가 2번 실행되기 때문에 정상적으로 값을 출력할 수 x
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read());
//			}// 이렇게하면 두번씩 호출되는 꼴
			
			int value = 0;
			
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();//close 필수
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

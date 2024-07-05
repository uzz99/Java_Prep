package com.beyond.assist.practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class D_ObjectStream {
	public void fileSave() {
		// 프로그램 기준으로 데이터가 들어오면 INPUT(파일에서 가져오는 거니까 in) 나가야되면 OUT(파일로 나가는거니까 out)
		// ObjectOutputStream => 보조스트림
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c_object.dat"))){
			
			oos.writeObject(new Member("hong123","1234","홍길동",30,'남',3537.456));
			// oos에 객체 출력, NotSerializableException
			// 힙 영역에 저장된 member 객체의 데이터를 순차적으로 가져오려면 직렬화가 필요함
			// 직렬화를 허용한다는 선언이 필요함
			// => Member 클래스에 implements Serializable
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c_object.dat"))){

			Member member = (Member) ois.readObject();// 다운캐스팅
			
			System.out.println(member);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	// 파일에 객체 여러개 저장
	// 리스트 사용
	public void objectsSave() {
		List<Member> members = new ArrayList<>();
		
		members.add(new Member("hong123","1234","홍길동",30,'남',3537.456));
		members.add(new Member("kim123","4567","김철수",24,'남',1000.45));
		members.add(new Member("kim456","1234","김영희",24,'여',2000));

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.dat"))){
			
			for (Member member : members) {
				oos.writeObject(member);
				
				System.out.println(member.getId() + " 객체 저장 완료!");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void objectsRead() {
		List<Member> members = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.dat"))){

//			members.add((Member)ois.readObject());
//			members.add((Member)ois.readObject());
//			members.add((Member)ois.readObject());

//			for (Member member : members) {
//				System.out.println(member);
//			}

			//방법2
			try{
				while(true) {
					members.add((Member)ois.readObject());
				}	
			}catch (EOFException e) {
				System.out.println("파일 읽기 완료");
			} 
			for (Member member : members) {
				System.out.println(member);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		// 방법 1
//		catch (EOFException e) {
//			for (Member member : members) {
//				System.out.println(member);
//			}
//			System.out.println("파일 읽기 완료");
//		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

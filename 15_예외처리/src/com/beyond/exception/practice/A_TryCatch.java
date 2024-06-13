package com.beyond.exception.practice;

public class A_TryCatch {
	
	public void method1() {
		try {
			// 예외 발생 가능성이 있는 코드
			int result = 10 / 0;
			System.out.println(result);

			//			String str = null;
			//			str.charAt(0);	
			//java.lang.NullPointerException//예외 클래스
			
			throw new NullPointerException();
			/* 
			예외가 발생하면 예외 클래스의 객체를 생성함
			생성된 객체를 catch의 매개변수인 참조변수로 던져 줌(catch가 받) by JVM(상황에 따라서 내가 던져줄 수도 ㅇ)
			다형성 사용(Exception이라는 부모 클래스로 업캐스팅)
			따라서 catch(NullPointerException e)와 같이 선언도 가능 
			
			Exception은 모든 예외를 처리하기 때문에 예외별로 처리하는 방식이 다를 땐 비효율적
			그럴 때는 따로 처리해주기(catch문 여러개 선언 가능 => 다중 캐치)
							   ref) 하나의 캐치문에서 여러개의 예외 처리 => 멀티 캐치
			
			catch문을 여러개 작성할 때,
			Exception은 가장 최상위 클래스이기 때문에 맨 첫 줄에 작성하면 아래에 있는 catch문이 실행되지 않는다.
			
			*/
		}// try에서 발생한 예외를 처리하는 블록
		catch (NullPointerException e) {
			System.out.println("NullPointerException이 발생하였습니다.");
		}catch (ArithmeticException | ClassCastException e) {
			System.out.println("ArithmeticException 또는 ClassCastException이 발생하였습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 예외 발생 여부와 상관없이 무조건 수행된다.
			System.out.println("finally 블록 실행");
		}
	}
}

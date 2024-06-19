package com.beyond.thread;

import com.beyond.thread.practice.MyRunnable;
import com.beyond.thread.practice.MyThread;

public class Application {

	public static void main(String[] args) {
		System.out.println("메인 스레드 실행");
		
		MyThread thread1 = new MyThread();
		
		// 스레드 이름 변경 (start 전에 해야 함)
		thread1.setName("thread1");
		
		//우선순위 지정 (start 전에 해야 함)
//		thread1.setPriority(10);
		thread1.setPriority(Thread.MAX_PRIORITY);
		
//		thread1.run();
		//main 흐름 따라 쭉 가다가 run만나면 -> 실행 흐름이 run으로 넘어감 -> run 동작 후 종료 main으로 복귀(하나의 실행 흐름, main 스레드에서 전부 수행)
		thread1.start();
		// main 일단 쭉 수행 후 -> start호출, 별도의 실행 흐름이 만들어짐(: 2개의 실행 흐름, 작업 스레드 생성) -> 메인 스레드는 메인대로 수행 후, 작업 스레드의 run은 run대로 수행
		
		
		Thread thread2 = new Thread(new MyRunnable());
		thread2.setName("thread2");
		
//		thread2.setPriority(1);
		thread2.setPriority(Thread.MIN_PRIORITY);

//		thread2.run();
		thread2.start();
		
		// 익명 구현 객체
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
				}
			}
		});
		
		thread3.setName("thread3");
		thread3.start();
		
		// 람다식으로 구현
		// 구현해야할 인터페이스에 추상메소드가 하나만 있어야 함(@FunctionalInterface)
		// 추상메소드의 매개값과 반환값을 잘 봐야함 | (): 매개변수, {}: return값
		// 현재 run()은 매개변수도 없고 반환값도 없으므로 둘 다 빈 값이고, 작업할 코드만 넣어주면 됨
		Thread thread4 = new Thread(() -> {
			
			for(int i = 1; i <= 100; i++ ) {
				System.out.println(Thread.currentThread().getName() + "[" + i + "]");
			}
		});
		
		thread4.setName("thread4");
		/*
		 * 데몬 스레드
		 *  - 보조적인 역할을 수행하는 스레드
		 *  - 다른 스레드가 종료되면 데몬 스레드는 강제로 종료된다
		 *  
		 */
		thread4.setDaemon(true); // 데몬 스레드(보조 스레드) 데몬 스레드가 아닌 다른 스레드들이 다 종료되면 작업이 남았더라도 같이 종료 됨
		thread4.start();
		
				
		/*
		 * join() 메소드
		 * 	- join()을 호출한 스레드는 아래의 스레드가 종료될 때까지 기다렸다가 스레드가 종료되면
		 * 		join()을 호출한 스레드를 다시 실행
		 * 
		 */
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();//각 thread가 종료되지 않으면 main이 종료되지 않게끔
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("메인 스레드 종료");
		
	}

}

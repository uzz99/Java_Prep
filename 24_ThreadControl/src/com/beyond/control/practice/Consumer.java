package com.beyond.control.practice;

public class Consumer implements Runnable {
	// 상품을 소비하는 클래스
	
	private Storage storage;
	
	public Consumer(Storage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				storage.getProduct();

				// 스레드를 매개값에 지정된 시간만큼 지연시키는 메소드
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

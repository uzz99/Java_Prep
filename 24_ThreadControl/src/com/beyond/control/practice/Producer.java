package com.beyond.control.practice;

public class Producer extends Thread {
	// 상품을 생성하고 등록하는 클래스
	
	private Storage storage;
	
	public Producer(Storage storage) {// 객체를 thread에 전달하기 위함
		this.storage=storage;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				storage.setProduct(i);

				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

package com.beyond.control;

import com.beyond.control.practice.Consumer;
import com.beyond.control.practice.Producer;
import com.beyond.control.practice.Storage;

public class Application {

	public static void main(String[] args) {
		
		Storage storage = new Storage();
		
		// 각자의 실행 흐름을 갖는 상태에서 storage만 공유(같은 객체, 하나의 객체를 두개의 스레드가 공유)
		Thread producer = new Producer(storage);
		Thread consumer = new Thread(new Consumer(storage));

		// 생산자가 상품을 생산해야만 소비자가 소비할 수 있게끔 구성(Storage 클래스)
		// start의 호출 순서는 상관없다.
		producer.start();
		consumer.start();
		
	}

}

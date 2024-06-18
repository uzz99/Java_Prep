package com.beyond.control.practice;

public class Storage {
	private int product;
	
	// 객체의 상태를 저장하고 흐름을 제어하기 위한 필드(flag 변수(필드))
	private boolean empty = true;// 빈 상태
	
	public synchronized void getProduct() {// 하나의 스레드가 getProduct()를 수행하고 있으면 다른 스레드가 접근하지 못하도록 함
		
		while(empty) {//값이 비어있다면
			try {
				wait();// 다른 스레드가 다른 메소드에 접근할 수 있게끔 객체의 잠금을 풀고 스레드(Consumer)를 일시 정지 상태로 만든다. -> 다른 스레드(Producer)가 실행 권한을 가지게 됨
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.printf("소비자가 %d번 상품을 소비하였습니다.\n",this.product);//비어있지 않을 때(false), 상품을 소비하게 됨

		this.empty = true;//값이 비었다!
		notify();//일시정지 상태인 스레드를 실행대기 상태로 만듦
	}
	
	public synchronized void setProduct(int product) {// 하나의 스레드가 setProduct()를 수행하고 있으면 다른 스레드가 접근하지 못하도록 함
		
		while(!empty) {// 값이 비어있지 않으면
			try {
				wait();// 값이 빌 때까지 setProduct 메소드에 대한 잠금을 풀고 일시정지 상태로 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.product = product;
		this.empty = false;//비어있지 x => 상품 생산
		
		System.out.printf("생산자가 %d번 상품을 생산하였습니다.\n",this.product);
		
		notify();// wait에 의해서 일시정지 된 스레드 중 한 개를 실행대기 상태로 만든다., 일시정지 된 스레드가 없으면 무시
		
		
	}
	//상품이 있는데 소비가 안되면 일시정지, 상품이 소비가 되면 다시 채워넣고.. 를 wait, notify로 반복
}

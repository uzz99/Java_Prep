package com.beyond.queue.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<T> implements Queue<T> {
	
	private int front;
	private int rear;
	private int size;
	private int maxSize;
	private List<T> list;
	
	public ArrayListQueue(int maxSize) {
		list = new ArrayList<>();
		this.maxSize = maxSize;	
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	
	}
	
	@Override
	public void enqueue(T value) {

		if(this.size == this.maxSize) {
			throw new RuntimeException("큐가 가득 찼습니다.");
		}else {
			if(rear == maxSize - 1) {
				rear = -1;
			}
			list.add(++rear,value);
			
			size++;

		}
		
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return (this.size == 0);
	}

	@Override
	public T dequeue() {

		if(isEmpty()) {
			throw new RuntimeException("큐가 비어 있습니다.");
		}
		T value = list.get(front);
		front = (front + 1) % maxSize;
		size--;
		
		return value;
	}

	@Override
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException("큐가 비어 있습니다.");
		}
		
		return list.get(front);
	}

	@Override
	public boolean contains(T value) {
		boolean result = false;
		int front = this.front;
		
		for (int i = 0; i < size; i++) {
			
			if(list.get(i).equals(value)) {
				result = true;
				
				break;
			}
			front = (front + 1) % maxSize;
		}
		return result;
	}

	@Override
	public String toString() {
		
		int front = this.front;
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		for (int i = 0; i < size; i++) {
			sb.append(list.get(front) + ", ");
			front = (front + 1) % maxSize;
		}
		if(sb.lastIndexOf(",") != -1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");
		}else {
			sb.append("]");
		}
		
		return sb.toString();
	}

	
	
}

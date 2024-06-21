package com.beyond.queue.practice;

public class LinkedQueue<T> implements Queue<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public LinkedQueue() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}

	@Override
	public void enqueue(T value) {
		Node<T> newNode = new Node<>(value);
		
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		
		size++;
		
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
		if (isEmpty()) {
			throw new RuntimeException("큐가 비어 있습니다.");
		}
		
		Node<T> node = front;
		T value = node.data;
		
		front = node.next;
		
		node.data = null;
		node.next = null;
		
		size--;
		
		return value;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			throw new RuntimeException("큐가 비어 있습니다.");
		}

		return front.data;
	}

	@Override
	public boolean contains(T value) {
		Node<T> current = front;
		
		while (current != null) {
			if (current.data.equals(value)) {
				return true;
			}
			
			current = current.next;
		}
		
		return false;
	}

	@Override
	public String toString() {
		Node<T> current = front;
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		while (current != null) {
			sb.append(current.data + ", ");
			
			current = current.next;
		}
		
		if (sb.lastIndexOf(",") != -1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");
		} else {
			sb.append("]");
		}
		
		return sb.toString();
	}
	
	private static class Node<T> {
		private T data;
		
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
}
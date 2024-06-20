package com.beyond.stack.practice;

public class LinkedListStack<T> implements Stack<T> {
	private Node<T> top;
	private int size;
	
	public LinkedListStack() {
		top = null;
		size = 0; 
	}

	@Override
	public void push(T value) {
		Node<T> newNode = new Node<>(value);
		//노드 연결해주기
		newNode.next = top;
		top = newNode;
		
		size++;
	}

	@Override
	public int size() {	
		
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		
		return (top == null);
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			throw new RuntimeException("스택이 비어 있습니다.");
		}
//		Note<T> node = 
		T value = top.data;
		
		top = top.next;
//		node.d
		size--;
		
		return value;
	}

	@Override
	public boolean contains(T value) {
		
		Node<T> current = top;
		
		while(current != null) {
			if(current.data.equals(value)) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}

	@Override
	public T peek() {
		if(this.isEmpty()) {
			throw new RuntimeException("스택이 비어 있습니다.");
		}
		return top.data;
	}
	
	private static class Node<T> {// 내부에서 사용 가능한 노드 객체
		private T data;
		
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	@Override
	public String toString() {
		Node<T> current = top;
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		while(current != null) {
			sb.append(current.data + ", ");
			
			current = current.next;
		}
		
		if (sb.lastIndexOf(",") != -1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");		// 대괄호 닫기	
		} else {
			sb.append("]");		
		}

		return sb.toString();
	}
}


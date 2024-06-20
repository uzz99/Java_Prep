package com.beyond.list.practice;

public class SinglyLinkedList<T> implements List<T> {
	// 클래스에서 별도의 파라미터 필요하면 ,로 연결 SinglyLinkedList<T,M>

	private Node<T> head;// 첫 번째 노드를 가리키는 참조
	
	private int size;// 링크드리스트의 크기
	
	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}	

	@Override
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	@Override
	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null) {
			head = newNode;
		}else {
			Node<T> lastNode = this.search(size - 1);
			
			lastNode.next = newNode;
		}
		
		size++;
		
		
	}
	
	@Override
	public void add(int index, T data) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index == 0) {
			this.addFirst(data);
			
			return;
		}
		
		if (index == size) {
			this.addLast(data);
			
			return;
		}
		
		Node<T> newNode = new Node<>(data);
		Node<T> prevNode = this.search(index - 1);
		
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		
		size++;
	}


	@Override
	public int size() {

		return this.size;
	}
	
	@Override
	public T get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
//		if(index == 0) {//
//			// head => 노드
//			return head.data;
//		}
		
		return this.search(index).data;
	}
	
	@Override
	public void remove(int index) {
		
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if(index == 0) {
			removeFirst();
			return;
		}
		if(index == (size -1)) {
			this.removeLast();
			
			return;
		}
		
		Node<T> prevNode = this.search(index - 1);
		Node<T> targetNode = prevNode.next;
		
		prevNode.next = targetNode.next;//인덱스 초기화
		targetNode.data = null;
		targetNode.next = null;//연결 끊
		
		size--;
		
	}

	@Override
	public void remove(T data) {// 오버로딩
			
		Node<T> current = head;
		
		if(current == null) {
			return;
		}
		if(current.data.equals(data)) {
			this.removeFirst();
			
			return;
		}
		
		for(int i = 0; i < size - 1; i++) {
			if(current.next.data.equals(data)) {
				Node<T> nextNode = current.next;
				
				current.next = nextNode.next;
				nextNode.data = null;
				nextNode.next = null;
				
				size--;
				
				break;
			}
			current = current.next;
		}
		
		
	}
	
	@Override
	public String toString() {
		Node<T> current = head;//head의 주소를 담음
		StringBuilder sb = new StringBuilder();//문자열을 자주 수정할 때 사용하면 유용
		
		sb.append("[");
		
		while(current != null) {
			sb.append(current.data + ", ");
			
			current = current.next;//current가 참조하고 있는 값이 없을 때 next가 null이 되므로 반복문 종료
		}
		if(sb.lastIndexOf(",") != -1) {
			// lastIndexOf: 뒤에서부터 
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");
		}
		else {
			sb.append("]");
		}
//		if(head != null) {
//			sb.append(head.data);
//		}
//		sb.append("]");
		
		return sb.toString();
	}

	private Node<T> search(int index){
		Node<T> node = head;
		
		for(int i=0; i<index; i++) {
			node = node.next;
		}
		return node;
	}

	@Override
	public boolean contains(T data) {
		Node<T> current = head;
		
		while (current != null) {
			if(current.data.equals(data)) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}

	@Override
	public void removeFirst() {
		if(head == null) {
			return;
		}else {//참조하고 있는 데이터가 있을 때
			Node<T> first = head;
			
			head = first.next;
			first.data = null;
			first.next = null;
				
			size--;
		}
		
	}

	@Override
	public void removeLast() {
		if(head == null) {
			return;
		}
		else if((size - 2) <= 0) {
			this.removeFirst();
			
			return;
		}
		else {
			Node<T> lastPrevNode = this.search(size - 2);//search가 인덱스로 지정한 다음 노드를 가르키므로 -2
			
			lastPrevNode.next.data = null;
			lastPrevNode.next = null;//연결 끊어주기
			
			size--;
		}
	}

	private static class Node<T>{// 클래스 안에서만 인스턴스 사용 가능
		// 외부에선 접근 불가
		
		private T data;// 노드가 저장하는 데이터
		
		private Node<T> next;// 다음 노드를 가리키는 참조

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}


	
}

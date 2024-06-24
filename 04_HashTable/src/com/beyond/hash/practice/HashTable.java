package com.beyond.hash.practice;

import java.util.LinkedList;

public class HashTable<K,V> {
	private int maxSize;//테이블 크기
	private int cnt = 0;
	private LinkedList<HashNode<K,V>>[] buckets;
	// 인덱스가 중복되는 애들을 동일한 링크드리스트에 저장
	
	//타입파라미터를 보장하지 못할 때 경고가 뜨는데 이를 없애주는 어노테이션
	@SuppressWarnings("unchecked")
	public HashTable(int maxSize) {
		
		if (maxSize <= 0) {//0이 올 경우 예외처리
			throw new RuntimeException("잘못된 크기 지정 Size : " +maxSize);
		}
		this.maxSize = maxSize;
		this.buckets = new LinkedList[this.maxSize];
		
		for (int i = 0; i < buckets.length; i++) {
//			this.buckets[i] = new LinkedList<HashTable.HashNode<K,V>>();// 각 배열에 링크드리스트 연결해주기
			this.buckets[i] = new LinkedList<>();
		}
	}
	
	public void put(K key, V value) {
		
		// 실제 데이터를 저장할 인덱스 얻어옴
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {// 링크드리스트에 연결된 해시노드의 갯수만큼 반복
			// 해당하는 키로 값이 이미 저장되어 있으면
			
			if(node.key.equals(key)) {
				node.value = value;// 값을 업데이트
				
				return;//메소드 종료
			}
		}
		
		buckets[index].add(new HashNode<>(key,value));// 노드 새로 생성, 링크드리스트에 저장
		
//		System.out.println(index);
		
	}

	public V get(K key) {
		int index =  this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if(node.key.equals(key)) {
				return node.value;
			}
		}
		
		return null;
	}
	
	public V remove(K key) {//삭제된 것에 대한 값 받아옴
		V value = null;
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if(node.key.equals(key)) {
				value = node.value;//삭제된 값 반환
				
				buckets[index].remove(node);// 실제로 삭제되도록 구현
				
				break;
			}
		}
		
		return value;
	}
	
	public boolean contains(K key) {
		int index =  this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if(node.key.equals(key)) {
				return true;
			}
		}
		return false;
		
	}
	
	public int size() {
		cnt = 0;
		for (int i = 0; i < buckets.length; i++) {
			if(buckets[i] != null) {
				cnt+=this.buckets[i].size();
			}
		}
		
		return cnt;

		}
		
		
	public boolean isempty() {
		if(cnt == 0) {
			return true;
		}
		return false;
		
	}
	
	private int hash(K key) {
//		System.out.println(key);
//		System.out.println(key.hashCode());
//		System.out.println(key.hashCode() % this.maxSize);
//		System.out.println( Math.abs(key.hashCode() % this.maxSize));
//		System.out.println();
		
		//hashCode() : 객체의 주소값을 10진수 형태로 가져옴(재정의 x 경우) -> 음수값이 나오는 경우o => 절댓값
		return Math.abs(key.hashCode() % this.maxSize);//인덱스 절댓값 처리
	}
	
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < this.buckets.length; i++) {
			LinkedList<HashNode<K, V>> bucket = this.buckets[i];
			
			sb.append(i).append(":").append(bucket).append(",").append("\n");
		}
		sb.replace(sb.lastIndexOf(","), sb.length(), "");// 끝에 콤마 없애기
		
		return sb.toString();
	}



	private static class HashNode<K,V>{// hashtable에 저장되는 키와 밸류를 하나의 쌍으로 묶어서 저장하는 클래스
		
		private K key;
		private V value;
		
		private HashNode(K key, V value) {
			
			this.key = key;
			this.value = value;
			
		}
		
		@Override
		public String toString() {
			return "{key=" + key + ", value=" + value + "}";
		}
		
		
	}
	
}

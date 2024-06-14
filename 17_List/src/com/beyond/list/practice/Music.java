package com.beyond.list.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //기본 생성자
@AllArgsConstructor // 모든 필드를 갖는 생성자
//@ToString
//@EqualsAndHashCode
//@Getter
//@Setter

@Data
public class Music implements Comparable<Music>{//compareTo 메소드(정렬 기준을 지정해주는 메소드) 재정의 필수
	
	private String title;
	private String artist;
	private int ranking;
	
	// 누가 더 앞에 있는지 비교, Object면 Music타입으로 형 변환
	/*
	 * compareTo()
	 * 	- 메소드에서 반환되는 값을 가지고 정렬 기준을 잡는다.
	 * 	- 비교해서 같으면 0을 리턴
	 * 	- 비교해서 자신이 크다면 양의 정수를 리턴
	 * 	- 비교해서 자신이 작다면 음의 정수를 리턴
	 */
	
	@Override
	public int compareTo(Music music) {
		// 랭킹 순서대로 정렬하는 코드(오름차순 정렬)
//		System.out.println(this.title);
//		System.out.println(music.title);
//		System.out.println();

		return this.ranking - music.ranking;
//		return music.ranking - this.ranking;//내림차순
	}

	
	
}

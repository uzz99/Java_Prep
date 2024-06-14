package com.beyond.map.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //기본 생성자
@AllArgsConstructor // 모든 필드를 갖는 생성자
public class Snack {
	private String name;
	private String flavor;
	private int calorie;
	
	
}

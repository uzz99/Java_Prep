package com.beyond.enumeration.practice;

public enum Week {//enum이면 기본적으로 static final
	//만들어질 때까지 값들을 담아둘 변수가 필요함
	   MONDAY("월요일","월"), 
	   TUESDAY("화요일","화"), 
	   WEDNESDAY("수요일","수"),
	   THURSDAY("목요일","목"),
	   FRIDAY("금요일","금"),
	   SATURDAY("토요일","토"),
	   SUNDAY("일요일","일");
	
	
		private final String name;
		private final String shortName;
		
		private Week(String name, String shortName) {//생성자, 열거타입의 생성자는 반드시ㅣ private로 선언해야한다.
			this.name=name;
			this.shortName=shortName;
		}

		public String getName() {// 열거 타입의 name값을 읽어오는 메소드
			return this.name;
		}
		public String getshortName() {// 열거 타입의 shortName값을 읽어오는 메소드
			return this.shortName;
			
		}
		
	}
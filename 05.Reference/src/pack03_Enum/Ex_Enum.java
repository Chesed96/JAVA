package pack03_Enum;

import java.util.Calendar;

public class Ex_Enum {
	public static void main(String[] args) {
		//우리가 직접 만들어 놓은 Week라는 Enum자체를 데이터 타입부에 쓸 수 있다.
		// int a = 0; ← 숫자를 저장
		// Week toaday ← MONDAY
		// String[] arr = new String[3]; ←? 
		//일반 데이터 타입이 아닌 레퍼런스(참조)타입은 null로 초기화 가능.
		Week today = null; // null로 초기화, 아직 비어있는 상태
		Calendar cal = Calendar.getInstance(); // 초기화 식
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일의 정보를 int형으로 얻어온다.
		System.out.println(week);
		
		//오늘의 요일을 출력해보자.(Enum)
		//if는 조건식 기준 , switch는 값 기준
		switch(week) {
			case 1 : 
				//ENUM (today)
				today = Week.SUNDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
		}
		if(today == Week.SATURDAY) {
			System.out.println("쉬는 날");
		}else {
			System.out.println("안 쉬는 날");
		}
	}
}

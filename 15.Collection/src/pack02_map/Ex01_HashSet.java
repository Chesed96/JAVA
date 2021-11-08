package pack02_map;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		//Interface를 implements받은 객체(Class)들은 Interface를 초기화 시킬 수 있다. (생성자메소드)
		set.add("java1");
		set.add("java2");
		set.add("java3");
		set.add("java4");
		set.add("java5");
		set.add("java6");// size 6
		set.add(new String("java6"));// size 6 Why? 값을 비교해 같은 값이면 같은 것으로 인식/중복값X
		System.out.println(set.size());
		
		boolean aa = set.add(new String("java6"));// size 6 Why? 
		System.out.println(aa);
		//for Upgrade → 향상된 For문//
		//조건식이 없는 for문
		//반복을 하면서 데이터가 있다면 받을 변수를 지정하고 변수를 빼올(항아리) 자료구조를 써주는 형식.
		//for == foreach
		//for(빼올 데이터로 변수 선언 : 빼올 자료구조(항아리)){ }
		for(String element : set) {
			System.out.println(element);
		}
		set.clear();//set에 있는 내용을 비운다.
		//is , has ← 메소드 / boolean을 return 
		if(set.isEmpty()) {
			System.out.println("비어있습니다.");
		}else {
			System.out.println("안비어있습니다.");
		}
	
	
	}
}

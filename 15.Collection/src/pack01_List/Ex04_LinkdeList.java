package pack01_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_LinkdeList {
	public static void main(String[] args) {
		//LinkedList vs ArrayList
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		//====== 여기 밑에 부분은 중요한 소스가 아님 ======
		long startTime;
		long endTime;
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(new String("aa"));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에 작업 소요시간 " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(new String("aa"));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에 작업 소요시간 " + (endTime - startTime) + "ns");
		
	}
}

package pack03_Constructor;

public class Test_BungMain {
	public static void main(String[] args) {
		Test_Bung beanBung = new Test_Bung("bean","beanBong",1000,"2021-10-06");
		Test_Bung puffBung = new Test_Bung("puff", "puffBong", 1100, "2021-10-07");
		System.out.println(beanBung.mater +"\t" + beanBung.name + "\t" + beanBung.price + "\t" + beanBung.shelf);
		System.out.println(puffBung.mater +"\t" + puffBung.name + "\t" + puffBung.price + "\t" + puffBung.shelf);
		
		//배열
		//데이터타입[] 배열의 이름 = new 배열데이터타입[size];
		//int[] intArr = new int [3]
		//String[] strArr = new String[3];
		Test_Bung[] testB = new Test_Bung[5];	//크기 -1
		testB[0] = new Test_Bung("팥", "팥붕어빵", 1000, "2021-10-06");
		testB[1] = new Test_Bung("팥", "팥붕어빵", 1000, "2021-10-06");
		testB[2] = new Test_Bung("팥", "팥붕어빵", 1000, "2021-10-06");
		testB[3] = new Test_Bung("팥", "팥붕어빵", 1000, "2021-10-06");
		testB[4] = new Test_Bung("팥", "팥붕어빵", 1000, "2021-10-06");
		
	}
}

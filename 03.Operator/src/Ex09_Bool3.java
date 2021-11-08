
public class Ex09_Bool3 {
	public static void main(String[] args) {
		//int형에 점수를 입력한다. 변수의 이름 score
		//점수에 따라 학점을 부여한다. →  char 타입의 변수
		int score = 5; //점수를 담고 있는 변수
		//다항연산자. 
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B'
					: (score > 70 )? 'C' : (score > 60) ? 'D' : (score > 50) ? 'E' : 'F' ;
		System.out.println(" 점수 : " + score + " 학점 : " + grade);
		
		//60점보다 크면 D
		//50점보다 크면 E
		//그 이외에는 F학점이 될 수 있게 다항연산자를 수정하시오.
		
	}
}

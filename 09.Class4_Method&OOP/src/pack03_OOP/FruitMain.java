package pack03_OOP;

public class FruitMain {
	public static void main(String[] args) {
		
		FruitDTO[] dtos = new FruitDTO[3];
		dtos[0] = new FruitDTO("사과", 500, 1, "안동");
		dtos[1] = new FruitDTO("배", 1000, 10, "나주");
		dtos[2] = new FruitDTO("포도",1500, 5, "영동");
		
		
		FruitDAO dao = new FruitDAO();
		dao.display(dtos);
		dao.displayMax(dtos);
		dao.displayUpper(dtos);
		
}
}

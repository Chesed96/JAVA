package pack02_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
//		dao.connTest();
		//Scanner를 이용해서 DTO를 만들기.
		MemberDTO dto = new MemberDTO(0, null, 0, null, null);
		Scanner sc = new Scanner(System.in);
				
//		dto.setNum(Integer.parseInt(sc.nextLine()));
//		dto.setName(sc.nextLine());
//		dto.setAge(Integer.parseInt(sc.nextLine()));
//		dto.setAddr(sc.nextLine());
//		dto.setTel(sc.nextLine());
//
//		dao.insertMember(dto);

//		dto.setName(sc.nextLine());
//		dto.setAge(Integer.parseInt(sc.nextLine()));
//		dto.setAddr(sc.nextLine());
//		dto.setTel(sc.nextLine());
//		dto.setNum(Integer.parseInt(sc.nextLine()));
//		
//		dao.updateMember(dto);

//		dto.setNum(Integer.parseInt(sc.nextLine()));
		
//		dao.deleteMember(dto);
		
//		dao.memberSelect();
		ArrayList<MemberDTO> list = dao.memberSelect();
		for (MemberDTO mdto : list) {
			System.out.println(dto.getNum() +"\t" + mdto.getName()+"\t" + mdto.getAge()+"\t" + mdto.getAddr()+"\t" + mdto.getTel());
			
		}
		
	}
}

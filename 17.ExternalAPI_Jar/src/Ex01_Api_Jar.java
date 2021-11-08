import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
//DAO ← 
public class Ex01_Api_Jar {
	public static void main(String[] args) {
		Ex01_DAO dao = new Ex01_DAO();
//		dao.getConn();
//		dao.dbclose();
//		dao.connTest();
		ArrayList<Ex01_DTO> list = dao.memberSelect();
		for (Ex01_DTO dto : list) {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getName() + "\t");
//			}
			System.out.println(dto.getNum() +"\t" + dto.getName()+"\t" + dto.getAge()+"\t" + dto.getAddr()+"\t" + dto.getTel());
			
		}
System.out.println("========================");		

		Ex02_HRDAO hrdao= new Ex02_HRDAO();
		ArrayList<Ex02_HRDTO> list2 = hrdao.memberSelect();
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).getEmployee_id()+ "\t" +list2.get(i).getFirst_name() + "\t" + list2.get(i).getLast_name() + "\t" + list2.get(i).getEmail() + "\t" + list2.get(i).getPhone_number());
		}
System.out.println("========================");

		Ex02_HRDAO hrdao2= new Ex02_HRDAO();
		ArrayList<Ex02_HRDTO> list3 = hrdao2.memberSelectUser(100,102);
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i).getEmployee_id()+ "\t" +list3.get(i).getFirst_name() + "\t" + list3.get(i).getLast_name() + "\t" + list3.get(i).getEmail() + "\t" + list3.get(i).getPhone_number());
		}
		
		
	}
		
}

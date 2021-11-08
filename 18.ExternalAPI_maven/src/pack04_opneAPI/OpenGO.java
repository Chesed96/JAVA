package pack04_opneAPI;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class OpenGO {
	public static void main(String[] args) {
		//1.Url (인터넷 주소) 필요
		//2.Url을 호출할 때 넘겨 줘야할 값들이 필요
		//https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816
		//?page=1
		//&perPage=10
		//&serviceKey=ZmhG%2B%2F2TwdEdQOa%2BZAcPsec6tTUy0rFd40uchvDFHu4meuWhyhlge4RNkSsNXNguT5mbSp1VGGi%2Bdjj0AA0vTA%3D%3D
		//3.Json형태로 받아서 사용하기.
		//json은 key 와 value 가 중괄호 블럭으로 { , }안에 표현이 되고,
		//대괄호 [ , ]는 하나의 리스트라고 생각하면 된다.
		//{} ← Object(String, int) [] ← Array
		String url = "https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816";
		//javacode에서 html주소로 request 응답을 요청받기 위한 처리 ↓
		try {
			String doc = Jsoup.connect(url).data("page", "1").data("perPage", "10")
							.data("serviceKey", "ZmhG+/2TwdEdQOa+ZAcPsec6tTUy0rFd40uchvDFHu4meuWhyhlge4RNkSsNXNguT5mbSp1VGGi+djj0AA0vTA==")
							.timeout(4000).userAgent("chrome").ignoreContentType(true)
							.execute().body();
			System.out.println(doc);
			
			JSONParser jsonParser = new JSONParser();
			try {
				JSONObject jsonObj = (JSONObject)jsonParser.parse(doc);
				JSONArray jarr = (JSONArray) jsonObj.get("data");
				//String[] arr = new String[3]
				ArrayList<GoDTO> list = new ArrayList<>();
				for (int i = 0; i < jarr.size(); i++) {
					JSONObject obj = (JSONObject) jarr.get(i);
					GoDTO dto = new GoDTO(
								obj.get("상 호")+"", 
								obj.get("소재지")+"", 
								obj.get("연락처")+"", 
								Integer.parseInt(obj.get("연번")+""), 
								obj.get("주메뉴")+"");
					list.add(dto);
				}
				for (GoDTO goDTO : list) {//  : <-기준 좌측은 빼올 그릇  : <-기준 우측 : 빼올 기준.
					System.out.println(goDTO.getSangho() + goDTO.getSojaji() + goDTO.getYeonlagcheo() + goDTO.getNum() + goDTO.getMenu());
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

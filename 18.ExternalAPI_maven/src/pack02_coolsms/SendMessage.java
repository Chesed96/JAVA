package pack02_coolsms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SendMessage {
	public static void main(String[] args) {
		//API_KEY를 final 상수로 쓰는 이유는 중간에 API키를 수정하지 못하게 하기 위함이다.
		
		final String api_key = "NCSIRLGLYFMDM1BL";
		final String api_secret = "XEBRR8RTXWBXTGOWQFFNIOZPIYLYSSFG";
		
		//문자를 보내기 위해서는 CoolSMS서버를 이용한다.
		//CoolSMS 서버에 요구하는 param를 보내주기만 하면
		//문자 전송은 알아서 함. (HashMap)←중복된 값을 넣을 수 없음.
		Message coolsms = new Message(api_key, api_secret);
		HashMap<String, String> paramas = new HashMap<>();
		paramas.put("to", "01020505154");
		paramas.put("from", "01020505154");
		paramas.put("type", "SMS");//type(SMS,LMS,MMS,AT)
		paramas.put("text", "CoolSMS TEST중입니다.");
		paramas.put("app_version", "JAVA SDK v1.2");//APP NAME ← CoolSMS
		
		try {
			JSONObject obj = coolsms.send(paramas);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
			e.printStackTrace();
		}
	}
}

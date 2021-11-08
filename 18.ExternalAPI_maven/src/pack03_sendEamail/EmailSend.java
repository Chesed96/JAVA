package pack03_sendEamail;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSend {
	public static void main(String[] args) {
		EmailSend es = new EmailSend();
//		es.sendEmailSimple();
//		es.attachMail();
		es.htmlMail();
	}
	
	public void htmlMail() {
		HtmlEmail mail = new HtmlEmail();// ← 파라메터를 입력받는 생성자 메소가 없음.
		mail.setHostName("smtp.naver.com");//naver 서버를 통하기 때문에 naver에서 지정해준 SMTP서버를 넣어준다.
		mail.setCharset("UTF-8");
		mail.setDebug(true);//디버깅을 허용, 버그 났을 때
		
		//네이버 2차 인증이 걸려있을 경우 SSLConnect
		mail.setAuthentication("kangeunhye55","0613380229tp*");
		mail.setSSLOnConnect(true);
		//이메을 전송을 위한 SimpleEmail 초기화를 완료함
		try {
			//메일을 보내는 사람	← 보내는 사람의 이메일
			//메일을 받는 사람		← 받는 사람의 이메일
			//메일의 제목 , 메일의 내용
			mail.setFrom("kangeunhye55@naver.com","강은혜");//메일 송신인 지정
//			mail.addTo("youngmoon525@naver.com","한울");//여러명에게 보낼 때는 addTo메소드 여러개.
			mail.addTo("kangeunhye55@naver.com","으네");
			
			mail.setSubject("도망가도 되나요...?");
			StringBuffer msg = new StringBuffer();
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<h3>도망갈래요ㅜㅠ</h3> ");
			msg.append("<p>월요일은 일하기 싫어..</p>");
			msg.append("<p>화요일은 일하기 싫어..</p>");
			msg.append("<p>수요일은 술이나 먹고..</p>");
			msg.append("<a herf='https://blog.naver.com/yulmu921/221592350911'>ㅜㅠ</a>");
			msg.append("</body>");
			msg.append("</html>");
			mail.setHtmlMsg(msg.toString());
//			mail.setMsg("실제 내용부, 하고싶은 말");
			//메일 전송 버튼
			EmailAttachment file = new EmailAttachment();
//			file.setPath("D:\\Study_Java\\IO_FORDER\\TESTIMG.png");
			//EmailAttachment 라는 객체를 이용해서 여기에 파일 패쓰를 지정해서 파일을 추가함.
			
			
			file = new EmailAttachment();
			URL url = new URL("https://blog.naver.com/yulmu921/221592350911");
			file.setURL(url); 
			
			mail.attach(file); // ← 이메일 객체에 파일이 추가됨.
			
			
			
			
			
			
			
			
			
			mail.send();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void attachMail() {
		MultiPartEmail mail = new MultiPartEmail();// ← 파라메터를 입력받는 생성자 메소가 없음.
		mail.setHostName("smtp.naver.com");//naver 서버를 통하기 때문에 naver에서 지정해준 SMTP서버를 넣어준다.
		mail.setCharset("UTF-8");
		mail.setDebug(true);//디버깅을 허용, 버그 났을 때
		
		//네이버 2차 인증이 걸려있을 경우 SSLConnect
		mail.setAuthentication("kangeunhye55","0613380229tp*");
		mail.setSSLOnConnect(true);
		//이메을 전송을 위한 SimpleEmail 초기화를 완료함
		try {
			//메일을 보내는 사람	← 보내는 사람의 이메일
			//메일을 받는 사람		← 받는 사람의 이메일
			//메일의 제목 , 메일의 내용
			mail.setFrom("kangeunhye55@naver.com","강은혜");//메일 송신인 지정
			mail.addTo("youngmoon525@naver.com","한울");//여러명에게 보낼 때는 addTo메소드 여러개.
			mail.addTo("kangeunhye55@naver.com","으네");
			
			mail.setSubject("회원가입 축하메세지");
			mail.setMsg("실제 내용부 하고싶은 말");
			//메일 전송 버튼
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_Java\\IO_FORDER\\TESTIMG.png");
			//EmailAttachment 라는 객체를 이용해서 여기에 파일 패쓰를 지정해서 파일을 추가함.
			
			
			file = new EmailAttachment();
			URL url = new URL("https://photo.sentv.co.kr/photo/2021/08/19/20210819084943.jpg");
			file.setURL(url); 
			
			mail.attach(file); // ← 이메일 객체에 파일이 추가됨.
			
			
			
			
			
			
			
			
			
			mail.send();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void sendEmailSimple() {
		//글씨만 있는 이메일, 파일첨부가 있는 이메일, html태그가 있는 이메일
		SimpleEmail mail = new SimpleEmail();// ← 파라메터를 입력받는 생성자 메소가 없음.
		mail.setHostName("smtp.naver.com");//naver 서버를 통하기 때문에 naver에서 지정해준 SMTP서버를 넣어준다.
		mail.setCharset("UTF-8");
		mail.setDebug(true);//디버깅을 허용, 버그 났을 때
		
		//네이버 2차 인증이 걸려있을 경우 SSLConnect
		mail.setAuthentication("kangeunhye55","0613380229tp*");
		mail.setSSLOnConnect(true);
		//이메을 전송을 위한 SimpleEmail 초기화를 완료함
		try {
			//메일을 보내는 사람	← 보내는 사람의 이메일
			//메일을 받는 사람		← 받는 사람의 이메일
			//메일의 제목 , 메일의 내용
			mail.setFrom("kangeunhye55@naver.com","강은혜");//메일 송신인 지정
			mail.addTo("youngmoon525@naver.com","한울");//여러명에게 보낼 때는 addTo메소드 여러개.
			mail.addTo("kangeunhye55@naver.com","으네");
			
			mail.setSubject("회원가입 축하메세지");
			mail.setMsg("실제 내용부 하고싶은 말");
			//메일 전송 버튼
			mail.send();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

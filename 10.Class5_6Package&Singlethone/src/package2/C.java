package package2;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import package1.B;
//pubilc 접근 제한자를 가진 B클래스는 같은 자바 프로젝트 내에서 언제든지 접근이 가능하다.
//하지만 dafault로 접근 제한자를 가진 A클래슨는 같은 '패키지' 내에서만 접근이 가능(하기때문에 다른 방법으로 접근해야한다.)->나중에 배움
public class C {
//	A a = new A();
	B b = new B();
	
}

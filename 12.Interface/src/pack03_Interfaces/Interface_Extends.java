package pack03_Interfaces;

import pack01_Interface.Testinterface;
import pack02_Interface.ReomteController;

//Interface 설계도도 상속이 가능하다.(extends)
//Interface의 특성은 extends가 다중으로 상속이 가능하다.
public interface Interface_Extends extends Testinterface, ReomteController{
	void itest1();
	void itest2();
	
}

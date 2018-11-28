package F_OOP2;

import E_OOP.ProtectedTest02;

public class ProtectedTest_01 extends ProtectedTest02{//다른 패키지에 존재하는 클레스를 조상으로 두고, 자신을 자손으로 두게되면
													  //protected로 선언한 변수값을 부를 수 있다.
	private void mine() {
		ProtectedTest03 pt2 = new ProtectedTest03();
		ProtectedTest02 pt3 = new ProtectedTest02();
		ProtectedTest_01 pt1 = new ProtectedTest_01();

		
		
	}
}

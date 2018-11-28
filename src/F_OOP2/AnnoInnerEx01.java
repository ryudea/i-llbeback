package F_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInnerEx01 {
	public static void main(String[] args) {
		
		ActionListener a = new EventHandler();//인터페이스 타입  변수명 = new 구현클레스 생성자();
		Button b = new Button();
		b.addActionListener(a);		
		
	}
	
	
}


class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) { // 인터페이스를 implements로 관계를 갖고 구현을 시키는 부분
		System.out.println("버튼눌림");		
	}	
}
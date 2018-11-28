package F_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInnerEx02 {
	public static void main(String[] args) {
		Button b = new Button(); // 버튼을 사용할때마다 메서드가 호출되기 때문에 횟수에 제한없이 계속 반복 호출된다.
		b.addActionListener(new ActionListener() { // 익명 클레스 - >매개변수 자리에 클레스에 있을 내용이 다 담김, class명이 없기 때문에 익명 클레스라고 한다.)
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼눌림");
			}
		});
		
	}//
}

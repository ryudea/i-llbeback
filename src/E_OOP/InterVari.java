package E_OOP;

class Data {
	int x;
}

public class InterVari {
	void change(int x) {
		x = 1000;
		System.out.println("change()기본형 : " + x);
	}

	void change(Data d1) {
		d1.x = 1000;
		System.out.println("change()참조형 : " + d1.x);

	}

	public static void main(String[] args) {
		// 데이터의 객체를 만들어주세요
		InterVari iv = new InterVari();
		Data d1 = new Data();

		// d1의 x값을 10으로 변경해주세요.
		d1.x = 10; // int x = 10;
		
		
		
		// main()기본형 : d1의 x값
		System.out.println("main() 기본형 : " + d1.x); // int x = 10;

		// change(d1의 x값)
		iv.change(d1.x); // 1000출력?
		System.out.println("after main() 기본형 : " + d1.x);

		// Data의 객체 d2
		Data d2 = new Data();

		// d2의 x값을 10으로 변경해주세요
		d2.x = 10; // d2.x= 10;

		// main()기본형 : d2의 x값
		System.out.println("main() 참조형 : " + d2.x);

		// change(d2)
		iv.change(d2);
		System.out.println("after main() 참조형 : " + d2.x);
	}
}

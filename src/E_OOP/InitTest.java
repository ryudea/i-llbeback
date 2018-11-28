package E_OOP;

public class InitTest {
	public static void main(String[] args) {
		System.out.println(Init.action);// 0 ==> 55, 명시적 초기화 -> 클레스 초기화 블럭
		Init it = new Init();// 15 -> 100 -> 20 , 명시적 초기화 -> 인스턴스 블럭 초기화 -> 생성자
								// 초기화.
		System.out.println(it.action2);// 20
	}
}

class Init {
	
	
	static int action;
	int action2 = 15; // 명시적 초기화.
	int action3;
	Init() {
		action2 = 20;
	}
	static { // 메서드 호출을 사용하지 않고도 초기화를 해줄 수 있다.
		// 100줄짜리 수식 -?
		action = 55;
	}
	{ // 인스턴스 초기화 블럭은 인스턴스 블럭부터 값이 들어간 후에 생성자의 값이 들어간다.
		// 많은 수식
		action2 = 100;
	}
	{ // 인스턴스 초기화 블럭은 위에서부터 아래로 순차적으로 실행된다.
		// 많은 수식
		action3 = 150;
	}
}
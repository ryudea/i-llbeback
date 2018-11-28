package E_OOP;

public class TvTest {
	public static void main(String[] args) {
		
		//클레스명.   EX)Tv.   <- 클레스 변수 호출. 여기서 뚤린 삼각형은 변수, 꽉찬 삼각형은 메서드, S는 static
//		//부모 클레스 밖에 있는 자식 클레스의 것을 불러들일때는 Tv.으로 불러들인다.
		String color= Tv.color;
		System.out.println(color); // null
		Tv.color = "MAGENTA";
		System.out.println(Tv.color);//MAGENTA
//		// 클레스명. 
		Tv.changeColor();
		System.out.println(Tv.color);// changeColor가 Tv클레스에서 green으로 저장되어 있기 때문에 green으로 출력.
//		//1)Tvd클래스의 인스턴스 생성
		
		Tv t = new Tv();//new(생성자) 인스턴스. int i = new int[]처럼 Tv i = new Tv()
						//클레스 Tv i = new 생성자 Tv() 인스턴스
		//인스턴스는 Static이 아니기때문에 s가 붙지 않는다.
		//여기서 선언된 t를 '참조변수'라고 부르며, t. 으로 인스턴스 변수 + 인스턴스 매서드 + 클레스 매서드를 부를 수 있다.
		//Tv 타입의 참조변수 t , Main method의 지역변수 t
		//인스턴스화를 한다 라고 표현한다.
	
		//1)t주소의 power를 출력해주세요.
		System.out.println(t.power);
		//2)t주소의 poewer매서드를 호출해주세요.
		t.power();
		//3)t주소의 poewer를 출력해주세요.
		System.out.println(t.power);
		//4)t주소의 채널을 16번으로 변경해주세요.
		t.channel = 16;
		//5)t주소의 채널매서드를 호출해주세요.
		t.channelup();
		//6)t주소의 체널을 출력해주세요.
		System.out.println(t.channel);
	}
}

class Tv{	
	//전역변수 세가지
	// static이 붙은 변수는 class 변수
	static String color;   // RGB코드를 불러들이기 위해서 String을 쓴다.
	//인스턴스 변수
	boolean power; // on off를 저장하기 위해서 true false를
	int channel;    //channel을 관리하기 위해서. 체널은 정수값	
	//class 메서드
	static void changeColor(){
		color = "green";
	}	
	//인스턴스 메서드
	void channelup(){
		channel++;
	}
	void power(){
		power = !power;//기본값이 false라서.
	}
}
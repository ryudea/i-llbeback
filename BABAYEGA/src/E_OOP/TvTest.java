package E_OOP;

public class TvTest {
	public static void main(String[] args) {
		
		//클레스명.   EX)Tv.   <- 클레스 변수 호출. 여기서 뚤린 삼각형은 변수, 꽉찬 삼각형은 메서드, S는 static
		String color= Tv.color;
		System.out.println(color); // null
		Tv.color = "MAGENTA";
		System.out.println(Tv.color);//MAGENTA
		// 클레스명. 
		Tv.changeColor();
		System.out.println(Tv.color);// changeColor가 Tv클레스에서 green으로 저장되어 있기 때문에 green으로 출력.
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
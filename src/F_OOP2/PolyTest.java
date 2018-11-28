package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1 스마트 티비 3대 저장하세요.
		Tv [] s = new SmartTv[3];
		s[0] = new SmartTv();
		s[1] = new SmartTv();
		s[2] = new SmartTv();
		
		//2ThreeDTv 2대 저장하세요.
		Tv [] tt = new ThreeDTv[2];
		tt[0] = new ThreeDTv();
		tt[1] = new ThreeDTv();
		
		//3.AfreecaTv 4대를 저장하세요.
		Tv[] a = new AfreecaTv[4];
		a[0] = new AfreecaTv();
		a[1] = new AfreecaTv();
		a[2] = new AfreecaTv();
		a[3] = new AfreecaTv();
		
		Tv[] t = new Tv[9];
		t[0] =(Tv)new SmartTv(); // up casting 큰놈 <- 작은 놈
		t[1] =new SmartTv();
		t[2] =new SmartTv();
		t[3] =new ThreeDTv();
		t[4] =new ThreeDTv();
		t[5] =new AfreecaTv();
		t[6] =new AfreecaTv();
		t[7] =new AfreecaTv();
		t[8] =new AfreecaTv();
		
		((SmartTv)t[2]).interNet();
		SmartTv st4 = (SmartTv)t[2]; //down casting  작은놈 <- 큰놈

		//down casting 주의점
		SmartTv ta = (SmartTv)new Tv();  //부모 타입의 참조변수로 자손 타입의 인스턴스를 저장할 수는 있어도 그 역은 불가능하다.
		
		
		
		
		
		
		
	}
}


class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	void channelUp(){
		channel++;
	}	
}

class SmartTv extends Tv{
	void interNet(){
		
	}
}

class ThreeDTv extends Tv{
	void threeD(){
		
	}
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}











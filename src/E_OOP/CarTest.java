package E_OOP;

public class CarTest {
	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);

		Car c2 = new Car("RED", "AUT", 2);
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		Car c3 = new Car("YELLOW","AUT");
		System.out.println(c3.color);
		System.out.println(c3.gearType);
		System.out.println(c3.door);

	}
}

class Car {
	String color;
	String gearType;
	int door;

	Car() { // 전역변수 없으면 쓰지마라 짜슥
		color = "BRACK";
		gearType = "STICK";
		door = 4;
	}

	Car(String color, String gearType){
		 this();//기본형을 일단 받고 거기서 변화를 준다는 의미. - 조건 :항상 생성자의 가장 윗부분에만 들어가야한다.
		 this.color = color;
		 this.gearType = gearType;		 
	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
//모두의 마블
//재귀 호출을 이용해서 
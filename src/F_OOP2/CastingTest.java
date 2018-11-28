package F_OOP2;

public class CastingTest {
	public static void main(String[] args) {
		
		FireCar fc = new FireCar();
		fc.warter();
		
		Car c = fc; // up Casting
		c.drive();
		c.stop();		
		
		FireCar fc2 = (FireCar)c;
		fc2.warter();
		
				
//		FireCar fc3 = (FireCar) new Car();// 자손 클레스의 인스턴스가 진행 안된 상태에서 부모의 인스턴스화는 불가능하다.
		
		
		
		
		
		
		
		
	}
}

class Car {
	String color;
	int door;
	
	void drive(){
		System.out.println("순천으로 고고");
	}
	void stop(){
		System.out.println("주차중 엘리제를 위하여");
	}
}


class FireCar extends Car{
	
	void  warter(){
		System.out.println("물뿌려");
	}
	
}

class Ambulance extends Car{
	
	void AED(){
		System.out.println("200줄 차지");
	}
}
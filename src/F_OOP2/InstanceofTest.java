package F_OOP2;

public class InstanceofTest {
	public static void main(String[] args) {
		
		FireCar fc = new FireCar();
		Car c = new Car();
		
		if(fc instanceof FireCar){ // fc가 FireCar를 포함하고 있느냐.
			System.out.println("fc는 FireCar의 인스턴스이다");
			FireCar fc2 = fc;
		}


		if(fc instanceof Car){ // fc가Car를 포함하고 있느냐.
			System.out.println("fc는 Car의 인스턴스이다");
			Car fc3 =fc;
		}
		

		if(fc instanceof Object){ // fc가 Object를 포함하고 있느냐.
			System.out.println("fc는 Object의 인스턴스이다");
			Object fc4 =fc;
		}
		
		if(c instanceof FireCar){ // c가 FireCar를 포함하고 있지 않다.
			System.out.println("c는 FireCar의 인스턴스이다");
		}else{
			System.out.println("c는 FireCar의 인스턴스가 아니다");
		}
		
		if(c instanceof Car){ // c가 Car를 포함하고 있다.
			System.out.println("c는 Car의 인스턴스이다");
		}else{
			System.out.println("c는 Car의 인스턴스가 아니다");
		}
		
		if(c instanceof Object){ // c가 Object를 포함하고 있다.
			System.out.println("c는 Object의 인스턴스이다");
		}else{
			System.out.println("c는 Object의 인스턴스가 아니다");
		}
		
		
		
		
		
		
		
	}
	
}

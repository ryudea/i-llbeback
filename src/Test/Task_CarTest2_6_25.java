package Test;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);
	}
	Car(String color){
		this();
		this.color = color;
	}
	Car(String a, String b,int c){
		this.color = a;
		this.gearType = b;
		this.door = c;
	}
	
}


public class Task_CarTest2_6_25 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");		
		System.out.println("c1의 color = "+ c1.color + ", gearType = "+ c1.gearType
				+ ", door ="+ c1.door);
		System.out.println("c2의 color = "+ c2.color + ", gearType = "+ c2.gearType
				+ ", door ="+ c2.door);		
	}
}


//자바 파일명과 같은 Task_CarTest2_6_25가 먼저 method area에 로드됩니다.
//클레스 변수는 없고, 클레스 메소드인 main()가 같이 로드됩니다.
//call stack에 main()의 영역이 쌓입니다.
//Car c1 = new Car(); 라는 인스턴스화가 진행하기 위해서
//Car라는 클레스를 찾아, 로드시킵니다. Car에는 클레스 변수와 클레스 메소드가 없기 때문에 Car 클레스
//만이 method area에 로드됩니다.
//heap 메모리에 Car 클레스 내의 인스턴스 변수 String color , String gearType, int door와
//인스턴스 메소드이자 생성자인 Car(), Car(String), Car(String,String,int)가 저장됩니다.
//기본 생성자를 통해서 color = "white", gearType = "auto", door = 4가 초기화되어 저장됩니다.
//이때 저장된 장소의 주소값이 c1에 저장되고, c1은 call stack에 위치한 main()의 영역에 지역변수로서 저장됩니다.
//Car c2 = new Car(); 라는 인스턴스화가 진행하기 위해서
//Car 클레스가 method area에 로드되어 있기 때문에 따로 로드시키지는 않습니다.
//heap 메모리에 Car 클레스 내의 인스턴스 변수 String color , String gearType, int door와
//인스턴스 메소드이자 생성자인 Car(), Car(String), Car(String,String,int)가 저장됩니다.
//생성자 Car(String)를 통해서 초기화가 진행되며
//이때 this();를 통해서 기본생성자가 호출되어 color = "white", gearType = "auto", door = 4로 초기화가 진행되고,
//이후 this.color = color;를 통해서 color값은 "blue"가 됩니다.
//이때 저장된 장소의 주소값이 c2에 저장되고, c2은 call stack에 위치한 main()의 영역에 지역변수로서 저장됩니다.
//출력문을 통해서 c1은  color = "white", gearType = "auto", door = 4가 출력되며
//출력문을 통해서 c2는  color = "blue", gearType = "auto", door = 4가 출력됩니다.
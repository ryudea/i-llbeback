package Test;

class MyMath2 {

	long a, b;

	long add() {
		return a + b;
	}

	long subtract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	long divide() {
		return a / b;
	}

	static long add(long a, long b) {
		return a + b;
	}

	static long subtract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static double divide(double a, double b) {
		return a / b;
	}

}

public class Task_MyMathTest_6_19 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));

		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}


//파일명과 같은 클레스가 최초에 실행되기 때문에 MyMath2가 아닌 Task_MyMathTest_6_19클레스가
//가장 먼저 method area에 로드됩니다. 이때 클레스 변수와 클레스 메소드가 같이 저장되는데
//main()밖에 없으므로 main()만이 같이 로드되며, call stack에 main()가 쌓입니다.
//출력문에 존재하는 MyMath2라는 클레스가 있는지 서치해보며, 확인되면 클레스를 method area에 로드시킵니다.
//이때 클레스 변수는 없고, 클레스 메서드인 add(),subtract(), multiply(), divide()를 같이 저장합니다.
//클레스명을 통해서 호출된 메서드들이 실행되고, 리턴받은 값을 출력합니다.
//이때 divide의 경우 double 타입이기 때문에 long타입을 자동으로 형변환하여 식을 실행, 값을 돌려받습니다.
//MyMath2 mm = new MyMath2();를 통해서 인스턴스화를 진행합니다.
//클레스는 이미 로드가 되어 있으니 다시 클레스를 로드할 필요는 없습니다.
//heap 메모리에 인스턴스 변수와 인스턴스 메소드가 저장되는데, 이때 인스턴스  변수인 long a, long b
//메소드인 add(), subtract(), multiply(), divide()가 저장되고, 저장된 주소는 mm에 저장됩니다.
//콜 스택 내에서 main() 영역에 지역변수 mm이 저장됩니다.
//mm을 통해 호출된 long a에 200L값이 저장됩니다.
//mm을 통해 호출된 long b에 100L값이 저장됩니다.
//저장된 a,b값을 이용해서 인스턴스 변수들이 값을 계산하게 되고, 클레스 메소드들과 다를바없는 계산식을 가졌기 때문에
//동일한 값이 출력됩니다.

package Test;

public class Task_MyMathTest_6_6 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5l, 3l);
		
		System.out.println("add(5L, 3L) = " + mm.add(5L, 3L));
		System.out.println("subtract(5L, 3L) = " + mm.subtract(5L, 3L));
		System.out.println("multiply(5L, 3L) = " + mm.multiply(5L, 3L));
		System.out.println("divide(5L, 3L) = " + mm.divide(5L, 3L));
		
		
		
	}
}

class MyMath{
	long add(long a , long b) {
		return a+b;
	}
	long subtract(long a , long b){
		return a-b;
	}
	long multiply(long a, long b){
		return a*b;
	}
	double divide(double a, double b){
		return a/b;
	}	
	long add(int a , int b){
		return (long)a*a*b;
	}
	
}

//class MyMathTest를 로드합니다.
//이때 클레스 친구들인 클레스 변수와 메소드가 같이 로드되는데 MyMath 내에는 main()만 있기 때문에 main()만
//method area에 저장됩니다.
//call stack에 main()가 쌓입니다.
//MyMath mm = new MyMath();를 인스턴스화하기 위해서 MyMath 클레스가 로드되어 있는지 파악합니다.
//MyMath 클레스가 존재함을 확인하였으므로 클레스 내의 클레스 변수와 클레스 메소드를 같이 로드시키려하지만 없기 때문에 
//MyMath 클레스만이 로드됩니다.
//Heap 메모리에 인스턴스 변수와 인스턴스 메소드가 저장되고, 그 저장된 장소의 주소값이 mm이라는 참조변수에 저장됩니다.
//인스턴스 변수는 없고, 인스턴스 메소드인 add(), subtract(), multiply(),divide()가 저장됩니다.
//mm은 참조변수이자 지역변수로써 call stack에 쌓인 main()에 저장됩니다.
//long result1 에 mm을 통해 불러내진 add(5L, 3L)이 호출되어 구해진 값 8 저장됩니다.
//long result2 에 mm을 통해 불러내진 subtract(5L, 3L)이 호출되어 구해진 값 2이 저장됩니다.
//long result3 에 mm을 통해 불러내진 multiply(5L, 3L)이 호출되어 구해진 값 15이 저장됩니다.
//double result4 에 mm을 통해 불러내진 divide(5L, 3L)이 호출되어 구해진 값 1.66666 ....값이 저장됩니다.
//이때 long값으로 호출하였지만 매개변수가 double 타입이기 때문에 자동으로 double 타입으로 형변환되어 값을 계산합니다.













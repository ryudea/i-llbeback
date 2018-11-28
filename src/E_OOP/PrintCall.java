package E_OOP;

public class PrintCall {

	
	int a1 = 3;
	int b1 = 5;
	
	long a2 = 6L;
	long b2 = 8L;

	//1.매서드명은 add
	//매개변수 int 한개
	//매개변수와 a1의 합계를 반환하는 매서드를 만드세요.
	
	long add(int a){
		long result = (long)a1+a;
		return result;
	}	
	
	//2.매더스명 add
	//매개변수 long 하나
	
	long add(long a){
		long result = a2 + a;
		return result;
	}
	
	//3 
	long add(int a, int b){
		long result  = (long)a1 +b1 + a + b;//오버플로때문에 long으로 저장했습니다.
		return result;
	}
	//4
	long add(int a, long b){
		long result  = a + b;
		return result;
	}
	//5
	long add(long a, int b){
		long result  = b2 + a + b;//오버플로때문에 long으로 저장했습니다. + 위에서 선언됬기 때문에 오류가 뜸.
		return result;		
	}
	
	
}

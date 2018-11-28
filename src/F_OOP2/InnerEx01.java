package F_OOP2;

public class InnerEx01 {
	class InstanceInner{ //인스턴스 클레스
		int iv =  100; // 인스턴스 변수 사용가능
//		static int cv = 200; // 사용이 불가능하다.
		final static int CONST = 200;//상수만큼은 예외적으로 사용가능하다. 값이 변하지 않기 때문에?
	}
	
	static class StaticClass{//스테틱 클레스
		
		static int cv = 500;
		int iv = 100;
	}
	void method(){
		
		class LocalClass{//지역 클레스
			int iv = 200;
//			static int cv = 20;//사용이 불가능하다. 			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}

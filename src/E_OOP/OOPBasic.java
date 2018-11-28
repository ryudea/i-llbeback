package E_OOP;

public class OOPBasic {
	public static void main(String[] args) {
		
		/*
		 1.OOP : object -Oriented - Programming (객체지향프로그래밍)
		 
		 2.객체지향언어
		   -기존의 프로그래밍 언어에 몇가지 새로운 규칙을 추가한 보다 발전된 형태이다.
		   -규칙들을 이용해서 코드간에 관계를 맺어 줌으로써 (7장에서 배움 ㄱ-;) 보다 유기적으로 프로그램을 구성한다.
		   -객체지향언어의 특징
		     : 코드의 재사용성이 높다.
		     : 코드의 관리가 용이하다.(재사용하는 코드를 변경하면 전체적으로 다 바뀜)
		     : 신뢰성이 높은 프로그래밍이 가능하다.(전체적으로 변하기 때문에 인지하기 쉽다.)
		 3.class 와 객체 (oriented)
		   1)class란
		   -객체를 정의해 놓은 것이다.
		   -객체의 설계도 또는 틀이다.
		   
		   2)class의 선언
		   -[접근제어자][지정예약어] class 클래스명 [extends(상속) 클래스명] [implements 인터페이스]
		      public  abstract class Child  extends Parent implement Serializable
		   
		   3)객체란?
		   - 실제로 존재하는 것, 사물 또는 개념.
		   - Tv
		   - 객체의 구성 요소
		      속성: (맴버변수 , 특성, 필드 , 상태)
		      ex) 크기, 길이, 높이, 색상, 볼륨... 등등
		      기능: (메서드 , 함수, 행위)
		   	  ex) 켜기 , 끄기, 볼륨높이기, 색을 칠하기... 등등
		   	  
		 4.인스턴스란?
		  - 클레스로부터 객체를 만드는 과정을 인스턴스화라고 한다.
		  - Tv클레스로부터 만들어진 객체를 Tv클레스의 인스턴스라고 한다.
		  - 1) 클래스명(타입) 변수명; = > 클레스이 객체를 참조하기 위한 참조변수를 선언한다.
		  	2) 변수명 = new 클레스명(); = > 클레스의 객체를 생성 후, 객체의 주소를 참조변수에 저장한다.
		   	3)	1)		Tv t;    		  
		   		2)		t = new Tv();     
		   		3)    Tv t = new Tv();
		   	4) 인스턴스는 참조변수를 통해서만 다룰 수 있다. 참조 변수의 타입은 인스턴스의 타입과 일치해야 한다.
		   	
		 5.선언 위치에 따른 변수의 종류
		  -종류 : 전역변수(클레스변수, 인스턴스 변수) , 지역변수
		  
		  1)전역변수
		  
		  -클레스 변수 
		   :모든 인스턴스가 공통된 저장공간(변수)를 공유한다.
		   :한 클레스의 모든 인스턴스들이 공통적인 값(고정된 값)을 유지해야 하는 경우 클레스 변수로 선언한다.  		
		   :인스턴스 변수 앞에 static만 붙인다.
		  
		  -인스턴스 변수
		   :클레스의 인스턴스를 생성할때 만들어진다.[new]
		   :인스턴스 변수의 값을 읽어 오거나 저장하기 위해서는 먼저 인스턴스화를 해야한다.[heap]
		   :인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다.(class변수와 다른 가장 큰 특징)
		   :인스턴스마다 고유한 상태를 유지해야 하는 경우 인스턴스 변수로 선언된다.
		   
		  2)지역변수
		  :method 내에서 선언되어야 하며 method 내에서만 사용가능하다.
		  :method 종료시에 사용할 수 없다.
		   
		   
		6.method(), 메서드
		 - 어떠한 작업을 수행하기 위한 명령문의 집합(지역변수들 ~ )
		 - 주로 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.
		    => 값이 주어지면 매서드 내의{} 실행문들을 실행하고 그 결과를 돌려준다.
		 - 입력값이 없을 수도, 결과를 반환하지 않을 수도 있다.
		 - 반복적으로 사용되는 코드를 줄이기 위해서 사용한다.
		    => 유지보수가 유용하다.
		  
		 -작성방법
		  1)메서드명(변수타입 변수명 , 변수의 타입 변수명, 변수의 ...){
		  
		  } // 
		  
		  2(반환타입 매서드명(변수타입 변수명, 변수의 타입 변수명, 변수의 ...){//()안의 것들을 '선언부'라고 한다. {}를 구현부라고 한다.
		  	return; //
		  }//void: 수행 후 결과값을 주지 않는 다는 뜻. 리턴 타입과 반환매서드의 타입은 같아야한다.
		  
		  3) 메서드가 정상적으로 종료되는 경우
		    :매서드의 블럭{} 내의 마지막 문장까지 수행하였을때
		    :매서드의 블럭 {}내에서 return문을 만났을때
		    
		  4)return  
		    
		 - 반환값
		  :없는 경우에는
		     => return;
		     => 반환 타입은 void라고 써야 한다.
		   
		  "있는 경우에는
		     =>return 반환깞
		     =>반한타입  과 한한 값 타입이 갈라야 한다.
		     		 
		8. class 맴버와 instance 맴버간의 참조와 호출
		  -같은 class의 맴버 간에는 객채생성(인스턴스화)이나 참조변수(선언된 변수)없이 참조할 수 있다.
		  -class 맴버들은 instance 맴버들을 참조할 수 없다.
		  -instance 맴버가 존재하는 시점에서는 class 맴버가 존재한다.
		  -class 맴버가 존재하는 시점에서는 instance 변수의 존재가 확정되지 않기 때문에, 없다고 취급한다.
		  
		9. 매서드 오버로딩
		  -한 클레스 내에 같은 이름의 매서드를 여러개 정의하는 것이다.
		  -대표적인 예는 println()이다.
		  -조건
		  	: 매서드 명이 같아야한다
		  	: 매개변수의 갯수 또는 타입이 달라야한다.
			: return 값은 관련이 없다.(헷갈림.)
			
		  -장점 
		  	:매서드의 이름으로만 구분되면, 한 클레스의 모든 메서드의 명은 다 달라야한다.
		  	:근본적으로 같은 기능을 하는 것인데 다른 이름으로 표현되면 기억하기가 어렵다.
		  	:매서드의 이름을 짓는 고민을 덜 수 있다.
	    10. 매개변수
	      -매서드를 호출할때 매개변수로 저장한 값(인수)을 매서드의 매개변수에 복사하여 넘겨준다.
	      -기본형 매개변수
	      	: 단순히 저장된 값만 복사한다.
	      	: 변수의 값을 읽기만 할 수 있다.
	      -참조형 매개변수(class타입)
	        : 인스턴스의 주소가 복사된다.
	        : 변수의 값을 읽고 변경할 수 있다. 
	        
	    11. 매서드의 종류
	      -class method
	       	:객체 생성(인스턴스화) 없이 클레스명.클레스메서드명()으로 호출한다.
	       	:인스턴스맴버와 관련없는 작업을 수행한다.
	     	:매서드 내에서 인스턴스 맴버를 사용할 수 없다.
	     	:매서드 내에서 인스턴스 맴버를 사용하지 않는다면 static을 붙이는 것을 고려한다.
	     	
	      -인스턴스 method
	      	:객체 생성(인스턴스화)후 참조변수명.매서드명() 으로 호출한다.
	      	:클레스, 인스턴스 매서드를 모두 호출이 가능하다.
	     
	     
	    12. JVM 메모리 구조
	    	:Method Area
	    	 ->프로그램 사용 중 class 가 사용되면 클레스이 정보를 저장한다.
	    	 ->클레스 메서드와 클레스 변수도 같이 저장된다.
	    	 
	    	:Call Stack
	    	 -> 메서드의 작업에 필요한 메모리 공간을 제공한다.
	    	 -> 메서드가 호출되면 호출스텍에 호출된 메서드를 위한 메모리가 할당되며, 
	    	 	메서드가 작업을 수행하는 동안 지역변수 들과 연산의 중간결과 등을 저장한다.
	    	 
	    	:Heap Area
	    	 ->인스턴스가 생성되는 공간이다.
	    	 ->인스턴스 매서드와 인스턴스 변수가 같이 저장된다.
	    
	    
	    13. 재귀호출(Recursive Call)
	    	:매서드 내부에서 매서드 자신을 다시 호출하는 것.
	    	:factorial
	    	
	    14. 생성자
	  		 -> 인스턴스가 생성될때 호출되는 인스턴스 초기화 메서드이다.
	  		 -> Tv t = new Tv(); 
	  		 -> 여기서 Tv()는 컴파일러가 기본적으로 만들어져서 초기화시켜주는걸 기본 생성자라고 한다.            
	  		 -> 특징
	  		   :매서드처럼 클레스 내에서 선언된다.
	  		   :기본적으로 리턴값이 없다.
	  		   :생성자도 매서드이기 때문에 리턴되는 값이 없으면 void를 반환타입에 적어줘야 하지만
	  		       모든 생성자는 리턴값이 없기 때문에 void를 생략한다.
	  		   :생성자의 명은 클레스 명과 동일해야 한다.
	  		 
	  		 -> 정의방법
	  		   :기본생성자 
	  		      클레스명(){
	  		    
	  		    }
	  		   :초기화 시키는 생성자
	  		   
	  		   
	  		   :매개변수가 있는 생성자
	  		       클레스명(변수타입 변수명,변수타입 변수명,변수타입 변수명, ...){
	  		       
	  		    }
	  		    
	  	15. 변수의 초기화
	  	  ->변수를 선언하고 처음으로 값을 저장하는 것을 변수의 초기화라고 합니다.
	  	  1)명시적 초기화
	  	   : 변수의 선언과 동시에 초기화를 한다.
	  	   ex) int a = 10;, int a = 0; 
	  	   
	  	  2)생성자를 이용한 초기화
	  	  3)초기화 블럭 {} :변수의 복잡한 초기화(명시적 초기화로는 불가능할때)의 경우 사용된다.
	  	    ->클레스 초기화 블럭
	  	     :
	  	    
	  	    ->인스턴스 초기화 블럭
	  
	  		   
	  	
	    
	    
		  
		 */
		
		
		
		
		
		
	}
	
}
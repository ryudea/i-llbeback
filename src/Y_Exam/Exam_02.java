package Y_Exam;

public class Exam_02 {
	public static void main(String[] args){
	
		/*
		 *  
		 
	
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		
		      1 byte   2 byte   4 byte   8 byte
		논리형    boolean
		========================================
		문자형                  char
		========================================
		정수형  byte      short    int       long
		========================================
		실수형                              float     double
		========================================
		
		
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
		초기화 하는 한 줄의 코드를 적으시오.
		
		long regNo = 9513234654664L;( 4byte를 넘어가는 숫자는 long이 인식할 수 있도록 숫자 뒤에 L을 붙여넣어야 한다.)
		
		
		
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		int i = 100;
		long l =100L;
		final float PI = 3.14f;
		
		- 리터럴 : 100, 100L, 3.14f
		- 변수 : i ,  l 
		- 키워드 : int, long, final, float 
		- 상수 : 	PI (원주율)
		
		
		
		
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
		a. int 
		b. Byte -> 앞에 대문자가 들어가면 예약어로써 기능하지 않는다.
		c. double
		d. boolean
		
		답: b
		
		
		
		
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
		류’라고 적으시오.
		
		(자동 형 변환)
		1. byte => short => int => long => float => double => String (형변환)
		2. 기본 연산형은 int로 int 아래에 위치한 byte, short, char는 int로 형변환된다.(두개의 연산자가 int와 같거나 아래에 위치한 데이터 크기를 가졌을때만 해당된다.)
		3.두개의 다른 데이터를 더할때 더 높은 데이터값으로 자동 형변환하여 계산합니다. 
		4. 두개의 연산자가 4byte보다 작게 되면, 두 연산자는 int 값으로 형변환되어 계산된다.
		5. 정수 또는 실수값으로 변환시킬 수 없는 boolean형, String형, null( =모든 참조형의 기본값)형의 경우 피연산자가 'String'이 아닐경우 연산하는 것이 불가능하기 때문에
		    오류가 나타난다.
		6.jvm이 int(4byte)로 연산을 하기 때문에 그 밑에 위치한 데이터 크기를 가진 연산자, 피연산자는 int로 형변환된다.
		
		
		
		System.out.println(“1” + “2”) → (12)          
		System.out.println(true + “”) → (ture)        
		System.out.println(‘A' + 'B') → (131 )         'A' = 65 , 'B' = 66의 정수값(int)로 변환된다, 따라서 65+66 = 131이라는 값이 도출된다.
		System.out.println('1' + 2) → (51)             '1' = 49, 49+2= 51라는 값을 가진다.
		System.out.println('1' + '2') → (99)           '1'= 49, '2'= 50, 49+50 = 99
		System.out.println('J' + “ava”) → (Java)       		
		
		
				
				
				
		
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
		a. if    : 0
		b. True  : x	true
		c. NULL  : X	null
		d. Class : x	class
		e. System: X
		
		답: b,c,d,e [변수명으로 예약어(keyworld)를 사용할 수 없다.]
		
		
		
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
		a. $ystem     가능
		b. channel#5   '_', '$' 이외의 특수문자 사용
		c. 7eleven    숫자가 맨앞에 있다
		d. If         if가 예약어, If는 변수로 사용 가능
		e. 자바             가능 (규칙이 아닌 약속에서 금지하기 때문에)
		f. new        예약어
		g. $MAX_NUM   가능
		h. hello@com  '_', '$' 이외의 특수문자 사용
		
		답: a,d,e,g
		
		
		
		
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
		르시오)
		a. int
		b. long
		c. short
		d. float
		e. double
				
		참조형 변수는 4byte의 크기를 갖습니다. 따라서 같은 크기의 기본형인 int, float이 답입니다.(a,d)
		
		
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		1. byte => short => int => long => float => double
                           ^		
		                  chr
		                  
		2. x  = y 일때 변수x가 변수y의 데이터 크기보다 크면 y 앞에 붙이는 형변환(casting)을 생략할 수 있다. 
		     <-
		
		
		
		
//		a. b = (byte)i;                  (x)-> b= byte , i = intb     // byte = int
		b. ch = (char)b;                 (x)-> ch = char , b = byte   // char = byte
         c. short s = (short)ch;         (x)-> s = short ,  ch = char //  short = char
		d. float f = (float)l;           -> f = float , l = long (가능)// float =  long 
		e. i = (int)ch;                  -> i = int, char = char (가능)// int = char
		
		답: d,e
		
		
		
		
		
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
			  
			  0~(2^16)-1 = 65535


		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)   -틀린 문제 < e를 틀림>
		a. byte b = 256;      byte가 도출할 수 있는 값의 최대한은 (2^7)-1 = 127이다. 그보다 높은 수는 오버플로우가 되어버린다.
		b. char c = '';      char의 경우 '' 안에 공백이 있으면 에러가 발생한다(기본형 변수이기 때문에 단 하나의 값이 없으면 오류가 뜬다).
		                                참조형인 String는 ""를 했을때 공백도 주소로 취급해서 출력된다.
		c. char answer = 'no';  기본변수는 단 하나의 값을 가진다. 즉... ''안에 하나의 단어이상이 있을 경우 오류가 발생한다.
		d. float f = 3.14       ;로 마무리 짓지 않았으며 리터럴값 뒤에 f를 붙이지 않으면 문장은 오류가 발생한다.
		e. double d = 1.4e3f;   double d = (double)1.4e3f; <- double = float 이라 생략됨/
		
		답: a, b, c, d
		
		
		
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
		a. boolean - false (0)
		b. char - '\u0000' (0) 유니코드
		c. float - 0.0     (x) float - 0.0f
		d. int - 0         (0)
		e. long - 0        (X) long - 0L
		f. String - ""     (x) String - nell
		
		
		자료형            기본형
		boolean    false
		char       '\u0000'
		byte       0
		short      0
		int        0
		long       0L
		float      0.0f
		double     0.0 or 0.0d
		참조형           null
		
		답: c, e, f
				
	   */
		
	}
}

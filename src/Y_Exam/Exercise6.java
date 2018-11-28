package Y_Exam;

import java.util.Arrays;

//package Y_Exam;
//
//public class Exam_06 {
//	public static void main(String[] args) {
//		
//		[6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
//int num 카드의 숫자.(1~10사이의 정수)
//boolean isKwang 광(光)이면 true, 아니면 false
//	}
//}
// [6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
// 결과와 같은 결과를 얻도록 하시오.
// [연습문제]/ch6/Exercise6_2.java
//class Exercise6 {
//	public static void main(String args[]) {
//		SutdaCard card1 = new SutdaCard(3,false);
//		SutdaCard card2 = new SutdaCard();
//		System.out.println(card1.info());
//		System.out.println(card2.info());
//		}
//}
//
//class SutdaCard {
//	int num;
//	boolean isKwang;
//
//	SutdaCard() { // 초기값 설정.
//		this(1, true);
//	}
//
//	SutdaCard(int num, boolean isKwang) {//num과 boolean의 값이 들어갔을때의 메소드
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//
//	String info(){//출력 메소드"
//		return num + (isKwang ? "K" : "");	//초기값, 인자가 들어간 것 두가지를 다 포함해야하기때문에?
//	}
//
//}

//===============================================================================

// [6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
// 타 입 변수명 설 명
//
//class Student {
//	
//	String name; // 학생이름
//	int ban; // 반
//	int no; // 번호
//	int kor; // 국어점수
//	int eng; // 영어점수
//	int math; // 수학점수
//	
//	Student(){
//		
//	}	
//	Student(String string, int i, int j, int k, int l, int m) {
//		this.name = string;
//		this.ban = i;
//		this.no = j;
//		this.kor = k;
//		this.eng = l;
//		this.math = m;
//	}
//
//	String info() {
//		String print = name + "," + ban + "," + no + "," + kor + "," + eng
//				+ "," + math + "," + getTotal() + "," + getAverage();
//		return print;
//	}
//
//	// 1. 메서드명 : getTotal
//	// 기 능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
//	// 반환타입 : int
//	// 매개변수 : 없음
//
//	int getTotal() {
//		int sum = kor + eng + math;
//		return sum;
//	}
//
//	// 2. 메서드명 : getAverage
//	// 기 능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
//	// 소수점 둘째자리에서 반올림할 것.
//	// 반환타입 : float
//	// 매개변수 : 없음
//
//	float getAverage() {
//		float avr = (int) (((float) (kor + eng + math) / 3) * 10 + 0.5f) / 10f;
//		return avr;
//	}
//
//}
//
//// [6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
//// getTotal()과 getAverage()를 추가하시오.
////
//class Exercise6 {
//	public static void main(String args[]) {
//
////4번 문제
//		Student s = new Student();
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		System.out.println("이름:" + s.name);
//		System.out.println("총점:" + s.getTotal());
//		System.out.println("평균:" + s.getAverage());
//
////5번 문제 
//
//		Student s1 = new Student("홍길동", 1, 1, 100, 60, 76);
//		System.out.println(s1.info());
//	}
//}
// }

// [실행결과]
// 이름:홍길동
// 총점:236
// 평균:78.7

// ===============================================================================

// }
// [6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
// [Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
// [연습문제]/ch6/Exercise6_6.java
//class Exercise6 {
//	// // 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
//	static double getDistance(int x, int y, int x1, int y1) {
//
//		double total = Math.sqrt(((x - x1) * (x - x1)) + ((y - y1) * (y - y1)));
//		return total;
//	}
//
//	public static void main(String args[]) {
//		System.out.println(getDistance(1, 1, 2, 2));
//	}
//}

// [실행결과]
// 1.4142135623730951

// [6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
// 드로 정의하시오.
//
//class MyPoint {
//	int x;
//	int y;
//
//	MyPoint(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	double getDistance (int x1 , int y1){	
//		double total = Math.sqrt(((x - x1) * (x - x1)) + ((y - y1) * (y - y1)));
//		return total;
//	}
//	
//}
//
//class Exercise6 {
//	public static void main(String args[]) {
//		MyPoint p = new MyPoint(1, 1);
//		// p와 (2,2)의 거리를 구한다.
//		System.out.println(p.getDistance(2, 2));
//	}
//}
//







// [6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
//class PlayingCard {
//	int kind;
//	int num;
//	static int width;
//	static int height;
//
//	PlayingCard(int k, int n) {
//		kind = k;
//		num = n;
//	}
//
//	public static void main(String args[]) {
//		PlayingCard card = new PlayingCard(1, 1);
//	}
//}
// - 클래스변수(static변수) : width, height
// - 인스턴스변수 : kind, num
// - 지역변수 : k,n,card

// [6-9] 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
// 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
// (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
//class Marine {
//	int x = 0, y = 0; // Marine의 위치좌표(x,y)
//	int hp = 60; // 현재 체력
//	static int weapon = 6; // 공격력 , 모든 병사의 공격력과 방어력은 같아야 하기 때문에 static
//	static int armor = 0;  // 방어력 , 모든 병사의 공격력과 방어력은 같아야 하기 때문에 static
//
//	static void weaponUp() {
//		weapon++;
//	}
//	
//	static void armorUp() {
//		armor++;
//	}
//
//	void move(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}
// 		[6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
// a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다. (옳다)
// b. 생성자는 객체를 생성하기 위한 것이다.          (인스턴스 변수를 초기화하기 위한 것이다.) <- 틀림.
// c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.  (인스턴스를 하기 위해 반드시 하나 이상이 있어야한다.)
// d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.(옳다.)
// e. 생성자는 오버로딩 할 수 없다.(할 수 있다.) <ㅡ틀림.

//		 [6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
// a. 객체 자신을 가리키는 참조변수이다.      (옳다. 해당 클레스에 속한 인스턴스가 있는 heap을 가르키는 참조변수.)
// b. 클래스 내에서라면 어디서든 사용할 수 있다. (클레스 필드 내에서는 사용이 불가능하다. this는 클레스 변수와 메소드를 지정할 수 없다.)
// c. 지역변수와 인스턴스변수를 구별할 때 사용한다. (옳다.)
// d. 클래스 메서드 내에서는 사용할 수 없다. 
//  (옳다, 인스턴스(전역) 변수나 매서드명이  매서드 내 지역변수와 이름이 겹칠때, 
//    전역변수인지 지역변수인지 구분짓기 위해 쓰이기 때문이다.)

// 		[6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
// a. 메서드의 이름이 같아야 한다.  (옳다.)
// b. 매개변수의 개수나 타입이 달라야 한다. (옳다.)
// c. 리턴타입이 달라야 한다. (틀리다. 리턴타입과 오버로딩은 관계가 없다.)
// d. 매개변수의 이름이 달라야 한다. (틀리다. 매개변수의 이름이 같아야 오버로딩이 가능하다.)
// 

// 	[6-13] 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)

// 시작점   long add(int a, int b) { return a+b;}


// a. long add(int x, int y) { return x+y;} (틀림-변수 타입이 같으면 안된다.)
// b. long add(long a, long b) { return a+b;}(옳음)
// c. int add(byte a, byte b) { return a+b;}(옳음)
// d. int add(long a, int b) { return (int)(a+b);}(옳음)

// 	[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)

// a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다. (지역변수만 자동으로 초기화가 되지 않는다.)
// b.지역변수는 사용하기 전에 반드시 초기화해야 한다. (지역변수를 사용하기 위해서는 반드시 초기화를 해야하고, 
//메서드 내의 지역변수는 자동으로 초기화되지 않기 때문에 사용하려면 반드시 초기화해야한다.)
// c.초기화 블럭보다 생성자가 먼저 수행된다.       (명시적 초기화 -> 초기화 블럭 -> 생성자
// d.명시적 초기화를 제일 우선적으로 고려해야 한다. (맞다.)
// e.클래스변수보다 인스턴스변수가 먼저 초기화된다. (최초에 클레스 변수가 초기화 되고, 그 다음이 인스턴스이다.)
// c, e

// [6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은?
// a. 기본값-명시적초기화-초기화블럭-생성자
// b. 기본값-명시적초기화-생성자-초기화블럭
// c. 기본값-초기화블럭-명시적초기화-생성자
// d. 기본값-초기화블럭-생성자-명시적초기화

//인스턴스 변수의 초기화는 기본값  - 명시적 초기화 - 초기화 블럭 - 생성자 순으로 초기화된다.

// [6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
// a. 자동 초기화되므로 별도의 초기화가 필요없다.  // 지역변수는 자동으로 초기화되지 않는다.
// b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다. //함께 소멸되기 때문에 클레스 내에서나, 메서드 내에서 같은 이름으로 변수선언이 가능하다.
// c. 매서드의 매개변수로 선언된 변수도 지역변수이다. // 매개변수도 지역변수이다. 콜 스텍에 로드되는 이유이다.
// d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.// 맞다.
// e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.//틀림

// [6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
// println
// method1
// method2
// main

// last in first out (LIFO)

// a. 제일 먼저 호출스택에 저장된 것은 main메서드이다. //(그래서 가장 밑에 있다.)
// b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.//(println이 가장 먼저 종료되고, 그 다음 순차적으로 종료된다.)
// c. method2메서드를 호출한 것은 main메서드이다.  //메인에서 최초에 호출한 것은 method2이다.
// d. println메서드가 종료되면 method1메서드가 수행을 재개한다. //that right
// e. main-method2-method1-println의 순서로 호출되었다. // 땡
// f. 현재 실행중인 메서드는 println 뿐이다.//that right

// class MemberCall {

//
// int iv = 10;
//
// static int cv = 20;
//
// int iv2 = cv;
//
// static int cv2 = iv; // 라인 A 인스턴스 변수는 객체화를 하지 않으면 사용할 수 없기 때문에
//						// null 오류가 뜬다.
//
// static void staticMethod1() {
// System.out.println(cv);
// System.out.println(iv); // 라인 B클레스 메소드 내에서는
//						//  인스턴스 변수를 쓸 수 없다.
// }
//
// void instanceMethod1() {
// System.out.println(cv);
// System.out.println(iv); // 라인 c 인스턴스 변수 내에서 인스턴스 변수를 부르기 때문에 오류가 안난다.
// }
//
// static void staticMethod2() {
// staticMethod1();
// instanceMethod1(); // 라인 D 클레스 메소드 내에서 인스턴스 메소드를 부를 수는 없다.
// }
//
// void instanceMethod2() {
// staticMethod1(); // 라인 E  인스턴스 메소드에서는 클레스 메소드를 부를 수 있다.
// instanceMethod1();
// }

// }

// [6-19] 다음 코드의 실행 결과를 예측하여 적으시오.
// [연습문제]/ch6/Exercise6_19.java
//class Exercise6 {
//	public static void change(String str) {//클레스
//		str += "456";//지역변수
//	}
//	
//public static void main(String[] args) {//클레스 메인
//		String str = "ABC123"; // "ABC123"
//		System.out.println(str);// "ABC123"
//		change(str); //값을 반환받지 않는다.
//		System.out.println("After change:" + str); // "ABC123"
//	}
//}
//
//
// [6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
// [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
// 메서드명 : shuffle
// 기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
// 처리한 배열을 반환한다.
// 반환타입 : int[]
// 매개변수 : int[] arr - 정수값이 담긴 배열
// [연습문제]/ch6/Exercise6_20.java
//class Exercise6 {
//
//	static int[] shuffle(int [] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			int ran = (int)(Math.random()*9);
//			int tmp = arr[ran];//9
//			arr[ran] = arr [i];//?
//			arr[i] = tmp;//9
//		}		
//		return arr;
//
//	}
//
//	public static void main(String[] args) {
//		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		System.out.println(java.util.Arrays.toString(original));
//		int[] result = shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));
//	}
//}
// [6-21] Tv클래스를 주어진 로직대로 완성하시오. 완성한 후에 실행해서 주어진 실행결과
// 와 일치하는지 확인하라.
// [참고] 코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.
// [실행결과]
// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// [4, 6, 8, 3, 2, 9, 7, 1, 5]
// [연습문제]/ch6/Exercise6_21.java

//
//class MyTv {
//	boolean isPowerOn;
//	int channel;
//	int volume;
//	final int MAX_VOLUME = 100;
//	final int MIN_VOLUME = 0;
//	final int MAX_CHANNEL = 100;
//	final int MIN_CHANNEL = 1;
//
//	void turnOnOff() {
//		isPowerOn = !isPowerOn;
//		
//		// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
//	}
//
//	void volumeUp() {
//		if(volume < MAX_VOLUME){
//			volume++;
//		}
//		// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
//	}
//
//	void volumeDown() {
//		if(volume > MIN_VOLUME){
//			--volume;
//		}
//		// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
//	}
//
//	void channelUp() {
//		
//		
//		if( channel == MAX_CHANNEL){
//			channel = MIN_CHANNEL;
//		}
//		++channel;
//		
//		// (4) channel의 값을 1증가시킨다.
//		// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
//	}
//
//	void channelDown() {
//		
//	
//		if( channel == MIN_CHANNEL){
//			channel = MAX_CHANNEL;
//		}
//		channel--;
//		// (5) channel의 값을 1감소시킨다.
//		// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
//	}
//} // class MyTv
//
//class Exercise6 {
//	public static void main(String args[]) {
//		MyTv t = new MyTv();
//		t.channel = 100;
//		t.volume = 0;
//		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//		t.channelDown();//99
//		t.volumeDown();//0
//		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//		t.volume = 100;
//		t.channelUp();//100
//		t.volumeUp();
//		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//	}
//}
// [실행결과]
// CH:100, VOL:0
// CH:99, VOL:0
// CH:100, VOL:100

// [6-22] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
// 메서드명 : isNumber
// 기 능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
// 모두 숫자로만 이루어져 있으면 true를 반환하고,
// 그렇지 않으면 false를 반환한다.
// 만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
// 반환타입 : boolean
// 매개변수 : String str - 검사할 문자열
// [Hint] String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.
// [연습문제]/ch6/Exercise6_22.java
//class Exercise6 {
//	static boolean isNumber(String str){	
//		char a[] = str.toCharArray();
//		boolean Switch = true;
//		for (int i = 0; i < str.length(); i++) {
//			if('0'<=a[i] && a[i] <='9'){
//				continue;
//			}else{
//				Switch = false;
//				break;
//			}
//		}
//
//		return Switch;
//	}
//	public static void main(String[] args) {
//		String str = "123";
//		System.out.println(str + "는 숫자입니까? " + isNumber(str));
//		str = "1234o";
//		System.out.println(str + "는 숫자입니까? " + isNumber(str));
//	}
//}

// [6-23] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
// 메서드명 : max
// 기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
// 만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
// 반환타입 : int
// 매개변수 : int[] arr - 최대값을 구할 배열

	// [6-24] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	// 메서드명 : abs
	// 기 능 : 주어진 값의 절대값을 반환한다.
	// 반환타입 : int
	// 매개변수 : int value
//	// [연습문제]/ch6/Exercise6_24.java
//class Exercise6 {
////			//23번째 문제
//	static int max(int[]arr){
//		int result;
//		if(arr == null || arr.length == 0){
//			result = -9999999;
//			return result;
//		}
//		Arrays.sort(arr);	
//		result = arr[arr.length-1];
//		return result;
//	} // 24번째 문제
//		static int abs(int a){
//			int result = (int)Math.sqrt(a*a);
//			return result;
//		}
////	
////	
////		public static void main(String[] args) {
////			int value = 5;
////			System.out.println(value + "의 절대값:" + abs(value));
////			value = -10;
////			System.out.println(value + "의 절대값:" + abs(value));
////		}
////	}
//
//	public static void main(String[] args) {
//		int[] data = { 3, 2, 9, 4, 7 };
//		System.out.println(java.util.Arrays.toString(data));
//		System.out.println("최대값:" + max(data));
//		System.out.println("최대값:" + max(null));
//		System.out.println("최대값:" + max(new int[]{})); //0
//	}
//}
// [실행결과]
// [3, 2, 9, 4, 7]
// 최대값:9

// 최대값:-999999
// 최대값:-999999
// [실행결과]
// 5의 절대값:5
// -10의 절대값:10
//
//
// }
// }


package Y_Exam;

////1번 문제

//class SutdaDeck {
//	final int CARD_NUM = 20;//카드의 크기는 20장을 넘어설 수 없다.
//	SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 20개의 방.
//
//	SutdaDeck() {
//		for (int i = 0, k = 0; i < 2; i++) {
//			for (int j = 1; j <11; j++, k++) {
//				cards[k] = new SutdaCard(j,false);
//				if(k == 0 || k == 2 || k == 7 ){
//					cards[(10*i)+(j-1)].isKwang = true;
//				}
//			}
//		}
//
//	}
//}
//
//class SutdaCard {
//	int num; // 숫자
//	boolean isKwang; //광의 여부 (1,3,8)
//
//	SutdaCard() {
//		this(1, true); // 초기값 1, 광
//	}
//
//	SutdaCard(int num, boolean isKwang) { //카드 숫자와 광의 여부를 받는 부분
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//
//	// info()대신 Object클래스의 toString()을 오버라이딩했다.
//	public String toString() {
//		return num + (isKwang ? "K" : ""); // 주소값 대신에 숫자와 광의 여부가 출력된다.
//	}
//}
//
//class Exercise7 {
//	public static void main(String args[]) {
//		SutdaDeck deck = new SutdaDeck();//인스턴스화 SutdaDeck
//		for (int i = 0; i < deck.cards.length; i++)
//			System.out.print(deck.cards[i] + ",");//20장 뽑는 문
//	}
//}

//
//[7-2] 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하
//시오.
//[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//
//
//class SutdaDeck {
//	final int CARD_NUM = 20;
//	SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//	SutdaDeck() {
//		for (int i = 0, k = 0; i < 2; i++) {
//			for (int j = 1; j <11; j++, k++) {
//				cards[k] = new SutdaCard(j,false);
//				if(k == 0 || k == 2 || k == 7 ){
//					cards[(10*i)+(j-1)].isKwang = true;
//				}
//			}
//		}
//
//	}
//	//(1) 위에 정의된 세 개의 메서드를 작성하시오.
//	//1. 메서드명 : shuffle
//	//기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//	//반환타입 : 없음
//	//매개변수 : 없음
//	
//	void shuffle(){
//		for(int  i = 0; i < CARD_NUM ; i++){
//			int ran = (int)(Math.random()*CARD_NUM);
//			SutdaCard tmp = cards[ran];
//			cards[ran] = cards[i];
//			cards[i] = tmp;
//		}
//	}
//	
//	
//	//2. 메서드명 : pick
//	//기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//	//반환타입 : SutdaCard
//	//매개변수 : int index - 위치
//	
//	SutdaCard pick (int index){
//		return cards[index];
//	}
//	//3. 메서드명 : pick
//	//기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//	//반환타입 : SutdaCard
//	//매개변수 : 없음
//	SutdaCard pick (){
//		return cards[(int)(Math.random()*CARD_NUM)];
//	}
//	
//	 
//} 
//class SutdaCard {
//	int num;
//	boolean isKwang;
//
//	SutdaCard() {
//		this(1, true);
//	}
//
//	SutdaCard(int num, boolean isKwang) {
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//
//	public String toString() {
//		return num + (isKwang ? "K" : "");
//	}
//}
//
//class Exercise7 {
//	public static void main(String args[]) {
//		SutdaDeck deck = new SutdaDeck();
//		System.out.println(deck.pick(0));
//		System.out.println(deck.pick());
//		deck.shuffle();
//		for (int i = 0; i < deck.cards.length; i++)
//			System.out.print(deck.cards[i] + ",");
//		System.out.println();
//		System.out.println(deck.pick(0));
//	}
//}
//
//[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오
//		오버라이딩이란 상속받은 메서드를 '선언'과 '반환값 타입'은 같은데 구현부에서
//		계산식이나 사용되는 변수에 변화를 주고 싶을때 사용된다.
//      
//
//[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
//a. 조상의 메서드와 이름이 같아야 한다.
//b. 매개변수의 수와 타입이 모두 같아야 한다.
//c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
//d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.
//    c(조상클레스보다 넓은 범위가 자손 클레스이다.), d (자손 매서드는 조상 매서드의 예외와 같거나 적어야한다.)





//[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
//위해서는 코드를 어떻게 바꾸어야 하는가?
//[연습문제]/ch7/Exercise7_5.java
//class Product{
//	int price; // 제품의 가격
//	int bonusPoint; // 제품구매 시 제공하는 보너스점수
//	Product(int price) {
//		this.price = price;
//		bonusPoint =(int)(price/10.0);
//	}
//}
//class Tv extends Product {
//	Tv() {                  //부모의 생성자를 초기화해줄 수 없기 때문에 에러가 발쌩했다.
////		super(50);			//부모인 Product의 생성자는 매개변수 int price 하나를 포함한 생성자이기 때문에
//							// Tv()안에 super(int price);를 추가해주어야만 한다.
//	}
//	public String toString() {
//		return "Tv";
//	}
//}
//class Exercise7 {
//	public static void main(String[] args) {
//		Tv t = new Tv();
//	}
//}
//
//[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인
//가?
//	자손클레스는 조상클레스의 인스턴스 변수와 메서드를 포함하고 있기 때문에조상 클레스가 생성자를 통해서 초기화가 되지 않으면
//  인스턴스가 불가능하다.

//7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
//[연습문제]/ch7/Exercise7_7.java
//class Parent {
//	int x=100;
//	Parent() {
//	this(200);
//		}
//	Parent(int x) {
//		this.x = x;
//	}
//	int getX() {
//		return x;
//	}
//}
//class Child extends Parent {
//	int x = 3000;
//	Child() {
//		this(1000);
//	}
//	Child(int x) {
//		this.x = x;
//	}
//}
//class Exercise7 {
//	public static void main(String[] args) {
//		Child c = new Child();
//		System.out.println("x="+c.getX());
//	}
//}
//Child의 생성자 -> Parent의 생성자   //last in first out의 stack 구조 실행순서로 인해
//가장 최초에는 child의 생성자가 불리지만 child를 통해서 parent의 생성자가 호출되고, 가장 먼저 Parent가 초기화됩니다.
//Parent는 child로부터 아무런 값을 받지 않기 때문에 기본 생성자가 실행되고, this(200)을 통해서 Paran(int x)가 200이라는 인수값을 받게되고
// 그 값을 this.x = x;를 통해서 인스턴스 변수 x에 값이 저장됩니다.
// Parent 이후 child의 생성자가 1000의 값을 child(int x)로 인수값을 전달하게되고,  this.x=x;를 통해 인스턴스 변수 x에 1000의 값이 저장됩니다.
//따라서 System.out.println("x="+c.getX());를 통해 출력되는 값은 200입니다.


//
//[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
//것은?
//a. public-protected-(default)-private
//b. public-(default)-protected-private
//c. (default)-public-protected-private
//d. private-protected-(default)-public

//접근자의 범위 순서는 public[프로젝트] - protected[다른 패키지의 자손클레스 상속]- (default)[패키지] - private[클레스] 순이다.
//즉 정답은 a이다.



//[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
//옳지 않은 것은? (모두 고르시오)
//a. 지역변수 - 값을 변경할 수 없다.  변경불가.
//b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.   상속은 가능하나, 변경은 불가능하다. 
//c. 메서드 - 오버로딩을 할 수 없다.  옳다. - final이 붙으면 재정의가 불가능하다.
//d. 멤버변수 - 값을 변경할 수 없다.  변경불가.
//[




//[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
//옳지 않은 것은? (모두 고르시오)
//a. 지역변수 - 값을 변경할 수 없다.  변경불가.
//b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.   상속은 가능하나, 변경은 불가능하다. 
//c. 메서드 - 오버로딩을 할 수 없다.  옳다. - final이 붙으면 재정의가 불가능하다.
//d. 멤버변수 - 값을 변경할 수 없다.  변경불가.
//[
















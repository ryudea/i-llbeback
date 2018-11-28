package F_OOP2;

import java.util.Arrays;

public class DeckTest {
	public static void main(String[] args) {

		// Deck 객체를 만들어주세요.
		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));
		// 4,5,6,7번에서 만들어진 메서드를 호출해서 출력해주세요.

		System.out.println(d.pick(32)); // 4
		System.out.println(d.pick()); // 5
		d.shuffle();
		System.out.println(d.pick(32)); // 6
		d.shuffle(290);
		System.out.println(d.pick(32)); // 7

		// 그려...

	}

}

class Deck {
	// 1.카드 수량을 저장할 수 있는 변수 CADE_NUM 선언 및 초기화해주세요.
	// 단 초기화시 Card 클래스의 상수를 이용해주세요.

	static final int CADE_NUM = Cade.KIND_MAX * Cade.NUM_MAX;

	// 2.카드 52장을 저장할 수 있는 변수 c를 선언 및 생성해주세요.
	// 단 .CARD_NUM을 이용해주세요.

	Cade[] c = new Cade[CADE_NUM];

	// 3. 기본생성자를 만들어주세요.
	// c의 각 방을 카드로 채워주세요.

	Deck() {
		for (int i = 1, count = 0; i < Cade.KIND_MAX + 1; i++) {
			for (int j = 1; j < Cade.NUM_MAX + 1; j++,count++) {//0~12 -4번
				this.c[count] = new Cade(i, j);
			}
		}
	}

	// 4. 입력받은 방번호의 카드를 반환하는 매서드를 만드세요 pick

	Cade pick(int num) {
		Cade result = this.c[num];
		return result;
	}

	// 5.랜덤한 방의 카드 한장을 반환하는 매서드를 만들어주세요. pick
	Cade pick() {
		return this.c[(int) (Math.random() * CADE_NUM)];
	}

	// 6. 카드를 섞어주세요
	// 연습문제 5-5의 형태로 섞어주세요. shuffle
	void shuffle() {
		for (int i = 0; i < c.length; i++) {
			int ran = (int) (Math.random() * CADE_NUM);
			Cade c = this.c[ran];
			this.c[ran] = this.c[i];
			this.c[i] = c;
		}
	}

	// 7.카드를 섞어주세요. shuffle 랜덤방 두개를 뽑아서 두개를 교환하는 방식으로 사용자로부터 입력받은 수 만큼 반복해주세요.
	// 매개변수 1개.
	void shuffle(int num) {
		for (int i = 0; i < num; i++) {
			int ran = (int) (Math.random() * CADE_NUM);
			int ran2 = (int) (Math.random() * CADE_NUM);
			Cade c = this.c[ran];
			this.c[ran] = this.c[ran2];
			this.c[ran2] = c;
		}

	}

}

class Cade {

	static final int KIND_MAX = 4; // 카드 무늬수
	static final int NUM_MAX = 13; // 무늬별 카드수
	// 무늬
	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;

	int kind;
	int num;

	// 2.기본생성자 , 매개변수가 두개인 생성자를 이용해서 1,1로 만들어주세요
	Cade() {
		this(SPADE, 1);
	}

	// 1. 매개변수가 두개인 생성자를 만들어주세요.
	Cade(int kind, int num) {
		this.kind = kind;
		this.num = num;

	}

	// 출력
	@Override
	public String toString() {
		String kind = "";
		String num = "";

		// 문양 선택
		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMOND";
			break;
		case 3:
			kind = "HEART";
			break;
		case 4:
			kind = "CLOVER";
			break;
		}

		// 숫자 선택
		switch (this.num) {
		case 1:
			num = "A";
			break;
		case 11:
			num = "J";
			break;
		case 12:
			num = "Q";
			break;
		case 13:
			num = "K";
			break;
		default:
			num += this.num;
		}
		return kind + ", " + num;
	}

}
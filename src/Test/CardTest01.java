package Test;

public class CardTest01 {
	public static void main(String[] args) {
//		Card c = new Card();
//		System.out.println(c.toString());
//		Deck d = new Deck();
//
//		System.out.println(d.Deck(20));
//		System.out.println(d.Deck());
//		d.Shuffle();
//		System.out.println(d.Deck(20));
//		d.Shuffle(200);
//		System.out.println(d.Deck(20));
//
//		
//	}
//}
//
//class Deck {
//
//	static final int CARD_MAX = Card.KIND_MAX * Card.NUM_MAX;
//
//	Card[] c = new Card[CARD_MAX];
//
//	Deck() {
//		int count = 0;
//		for (int i = 1; i < Card.KIND_MAX + 1; i++) {
//			for (int j = 1; j < Card.NUM_MAX + 1; j++) {
//				c[count] = new Card(i, j);
//				count++;
//			}
//		}
//
//	}
//
//	Card Deck(int num) {
//		return c[num];
//	}
//
//	Card Deck() {
//		return c[(int) (Math.random() * CARD_MAX)];
//	}
//
//	void Shuffle() {
//		for (int i = 0; i < CARD_MAX; i++) {
//			int ran = (int) (Math.random() * CARD_MAX);
//			Card tmp = c[ran];
//			c[ran] = c[i];
//			c[i] = tmp;
//		}
//	}
//
//	void Shuffle(int num) {
//		for (int i = 0; i < num; i++) {
//			int ran = (int) (Math.random() * CARD_MAX);
//			int ran2 = (int) (Math.random() * CARD_MAX);
//			Card tmp = c[ran];
//			c[ran] = c[ran2];
//			c[ran2] = tmp;
//		}
//	}
//}
//
//class Card {
//
//	static final int KIND_MAX = 4;
//	static final int NUM_MAX = 13;
//	static final int SPADE = 1;
//	static final int DIAMOND = 2;
//	static final int HEART = 3;
//	static final int CLOVER = 4;
//	int kind;
//	int num;
//
//	Card(int kind, int num) {
//		this.kind = kind;
//		this.num = num;
//	}
//
//	Card() {
//		this(SPADE, 1);
//	}
//
//	public String toString() {
//		String kind = "";
//		String num = "";
//
//		switch (this.kind) {
//		case 1:
//			kind += "SPADE";
//			break;
//		case 2:
//			kind += "DIAMOND";
//			break;
//		case 3:
//			kind += "HEART";
//			break;
//		case 4:
//			kind += "CLOVER";
//			break;
//
//		}
//		switch (this.num) {
//		case 1:
//			num += "A";
//			break;
//		case 11:
//			num += "J";
//			break;
//		case 3:
//			num += "Q";
//			break;
//		case 4:
//			num += "K";
//			break;
//		default:
//			num += this.num;
//		}
//		return kind + ", " + num;
	}

}
package Test;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

public class Task_CardTest_6_5 {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 ("
				+ c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 크기는 ("
				+ c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");

		c1.width = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 ("
				+ c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 크기는 ("
				+ c2.width + ", " + c2.height + ")");

	}

}

class Card {
	static int width = 100;
	static int height = 250;
	String kind;
	int number;

}

// CardTest클레스를 메소드 에어리어에 로드합니다.
// 클레스 친구인 클레스 변수와 클레스 메소드를 함께 올리는데, main()만 있기 때문에
// main()만 같이 로드시킵니다. 그후 call stack에 main()이 쌓입니다.
// Sys.out을 통해서 "Card.width = " + Card.width)를 출력하라고 합니다.
// Card 클레스가 있는지 존재함을 확인하면 Card 클레스를 메소드 에어리어에 로드합니다.
// 클레스의 친구들인 클레스 변수와 클레스 메소드를 함께 올리는데 클레스 변수인 width와 height를
// 같이 로드시킵니다.
// call stack에 Card()라는 기본생성자가 쌓였다가 퇴근합니다.
// 위의 출력문에서 Card.width는 메인메소드에 로드된 값인 100이 출력됩니다.
// Sys.out을 통해서 "Card.height = " + Card.height)를 출력하라고 합니다.
// 위의 출력문에서 Card.heigth는 메인메소드에 로드된 값인 250이 출력됩니다.
// Card c1 = new Card(); 라는 인스턴스화가 진행됩니다.
// Card는 위에서 로드되었기 때문에 따로 진행하지는 않습니다. Card의 인스턴스 변수들과 인스턴스 메서드들이
// Heap에서 독립된 저장공간을 갖게 되고, 그 주소를 c1에게 대입연산자를 통해서 저장합니다.
// c1은 Call stack에서 main()의 영역에 저장됩니다.
// c1의 주소값이 가리키는 Heap 내부의 저장공간에 String kind, int number가 기본생성자에 의해서
// 초기화된후 저장됩니다.
// c1.kind = "Heart"; c1의 heap 저장공간에 위치한 kind에 "heart"라는 문자열이 저장됩니다.
// c1.number = 7;
// Card c2 = new Card(); c2라는 인스턴스화가 진행됩니다.
// Card는 위에서 로드되었기 때문에 따로 진행하지는 않습니다. Card의 인스턴스 변수들과 인스턴스 메서드들이
// Heap에서 독립된 저장공간을 갖게 되고, 그 주소를 c1에게 대입연산자를 통해서 저장합니다.
// c2은 Call stack에서 main()의 영역에 저장됩니다.
// c2의 주소값이 가리키는 Heap 내부의 저장공간에 String kind, int number가 기본생성자에 의해서
// 초기화된후 저장됩니다.
// c2.Kind = "Spade"; c2의 주소에 저장된 인스턴스변수 kind에 "Spade"가 저장됩니다.
// c2.number = 4; c2의 주소에 저장된 인스턴스 변수 number에 4라는 정수가 저장됩니다.
// Sys.out을 통해서 "c1은" + c1.kind + ", " + c1.number + "이며, 크기는 ("
// + c1.width + ", "+ c1.height + ") " 가 출력됩니다.
// c1이라는 참조변수에 저장된 값 kind와 number은 각각 변경된 Heart와 7로 출력이 되고, 클레스 변수인
// width 와 height도 값변경이 없었기 때문에 그대로 100, 250으로 출력됩니다.
// Sys.out을 통해서 "c2은" + c2.kind + ", " + c2.number + "이며, 크기는 ("
// + c2.width + ", "+ c2.height + ") " 가 출력됩니다.
// c1이라는 참조변수에 저장된 값 kind와 number은 각각 변경된 Spade와 4로 출력이 되고, 클레스 변수인
// width 와 height도 값변경이 없었기 때문에 그대로 100, 250으로 출력됩니다.

// SYs.out으로 c1의 width와 height를 각각 50, 80으로 변경합니다."라고 출력합니다.
// c1.width = 50; c1이라는 참조변수를 통해 width라는 클레스 변수의 값을 50으로 변경합니다.
// c1.height = 80; c1이라는 참조변수를 토앻서 height라는 클레스 변수의 값을 80으로 변경합니다.
// 클레스 변수는 하나의 '값'만을 가지기 때문에 c1을 통해서든 c2를 통해서든 변경을 가하면 c1에서 불러도 c2에서 불러도
// 변경된 값으로 불러들여진다. 따라서-
// Sys.out을 통해서 "c1은" + c1.kind + ", " + c1.number + "이며, 크기는 ("
// + c1.width + ", "+ c1.height + ") " 가 출력됩니다.
// c1이라는 참조변수에 저장된 값 kind와 number은 각각 변경된 Heart와 7로 출력이 되고, 클레스 변수인
// width 와 height는 값변경을 했기 때문에 50, 80으로 출력됩니다.
// Sys.out을 통해서 "c2은" + c2.kind + ", " + c2.number + "이며, 크기는 ("
// + c2.width + ", "+ c2.height + ") " 가 출력됩니다.
// c1이라는 참조변수에 저장된 값 kind와 number은 각각 변경된 Spade와 4로 출력이 되고, 클레스 변수인
// width 와 height도 값변경을 했기 때문에 50, 80으로 출력됩니다.


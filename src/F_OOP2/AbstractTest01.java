package F_OOP2;

public class AbstractTest01 {
	public static void main(String[] args) {

	}

}

abstract class Unit { // abstract class 조건인 abstract 매서드를 가지고 있기 때문에 추상 클레스로 변환
						// 가능

	int x;
	int y;

	abstract void move(int x, int y);

	void stop() {

	}
}

class Marine extends Unit {

	void stimpack() {

	}

	@Override
	void move(int x, int y) {

	}

}

class Tank extends Unit {

	void changeMode() {

	}

	@Override
	void move(int x, int y) {
		
	}

}

class Dropship extends Unit {

	void load() {

	}

	void unload() {

	}

	@Override
	void move(int x, int y) {

	}

}

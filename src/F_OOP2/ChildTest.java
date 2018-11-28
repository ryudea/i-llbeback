package F_OOP2;

public class ChildTest {
	public static void main(String[] args) {

		Child c = new Child();
		Parent c1 = new Parent();
		System.out.println(c1.volume);
		c.channel = 10;
		c.channelUp();
		System.out.println(c.channel);
		c.volume = 5;
		c.volumeUp();
		System.out.println(c.volume);
		System.out.println(c1.volume);
		System.out.println(c.getParantVolume());

	}

}

class Parent {
	int volume;

	void volumeUp() {
		volume++;
	}
}

class Child extends Parent {

	int channel;
	int volume;

	void channelUp() {
		channel++;
	}

	int getParantVolume() {
		return super.volume;
	}

}
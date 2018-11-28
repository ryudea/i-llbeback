package Test;

public class Task_TvTest_6_3_4 {
	public static void main(String[] args) {

		// 6-3 문제
		// Tv t1 = new Tv();
		// Tv t2 = new Tv();
		//
		// System.out.println("t1의 체널값은"+t1.channel + "입니다.");
		// System.out.println("t2의 체널값은"+t2.channel + "입니다.");
		// t2=t1;
		// t1.channel = 7;
		// System.out.println("t1의 channel값을 7로 변경하였습니다.");
		// System.out.println("t1의 체널값은"+t1.channel + "입니다.");
		// System.out.println("t2의 체널값은"+t2.channel + "입니다.");

		// 6-4 문제
		// Tv[]tvArr = new Tv[3];
		//
		// for (int i = 0; i < tvArr.length; i++) {
		// tvArr[i] = new Tv();
		// tvArr[i].channel = i+10;
		// }
		// for (int i = 0; i < tvArr.length; i++) {
		// tvArr[i].channelUp();
		// System.out.printf("tvArr[%d].channel = %d%n",i,tvArr[i].channel);
		// }

	}

}

class Tv {

	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

// 6-3번 문제.

// class Task_TvTest_6_3_4를 메서드 에어리어에 로드한다.
// class 친구들인 class 변수와 class메서드를 함께 저장함으로 main()와 함께 로드된다.
// main()가 콜스텍에 쌓인다.
// Tv t1= new Tv(); 라는 인스턴스화를 진행하기 위해서 Tv클레스를 찾아 로드한다.
// Tv에 속한 클레스 변수, 클레스 메서드가 없어서 저장되는 값이 없다.
// t1이라는 참조변수가 main()의 지역변수로써 콜 스텍에 저장된다.
// heap 메모리에서 Tv클레스 속한 인스턴스 변수와 메서드가 저장된 공간이 생성되고, 그 주소값을 t1에 저장한다.
// Tv의 인스턴스 변수는 String color, boolean power, int channel입니다.
// Tv의 인스턴스 메서드는 void power() { poewer = !power;} , void
// channelUp(){++channel;}, void channelDown(){ --channel;} 입니다.
// Tv t2= new Tv(); 라는 인스턴스화를 진행하기 앞서 Tv클레스가 로드되어 있기 때문에 따로 하지는 않는다.
// t2이라는 참조변수가 main()의 지역변수로써 콜 스텍에 저장된다.
// heap 메모리에서 Tv클레스 속한 인스턴스 변수와 메서드가 저장된 공간이 생성되고, 그 주소값을 t2에 저장한다.
// Tv의 인스턴스 변수는 String color, boolean power, int channel입니다.
// Tv의 인스턴스 메서드는 void power() { poewer = !power;} , void
// channelUp(){++channel;}, void channelDown(){ --channel;} 입니다.
// System.out을 통해서 "t1의 channel 값은 " + t1.channel+" 입니다."를 출력합니다.
// System.out을 통해서 "t2의 channel 값은 " + t2.channel+" 입니다."를 출력합니다.
// t2 = t1; -> t1의 주소를 t2에 저장합니다. 이때 t2라는 주소가 가르키던 저장공간은 더 이상 사용할 수 없게 된다.
// t1의 주소값을 가지는 저장공간 내의 channel 값이 7로 저장됩니다.
// System.out을 통해서 "t1의 channel 값을 7로 변경하였습니다"를 출력합니다.
// System.out을 통해서 "t1의 channel 값은 " + t1.channel+" 입니다."를 출력합니다.
// System.out을 통해서 "t2의 channel 값은 " + t2.channel+" 입니다."를 출력합니다.
// 이때 t2의 channel값은 t1의 channel값을 가져가기 때문에 둘의 값은 같습니다. 왜냐하면 t2의 주소와 t1의 주소가 같아서
// 같은 저장공간내의 값을 가져오기 때문입니다.

// 6-4번 문제.
// class Task_TvTest_6_3_4를 메서드 에어리어에 로드한다.
// class 친구들인 class 변수와 class메서드를 함께 저장함으로 main()와 함께 로드된다.
// main()가 콜스텍에 쌓인다.
// 인스턴스화를 진행하기 위해서 Tv클레스를 찾아 로드한다.
// Tv [] tvArr= new Tv[3]; tvArr라는 방이 세개 존재하는 Tv 클레스의 배열값을 저장하는 참조변수를 인스턴스화합니다.
// Tv에 속한 클레스 변수, 클레스 메서드가 없어서 저장되는 값이 없다.
// tvArr이라는 참조변수가 main()의 지역변수로써 콜 스텍에 저장된다.
// heap 메모리에서 Tv클레스 속한 인스턴스 변수와 메서드가 저장된 공간이 생성되고, 그 주소값을 TvArr의 각방에 저장한다.
// Tv의 인스턴스 변수는 String color, boolean power, int channel입니다.
// Tv의 인스턴스 메서드는 void power() { poewer = !power;} , void
// channelUp(){++channel;}, void channelDown(){ --channel;} 입니다.
// for문을 통해서 0~2까지(tvArr.length = 3)반복해서 각방에 Tv를 객체화한 주소를 저장합니다.
// 추가로 tvArr[i].channel = i+10이라는 계산식도 반복합니다.
// [0] = 10, [1] = 11, [2] = 12
// 위의 for문이 끝나고 또다른 for문이 0~2까지 반복합니다.
// for문 내에서 channelUp()이라는메소드가 실행되어져 콜스텍에 쌓입니다.
// channelUp의 실행문이 channel이 +1식 증가합니다.
// [0] = 11 , [1] = 12, [2] = 13
// System.out.printf을 이용해서 "tvArr[%d].channel=%d%n",i,tvArr[i].channel 이 실행됩니다.
// 그 결과 각각 tvArr[0].channel = 11,tvArr[1].channel = 12,tvArr[2].channel = 13이
// 출력됩니다.


package E_OOP;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {

		// MyMath.add(); // 클레스 매서드
		//
		// MyMath m1 = new MyMath(); // 인스턴스화
		// m1.add2(10);// a값을 10을 준것. <<인자값>>이라고 표현한다. 주는 값.
		//
		// MyMath.add3(30, 0.003f); // 두번째 인자값이 float 타입이기 때문에 0.00nf라고 넣는다.
		// float
		// // 타입 정수는 긔긔.
		// m1.add4(5, 3, '0');// int 5 , int 3 , char '0' = 48 , 5 + 3 +48 = 56
		//
		// int sum = MyMath.add5(7);
		// System.out.println(sum);
		//
		// int mn = m1.add6(5, 8); // 계산기를 예를들어서 '-'연산을 할때 여러개의 - 연산을 하는 경우
		// 인스턴스가
		// // 적합하다.
		// System.out.println(mn);
		//
		// int ma = m1.add7(5, 8);
		// System.out.println(ma);
		//
		// // 1. 그려오시오.
		// // 2. 전체 삭제 or 주석처리 후, 사용되어야할 매서드 계산기를 만듭시다. x넣으면 break;

		float sum = 0f;
		boolean power = false;
		MyMath rst = new MyMath();

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		float num = sc.nextFloat();

		do {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("연산자를 입력해주세요.");
			String op = sc2.next();

			Scanner sc3 = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요.");
			float num2 = sc3.nextFloat();

			if (op.equals("C") || op.equals("c")) {// 종료 키워드
				break;
			}

			if (power = false) {
				if (op.equals("+")) { // 최초의 연산계산 , num 값을 스케너로 받을때.
					float sum2 = rst.add6(num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
					power = true;
				}
				if (op.equals("-")) {
					float sum2 = rst.add7(num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
					power = true;
				}
				if (op.equals("*")) {
					float sum2 = rst.multiply(num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
					power = true;
				}
				if (op.equals("/")) {
					if (num2 == 0) {
						System.out.println("0을 왜 나누냐 이눔시키야!!!");
						break;
					}
					float sum2 = rst.divide(num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
					power = true;
				}
				num = sum;

			} else if (sum == (int) sum) { // 합계가 정수일때
				if (op.equals("+")) {
					float sum2 = rst.add6((int) num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
				}
				if (op.equals("-")) {
					float sum2 = rst.add7((int) num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
				}
				if (op.equals("*")) {
					float sum2 = rst.multiply((int) num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
				}
				if (op.equals("/")) {
					if (num2 == 0) {
						System.out.println("0을 왜 나누냐 이눔시키야!!!");
						break;
					}
					float sum2 = rst.divide((int) num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
				}
				num = sum;
			} else { // 합계가 소수일때
				if (op.equals("+")) {
					float sum2 = rst.add6(num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
				}
				if (op.equals("-")) {
					float sum2 = rst.add7(num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
				}
				if (op.equals("*")) {
					float sum2 = rst.multiply(num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
				}
				if (op.equals("/")) {
					if (num2 == 0) {
						System.out.println("0을 왜 나누냐 이눔시키야!!!");
						break;
					}
					float sum2 = rst.divide(num, num2);
					if (sum2 == (int) sum2) {
						System.out.println((int) sum2);
					} else {
						System.out.println(sum2);
					}
					sum = sum2;
				}
				num = sum;
			}
		} while (true);
	}

}

class MyMath {
	static int number = 50;
	static void add() {
		System.out.println(number * 2);

	}
	void add2(int a) { // int a에서 a가 매개변수이다. 인자값을 불러들이는 매개체가 되는 변수.
		System.out.println(number * a);
	}
	static void add3(int i, float j) {
		System.out.println(i * j);
	}
	void add4(int i, int j, char k) {
		System.out.println(i + j + k);
	}
	// 매서드 명은 add5 매개변수 int 1개, 매개변수와 전역변수 number의 합을 반환
	static int add5(int i) { // 반환 메소드는 같은 타입이어야한다.
		return i += number;
	}
	float add6(float i, float j) {
		float sum = (float)i + j;
		return sum;
	}
	// 매서드 명 add 7
	// 앞에 받은 값을 뒤에 받은 값을 뺀 결과를 반환하는 매서드
	float add7(float i, float j) { // 클레스 변수를 사용하지 않는 연산식이기 때문에 인스턴스로 메서드를 만든다.
		float min = i - j;
		return min;
	}
	// 인스턴스 매서드 multiply
	// int 값 두개, 매개변수
	// 두개의 수를 곱해서 반환해주세요
	// 단. overflow고려해주세요.
	float multiply(float i, float j) {
		float sum = i * j;
		return sum;
	}
	float divide(float i, float j) {
		float div = ((int) ((i / j) * 100 + 0.5f)) / 100f;
		return div;
	}
}
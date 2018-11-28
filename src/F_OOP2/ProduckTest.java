package F_OOP2;

import java.util.Scanner;
import java.util.Vector;

import org.omg.CosNaming.NamingContextPackage.NotEmpty;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.org.glassfish.external.statistics.BoundaryStatistic;

public class ProduckTest {
	public static void main(String[] args) {

		// Person p = new Buyer("대웅",1000);
		// Person p1 = new Buyer("상엽",2000);
		// Person p2 = new Buyer("은우",1500);
		ProductAD pad = new ProductAD();
		pad.productED();

		Person per = new Person();

		per.membership();
		int m = per.memberSearching();
		Buyer by = (Buyer) per.person.get(m); // 구매고객.

		by.buy();

		System.out.println(by.name + "님께서 구매하신 물품의 목록은 이와 같습니다.");
		for (int i = 0; i < by.item.size(); i++) {
			System.out.println(by.item.get(i));
		}

		by.refund(by);
		by.summary(by);

		// 4. 물품을 관리할 수 있는 class를 만드세요.
		// 재고, 물품 추가, 물품 제거.//vector

	}

}

class Person {

	String name;
	int bonusPoint;
	int price_money;
	static Vector person = new Vector();
	static String[] stl;

	static void membership() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n회원님의 이름을 저장해주세요.");
			String str = sc.next();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("\n보유자금을 입력해주세요.");
			int money = sc2.nextInt();

			// 입력받은 값으로 회원등록
			person.add(new Buyer(str, money));

			Scanner sc3 = new Scanner(System.in);
			System.out.println("\n회원등록을 더 진행하시겠습니까? Y/N");
			String str2 = sc.next();
			if (str2.equals("Y")) {
				continue;
			}
			// 회원 리스트 출력
			if (str2.equals("N")) {
				stl = new String[person.size()];
				for (int i = 0; i < person.size(); i++) {
					Person ps = (Person) person.get(i);
					stl[i] = ps.name;
					System.out.println(ps.name + "님의 회원번호는 " + i + "입니다!");

				}
				return;
			}
		}
	}

	static int memberSearching() {
		while (true) {
			Scanner sc4 = new Scanner(System.in);
			System.out.println("\n회원님의 이름을 알려주세요.");
			String str = sc4.next();
			for (int i = 0; i < stl.length; i++) {
				Person ps = (Person) person.get(i);
				if (stl[i] == ps.name) {
					return i;
				} else {
					System.out.println("다시입력해주세요");
					continue;
				}

			}

		}
	}

}

class Buyer extends Person {

	Vector item = new Vector();
	int pirce_money;
	int money;
	int return_mony;
	String[] bstl;

	Buyer(String name, int money) {
		this.money = money;
		super.name = name;
	}

	void buy() {

		while (true) {

			System.out.println("어떤 상품을 구매하실겁니까?");
			int pronum = Person.memberSearching();
			Scanner sc = new Scanner(System.in);
			System.out.println("구매 수량을 적어주세요!");
			int stock = sc.nextInt();

			Product p = (Product) ProductAD.product.get(pronum);
			if (p.stock > stock) {
				if (money < p.price) {
					System.out.println(p.name + "살돈이 없으시네요 " + name + "님");
					return;
				}
				price_money += p.price;
				money -= p.price;
				bonusPoint += p.price / 10;
				System.out.println(p + "만원에 구매하셨습니다!");// 부모의 것이 아닌 자식의
														// toString()를 그대로
														// 사용한다.
				System.out.println(name + "님의 잔여금은" + money + "만원이고 보너스 포인트는 "
						+ bonusPoint + "입니다.");
				item.add(p);

				Scanner sc2 = new Scanner(System.in);
				System.out.println("\n상품을 더 사시겠습니까? Y/N");
				String str2 = sc2.next();
				if (str2.equals("Y")) {
					continue;
				}
				// 상품 리스트 출력
				if (str2.equals("N")) {
					bstl = new String[item.size()];
					for (int i = 0; i < item.size(); i++) {
						Product ps = (Product) item.get(i);
						bstl[i] = ps.name;
						System.out.println(ps.name + "상품의 품목번호는 " + i + "입니다!");
					}
					return;
				}

			} else {
				System.out.println("재고 물품이 부족합니다. 죄송합니다 손님!");
				continue;
			}
		}

	}

	// 1. 반품 refund()
	// 구매 물품이 없으면 "구매하신 물품이 없습니다."
	// 구매 물품은 있으나 우리 매장에서 산게 아니면?

	void refund(Buyer b) { // vector.contains() => 안에 그 값이 존재하는지를 묻는 것.

		System.out.println("어떤 상품을 반품하실겁니까?");
		int pronum = Person.memberSearching(); // 상품번호

		Product p = (Product) ProductAD.product.get(pronum); // 상품 변수

		if (b.item.remove(p)) {
			System.out.println(b.name + "님 " + p
					+ "만원의 제품이 본사에서 구매하신 게 확인되었습니다.");
			System.out.println("현재 고객님의 잔금은" + money + "만원이고 보너스 포인트는"
					+ bonusPoint + "입니다.");
			money += p.price;
			return_mony += p.price;
			bonusPoint -= p.price / 10;
			System.out.println("반품을 통해서 현재 고객님의 잔금은" + money + "만원이고 보너스 포인트는"
					+ bonusPoint + "입니다.");
			return;
		} else {
			System.out.println("여기서 구매한게 없는데요?");
			return;
		}
	}

	// 2. 영수증 출력summary()
	/*
	 * 영 수 증
	 * 
	 * 구매물품 LGTV 700만원 Mac 400만원 LG전자렌지 200만원
	 * 
	 * 총 구매 금액 1300만원 고객님의 잔금 8700만원 고객님의 포인트는 130만점
	 * 
	 * 또 오십시요 호갱님~
	 */

	void summary(Buyer b) {
		System.out.println();
		System.out.println("  " + b.name + "님의 영  수  증	");
		System.out.println();
		for (int i = 0; i < b.item.size(); i++) {
			if (i == 0) {
				System.out.println("구매물품 \t" + b.item.get(i) + "만원");
			} else {
				System.out.println("\t\t" + b.item.get(i) + "만원");
			}
		}
		System.out.println();
		System.out.println("총 구매 금액             " + b.price_money + "만원");
		System.out.println("총 반환 금액             " + b.return_mony + "만원");
		System.out.println("고객님의 잔금            " + b.money + "만원");
		System.out.println("고객님의 포인트는         " + b.bonusPoint + "입니다");
		b.price_money = 0;
		return_mony = 0;
	}

	@Override
	public String toString() {
		return name;
	}
}

class ProductAD {

	String name;
	int price;
	int stock;

	static Vector product = new Vector();
	static String[] pstl;

	static void productED() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n상품의 이름을 저장해주세요.");
			String str = sc.next();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("\n상품의 가격을 입력해주세요.");
			int price = sc2.nextInt();

			Scanner sc3 = new Scanner(System.in);
			System.out.println("\n상품의 재고를 입력해주세요.");
			int stock = sc3.nextInt();

			// 입력받은 값으로 상품등록
			product.add(new Product(str, price, stock));

			Scanner sc4 = new Scanner(System.in);
			System.out.println("\n상품 등록을 더 진행하시겠습니까? Y/N");
			String str2 = sc.next();
			if (str2.equals("Y")) {
				continue;
			}
			// 상품 리스트 출력
			if (str2.equals("N")) {
				pstl = new String[product.size()];
				for (int i = 0; i < product.size(); i++) {
					Product ps = (Product) product.get(i);
					pstl[i] = ps.name;
					System.out.println(ps.name + "상품의 품목번호는 " + i + "입니다!");
				}
				return;
			}
		}
	}

	static int productEDSearching() {
		while (true) {
			for (int i = 0; i < product.size(); i++) {
				Product pp = (Product) product.get(i);
				System.out.println(pp.name);
			}
			Scanner sc4 = new Scanner(System.in);
			System.out.println("\n상품의 이름을 알려주세요.");
			String str = sc4.next();
			for (int i = 0; i < pstl.length; i++) {
				Product ps = (Product) product.get(i);
				if (pstl[i] == ps.name) {
					return i;
				} else {
					System.out.println("다시입력해주세요");
				}
			}
		}
	}

}

class Product extends ProductAD {

	Product(String name, int price, int stock) {
		super.name = name;
		super.price = price;
		super.stock = stock;
	}

	@Override
	// alt + shift + s + s + enter
	public String toString() {
		return name + "   " + price;
	}
}

package F_OOP2;

public class InterfaceTest {
	public static void main(String[] args) {
		Fight f = new Fight();
		//인터페이스의 다형성!!!
		if(f instanceof Unit2){
			System.out.println("f는 Unit2의 인스턴스이다.");
			Unit2 u2 = f;	
		}		
		if(f instanceof Fightable){
			System.out.println("Fightable 인터페이스를 구현했다.");
			Fightable f2 = f;			
		}
		if(f instanceof Movable){
			System.out.println("f는 Movalbe인터페이스를 구현했다.");
			Movable m2 = f;
			
		}
		
		
		
	}

}

class Unit2 {
	int x;
	int y;
	int currentHp;// current : 현재의
}

interface Movable {

	abstract void move(int x, int y);

}

interface Attackable {

	void attack(Unit2 u);

}

interface Fightable extends Movable , Attackable{	//인터페이스 간에는 다중상속이 가능하다.
	
}
class Fight extends Unit2 implements Fightable{ //Unit2라는 클레스를 상속받고, implements로 Fightalbe의 구현체가 된다. 간접적으로 Movable의 구현체도 된다.)

	@Override
	public void move(int x, int y) {
		
		
	}

	@Override
	public void attack(Unit2 u) {
	
		
		
	}
		
	
	
	
}




package E_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
		
		//throwDice 매서드를 호출하여라.
		DoubleDice dd = new DoubleDice();
		int result = dd.throwDice();
		System.out.println("총 "+result+"만큼 가시오.");	//재귀호출로 만들어라.
		
		
		
		
	}
}


class DoubleDice{
	//인스턴스매서드 throwDice
	int throwDice(){
		
		int ran = (int)(Math.random()*6 + 1);
		int ran2= (int)(Math.random()*6 + 1);
		System.out.println("첫번째 주사위는" + ran +" 두번째 주사위는" + ran2);
		int sum = ran + ran2;
		if(ran == ran2){
			System.out.println("더블! 다시 던지시오");
			sum += throwDice();
		}		
	return sum;
	}
}
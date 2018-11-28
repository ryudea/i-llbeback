package F_OOP2;

public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo();
		String str = og.upMethod();
		
		
	
		
	}
	
}

class OverUp{
	int x = 3;
	int y = 3;
	
	String upMethod(){
		return "하이"+x+y;
	}
}

class OverGo extends OverUp{
	int z = 5;
	
	@Override
	String upMethod(){		
		return x+y+z+"오버라이드";
	}	
	
	String upMethod(int k){
		return super.upMethod(); // super = 자식과 부모에 있는 변수와 매서드를 구분하기 위해서 쓰임.
									//      자식 클레스 내에서 부모의 것을 가리키기 위해서 쓰이는게 super다.
	}
}
//같은 이름의 매서드를 여러개 쓰기 위해서 하는 것이 오버 로딩


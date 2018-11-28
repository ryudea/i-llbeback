package Test;

class Data { int x; }

public class Task_ReferenceReturnEx_6_14 {
	public static void main(String[] args) {
		Data  d =  new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+ d2.x );		
	}
	static Data copy(Data d){
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
}

//최초에 로드되는 클레스는 파일명과 같은 클레스이다. 따라서 윗줄에 위치한 Data 클레스보다 Task_ReferenceReturnEx_6_14
//가 먼저 method area에 로드되고, 클레스 변수는 없으며 클레스 메소드인 main()과 copy(Data)가 로드된다.
//main()가 콜스텍에 쌓인다.
//Data d = new Data(); 라는 인스턴스화를 하기 위해 Data 클레스를 찾아본다.
//Data 클레스를 method area에 로드하면서 클레스 친구들을 같이 저장시키지만, 클레스 친구들이 없기 때문에 Data만 올라간다.
//heap 메모리에 Data의 인스턴스 변수와 인스턴스 메소드가 저장될 장소가 마련되고, 그 주소값이 참조변수 d에 저장된다.
//d는 참조변수이자 main()의 지역변수이기 때문에 call stack에 있는 main() 영역 내에 d값이 저장된다.
//d의 주소를 통해서 heap 메모리에 저장된 인스턴스 변수 x에 정수 10이 저장된다.
//Data d2 = new Data(); 라는 인스턴스화를 실행한다.
//이미 Data 클레스가 method area에 로드되어 있기 때문에 바로 인스턴스화를 진행한다.
//heap 메모리에 Data의 인스턴스 변수와 인스턴스 메소드가 저장될 장소가 마련되고, 그 주소값이 참조변수 d2에 저장된다.
//d는 참조변수이자 main()의 지역변수이기 때문에 call stack에 있는 main() 영역 내에 d2값이 저장된다.
//Data d2 = copy(Data d)를 통해서 클레스 메서드인 copy가 실행되고,
// copy 메소드가 실행되면서 d2의 주소값이 새로운 주소값을 갖게 되고, 그 주소값에 저장된 인스턴스 변수 x의 값은
// 참조변수 d에 저장된 x값을 대입하여 만들어진다.
// 즉 d2는 d와 전혀 다른 주소값을 가지면서 인스턴스 변수 x의 값은 동일한 상태가 된다.
// Sys.out을 통해 출력되어진 d와 d2의 x값은 동일한 10이다.

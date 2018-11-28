package F_OOP2;

public class PointTest {
	public static void main(String[] args) {
		
		
		Point3D p3d = new Point3D(10,20,30);		
		
	}
}

class Point2{
	
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;		
	}
//	Point2(){
//		
//	}
}

class Point3D extends Point2{
	int z;
	Point3D(int x, int y, int z){
		super(x,y); // 생성자를 이용해서 초기화를 해야 합니다!!
		super.x = 100; // this로 대체가 가능하다. 만약 자신(자식) class에 같은 인스턴스변수가 존재한다면
					   //그때는 구분을 위해서 super(부모),this(자식)를 구분해서 쓴다.
		
		super.y = 200;
		this.z = z; 
	}
}

package F_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import org.w3c.dom.css.Counter;

public class DrawShape extends Frame {
	public static void main(String[] args) {

		DrawShape ds = new DrawShape();

	}
	
	@Override
	public void paint(Graphics g) {
		// 1. 원 객체를 만드세요.(매개변수 두개짜리 생성자를 이용해주세요.)
		// 150,150 50
		Point xx = new Point(150,150);
		Circle c = new Circle(xx, 50);

		// 2. 원을 그려주세요.
		// g.drawOval(int,int,int,int) <-타원을 그리는 매서드. 넓이와 높이가 같으면 원이다. 즉
		// 150,150,100,100
		g.drawOval(c.center.x, c.center.y, c.r * 2, c.r * 2);

		// 3. 삼각형 객체를 만드세요.
		// 매개변수 하난짜리 생성자를 이용해주세요.
		// 100, 100 200, 200 200, 100
		//차근히 생각해도 될 일이었는데..
		//
		Point[] tt = new Point[3];
		tt[0] = new Point(100,100);
		tt[1] = new Point(100,200);
		tt[2] = new Point(200,200);
		Triangle t = new Triangle(tt); 
		
	
		

		// 4. 삼각형을 그려주세요
		// g.drawLine(int,int,int,int) x - x1 , y - y1 하나의 선을 만들기 때문에 세개가 필요하다.

		g.drawLine(t.p[0].x, t.p[0].y, t.p[1].x, t.p[1].y);
		g.drawLine(t.p[1].x, t.p[1].y, t.p[2].x, t.p[2].y);
		g.drawLine(t.p[2].x, t.p[2].y, t.p[0].x, t.p[0].y);

	}

	DrawShape() {
		// gat:가져온다 set:얻어온다.
		setTitle("즐거운 DrawShape");
		setSize(500, 700);
		setVisible(true);
		setBackground(Color.GRAY);
		setResizable(false);
	}

	DrawShape(int a, int b, String c) {
		this();
		setTitle(c);
		setSize(a, b);
	}
}

class Point {  // 포함
	// 빛 류 킹갓엠페러충무공제너럴 대웅 코드마스터 우리형 날두
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point() {

	}
}



class Triangle {
	Point[] p;

	Triangle(Point[] p) {
		this.p = p;
	}

	Triangle(Point a, Point b, Point c) {
		this.p = new Point[] { a, b, c };
	}

}

class Circle { //Circle은 Point를 포함하고 있다라고 한다.
	// 1. 점 하나를 저장할 수 있는 변수 center를 선언하세요.
	Point center;

	// 2. 반지름(정수)를 저장할 수 있는 변수 r을 선언하세요.
	int r;

	// 3. 매개변수가 두개인 생성자를 만드세요.
	// 단 매개변수 두개로 center와 r을 초기화해주세요.
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	// 4. 기본 생성자를 만들어주세요
	// 단 매개변수가 두개인 생성자를 이용하여 점 (50,50)으로 반지름은 100으로 만들어주세요
	Circle() {
		this(new Point(50, 50), 100);
	}
}

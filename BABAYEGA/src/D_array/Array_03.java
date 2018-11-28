package D_array;

public class Array_03 {
	public static void main(String[] args) {
		/*
		 * 1.다차원 배열
		 * -자바에서는 1차원 배열뿐만아니라 2차원 이상의 다차원 배열도 허용한다.
		   -2차원 배열의 선언
		   	선언방법
		  변수타입[][] 변수명; <주로 이걸 쓴다.
		  변수타입 []변수명 [];
		  변수타입 변수명 [][];
		  
		      생성방법
		 int[][]a = new int[][]; 
		 */
//		
//		int [][] a = new int[3][];
//		int [][] b = new int[3][];//null,null,null
//		b[0] = new int[2];
//		b[1] = new int[3];
//		b[2] = new int[4];
		
//		int [][] c = new int [][]{
//									{1,2},
//									{3,4,5},
//									{6,7,8,9},
//								  };
//		for(int i = 0; i < c.length; i++){
//			for(int j = 0; j < c[i].length; j++){
//				System.out.print(c[i][j]+" ");
//			}
//		}
		/*
		 1. 변수 a의 각 방에 10,20,30,40, ... , 90까지 입력해주세요,
		*/
		int [][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		
//		a[0] = new int[]{10,20};
//		for(int i = 0; i<a[0].length; i++){
//			a[0][i] = 10+(10 * i);
//			System.out.println(a[0][i]);
//		}
//		
//		a[1] = new int[]{30,40,50};
//		for(int i = 0; i<a[1].length; i++){
//			a[1][i] = 30 + (10 * i);
//			System.out.println(a[1][i]);
//		}
//		a[2] = new int[]{60,70,80,90};
//		for(int i = 0; i<a[2].length; i++){
//			a[2][i] = 60 + (10 * i);
//			System.out.println(a[2][i]);
//		}
//		int k = 10;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = k;
//				k+=10;				
//			}			
//		}		
	}
}

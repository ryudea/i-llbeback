package D_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {

		/*
		 * 1.배열(array)이란? -같은 타입의 여러 변수를 하나의 붂음으로 다루는 것. //다른 타입은 x ex) 5명의 점수
		 * int score1 = 100; int score2 = 50; int score3 = 30; int score4 = 70;
		 * int score5 = 63;
		 * 
		 * 2.배열의 선언 2-1) 원하는 타입의 변수를 선언하고 변수 또는 타입의 배열임을 의미하는 []대괄호를 붙여준다.
		 * 
		 * int [] a1; int a2 [];
		 * 
		 * 3. 배열의 생선 -배열을 선언한 다음에는 배열을 생성해야 한다. -배열생성을 위해서는 'new'연산자와 함께 배열의 타입과
		 * 크기를 지정해주어야한다. -index개념이기 때문에 방번호의 시작은 무조건 0부터 시작된다.
		 * [0],[1],[2],[3],[4],[5] ... -각 방은 기본값(초기값)으로 초기화되어있다. int [0] = 0
		 */

		// int [] a = new int[3]; // int type을 3개 넣을 수 있다.->대괄호 안에 int 값을 넣을 수
		// 있는 갯수값을 넣으면 된다.
		// int [0] = 4 , int [1] = 5 , int [2] = 2

		// int[] a2;
		// a2 = new int[]{3,4,5};//방 번호가 만들어지고 숫자를 넣으면 가능하지만.

		// int[] a3;
		// a3 = {3,4,5};//방 번호가 정해지지 않았는데 숫자를 넣으면 안된다.

		// int[] a3 = {3,4,5};// 가장 많이 생략해서 쓸 수 있는 줄.
		//
		// //int 형 배열 score
		// int[] score2;
		// score2 = new int[]{4,5,4,2};
		// for( int i = 0; i < 4 ; i++){
		// System.out.println(score2[i]);
		// }
		//
		// int[] score = new int[4];
		// for (int i = 0; i < score.length; i++){ // [4]대괄호 안의 수를 불러들이는 키워드 - >
		// score.length = 4 //
		// score[i] = (1+i)*10;
		// System.out.println(i+ "번째 방에는 " + score[i]+"이 들어있습니다.");
		// }
		// 1. 207호의 자바초급 점수를 저장할 수 있는 변수를 선언 및 생성해주세요.17명의 정수를 저장할 수 있는 방
		// //2. 각 사람의 점수를 0~100점 사이의 랜덤한 정수값으로 저장해주세요.(for문)
		// int ran = (int)(Math.random()*100) ;
		// score[0] = ran;
		// int ran1 = (int)(Math.random()*100);
		// score[1] = ran1;
		// int ran2 = (int)(Math.random()*100);
		// score[2] = ran2;
		// int ran3 = (int)(Math.random()*100);
		// score[3] = ran3;
		// int ran4 = (int)(Math.random()*100);
		// score[4] = ran4;
		// int ran5 = (int)(Math.random()*100);
		// score[5] = ran5;
		// int ran6 = (int)(Math.random()*100);
		// score[6] = ran6;
		// int ran7 = (int)(Math.random()*100) + 1;
		// score[7] = ran7;
		// int ran8 = (int)(Math.random()*100) + 1;
		// score[8] = ran8;
		// int ran9 = (int)(Math.random()*100) + 1;
		// score[9] = ran9;
		// int ran10 = (int)(Math.random()*100) + 1;
		// score[10] = ran10;
		// int ran11 = (int)(Math.random()*100) + 1;
		// score[11] = ran11;
		// int ran12 = (int)(Math.random()*100) ;
		// score[12] = ran12;
		// int ran13 = (int)(Math.random()*100) ;
		// score[13] = ran13;
		// int ran14 = (int)(Math.random()*100) ;
		// score[14] = ran14;
		// int ran15 = (int)(Math.random()*100) ;
		// score[15] = ran15;
		// int ran16 = (int)(Math.random()*100);
		// score[16] = ran16;
		//
		// 3. 각 사람의 점수를 출력하고, 모든 사람의 점수를 합한 값도 출력해주세요.

		// int[] score = new int[17];
		// int sum = 0;
		// for(int i= 0; i< score.length; i++){
		// int ran = (int)(Math.random()*101);
		// score[i] = ran;
		// sum +=ran;
		// System.out.println(score[i]);
		// }
		// System.out.println("점수의 총 합은" + sum + "입니다");
		//
		// 1.사용자로부터 7개의 숫자를 입력받아서 저장할 수 있는 변수input을 선언 및 생성해주세요
		int[] input = new int[7];
		int sum = 0;
		// 2.input 각각의 방을 사용자로부터 입력받아 저장해주세요.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < input.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력해주세요");
			input[i] = sc.nextInt();
		}
		// 3.저장된 input의 배열의 값을 출력하세요.
		for(int j = 0; j < input.length; j++){
			System.out.print(input[j]+ " ");	
			sum += input[j];
		}
		// 4.합계
		System.out.println();
		System.out.println("방에 저장된 값의 합은 " + sum + "입니다.");
		//5.평균 둘째자리까지 표현
		float k = 0;
		k =(int)((float)sum / (input.length)*100)/100f;
		System.out.println("방에 저장된 평균값은"+ k +"입니다.");
		//.6사용자 입력값 중에 최대값을 구하시오
		int max = input[0]; // 
		int mas = input[0];
		for(int x = 0 ; x < input.length ; x++){	
			if(input[x] > max){ // -42 <0 
				max = input[x];		
			}
			if(input[x]< mas){
				mas = input[x];
			}
		}
		System.out.println("방에 저장된 값 중에서 가장 큰 수는" + max + "입니다.");
		System.out.println("방에 저장된 값 중에서 가장 작은 수는" + mas + "입니다.");
	}
}
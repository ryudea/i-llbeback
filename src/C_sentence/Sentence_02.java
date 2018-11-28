package C_sentence;


import java.util.Scanner;

public class Sentence_02 {
	public static void main(String[] args) {
		/*
		1.반복문 ( for ,while, do-while)
		 -어떤 작업이 반복적으로 수행되도록 할때 사용됩니다.
		 -반복문은 주어진 조건이 만족되는 동안 수행함으로 조건식을 포합한다.
		 -for문은 주로 반복횟수를 알고 있을때 사용하고, while문은 반복횟수를 모를때 사용된다.
		 
		 2.for문
		 -기본구조
		  for(초기화, 조건식, 증감식){
		  		수행될문장
		  }
		  초기화 - > 조건식 -> 수행 -> 증감식
			 - > 조건식 -> 수행 -> 증감식
			 조건식이 false일 경우 반복종료
			 초기화: int i =  0
			 조건식: i <= 10,i < 11
			 증감식: i++
			 결과 : 0 ~ 10
		for문에서 초기값으로 사용된 int 변수는 for문이 끝나면 변수가 사라진다.
			 
		
		for (int i = 0; i<1001; i++){
			if (i%2 != 0){
				System.out.println(i);	
			}
		}
		
		//1.스케너 Scanner = Scan
		Scanner sc = new Scanner(System.in); //참조형 scanner sc = new Scanner(새로운 주소)<-새로운 참조형을 받아들일 준비를 한 것.
//		System.out.println("문자를 입력해주세요");
//		String str = sc.next(); // str에 1차적으로 저장
//		System.out.println(str);// str에 저장된 String을 출력. 반복되지 않기 때문에 한번 실행하면 멈춘다-> 반복시키면 계속 쓸 수 있다.
		
//		System.out.println("숫자를 입력해주세요");
//		int result = sc.nextInt();
//		System.out.println(result);
		/*
		 1. 사용자로 부터 숫자를 입력받아서 0~입력받은 수까지 출력해주세요.		 
		 
		 
		System.out.println("숫자를 입력하세요");
		int result1 = sc.nextInt();
		for(int i = 0 ; i < result1+1 ; i++){
			System.out.println(i);
		}	
		*/
		
		//1.5~15까지의 합계를 구하세요
		/*
		int sum = 0;
		for (int i = 5; i < 16 ; i++){
			sum += i;
			System.out.printf("%d",i);
				if(i!=15){
					System.out.printf("+");
				}else{
					System.out.printf("=");
			
			System.out.print(sum);
				}
		}
	*/			
		//2. 6에서 사용자가 입력한 수까지의 홀수의 합을 구하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int result = sc.nextInt();
		System.out.println(result);
		long sum = 0L; // ctrl + shipt+ b = break 포인트
		for (int i = 6 ; i < result+1 ; i++){
			if(i<=result){
				if(i%2 != 0){
					sum += (long)i;
					System.out.printf("%d",i);
					if(i != result){	
						System.out.print("+");//i= 10 , result =10 일때... 첫번째 if조건에서 false가 나오면
					}
				
				}
			}					
		}
		System.out.printf("=	%d",sum);		
	}
}

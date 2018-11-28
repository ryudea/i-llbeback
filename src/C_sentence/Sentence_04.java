package C_sentence;

import java.util.Scanner;

public class Sentence_04 {
	public static void main(String[] args) {
		/*
		1.while문
		 -반복획수를 모를때 사용한다.
		 -조건식과 수행해야될 블락{}으로 구성되어 있다.
		
		6~입력값까지 더하기
		
	int sum = 0;
		for ( int i = 5; i < 16 ; i++){
			sum += i;
		}	
	System.out.println(sum);
	
	   2.
	    초기화
	   while(조건식){
	   	수행할 식
	   
	   }
	   
	
		//1번문제 3~33까지의 합계를 구하세요
		int sum = 0;
		int i = 3;
		while (i < 34){
			if(i%2 == 0){
				sum += i;	
			}
			i++;
		}
		System.out.println();
		System.out.println(" = " + sum);
		
		//3.for 구구단
		for(int i = 2; i<10 ;i++){
			for(int j = 1; j < 10; j++){
				System.out.printf("%d x %d = %d",i, j, i*j );
				System.out.println();
			
			}System.out.println();
		}
		*/
		//while	
/*
	int i = 2;	
	while(i<10){
		int j = 1;
			while(j<10){
				if(j%2 != 0 && i%2 == 0){
					System.out.printf("%d x %d = %d%n",i,j,i*j);									
				}
				j++;
			}

		i++;
		System.out.println();
	
	}		
	}
}

/*
		// 3. 1~?를 더했을때 100 이상이 되는가.
		int sum = 0;
		int i = 0;
		while (sum < 100){
			i++;
			sum += i;
		}
		System.out.println(i);
*/
		//9404 - 1845
		//4. 사용자로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요 // 시작 수 ~ 끝수 중 5의 배수의 합계를 구하세요
		//단 while 문 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("시작하는 수를 입력하시오");
		int rst = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("끝나는 수를 입력하시오");
		int rst2 = sc2.nextInt();		
		
		int sum = 0;
		
		while(rst < rst2+1){ //시작은 포함 , 끝은 미포함 rst < rst2+1
			if(rst%5 == 0 ) {
				sum += rst;
			
			}
			rst++;
		}
		System.out.println("5의 배수의 합은" + sum + "입니다.");
	}
}

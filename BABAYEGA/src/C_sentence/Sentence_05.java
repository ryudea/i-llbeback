package C_sentence;

import java.util.Scanner;

public class Sentence_05 {
	public static void main(String[] args) {
		
		/* do-while
		 -while문의 변형으로 기본구조는 while하고 비슷합니다.
		 -최소 1회 블럭{}을 수행한다.
		 -구조
		 	do{
		 		수행될 문장
		 	} while(조건식);
		 		 
		
		
		//1. 문자를 입력받는다.//  무조건 문자를 한번은 받아야 조건을 비교할 수 있으니 do while가 쓰이는 것이다.
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		do{
			System.out.println("문자를 입력해주세요\n");
			str = sc.next();
			System.out.println(str);					
		}while(!str.equals("x"));
		 */
		/*
		 *continue
		 -반복문 내에서만 사용 가능하다.
		 -반복문의 끝으로 이동하여 다음 반복문으로 넘어간다.
		 -for문에서는 초기값으로 다시 돌아가서 실행되고, while 은 조건식, if는 조건식으로 다시 돌아가서 실행한다.
		 
		 
		 
		 
		for (int i = 0; i <11 ; i++){
			if(i%2==1){
				System.out.println(i);
			}
		}
		for(int i = 0; i < 11 ; i++){
			if(i%2 ==0){
				continue;
			}
			System.out.println(i);
			*/
		
		
	}
}
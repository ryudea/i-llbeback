package B_Operation;

public class Operaion_01 {
	public static void main (String[] args){
		/*
		1.연산자의 기본
		-단항 연산자: +, -, ++;(증감),--;(경감),~,!(not),(타입)-캐스트연산자
		-이항 연산자: 
		  -> 산술 연산자:+ , - , * , / ,%(나머지 연산자), <<, >>, >>>(위치설정) 
		  -> 비교 연산자:<, > , >= ,<= , ==(등호), !=(not,)
		  -> 논리 연산자: &(And), |(shift +\,oR), ^(xor==), &&(and 결합), ||(or 결합),  
		-삼항 연산자: 논리결과 ? true일때 실행 : false실행 (  x ? y : z )
		-대입 연산자: = , op= 		  
		
		*instanceof (7장)
		  
		 2.연산 우선순위
		 -산술(2) > 비교(2) > 논리(2) > 대입(3)
		 -단항      > 이항      > 삼항
		*/

		char ch = 'A'; 
		char lowerCase = 'A'<= ch && ch <= 'Z' ? (char)(ch+32) : ch; 
 
	    System.out.println("ch:"+ch);
	    System.out.println("ch to lowerCase:"+lowerCase);

		
	    
		}

}
package C_sentence;

public class Sentence_01 {
	public static void main(String[] args) {
	
		
  /*
   
   1. 조건문
	1-1) if문(if ,  else if)
	-조건식과 실행될 문장을 포함하는 블럭{}으로 구성되어 있다.
	-조건식의 결과에 따라서 프로그램을 실행하는 흐름이 달라진다.
	
	if분
		-구조
			1)기본
			  if(조건식){
			  
			  }
			    
	  int a = 4;
	  if(a%2 == 0){
	   
		  System.out.println("짝수이다."); 
		  
		  2)1단 변형
		   if(조건식){
	       true일때 출력
		  else {
		   조건식이 false일때 출력
		  
		  int b = 5;
		  if( b%2 == 0){
		   
			  System.out.println("짝수이다."); 
		  }else{
			  System.out.println("홀수이다.");
			  
		  }
		 3)2단 변형
		   	 if(조건식1){
		   		 조건식1이 true일때 수행
		   	 }else if(조건식2){
		   		 조건식1이 false이고 조건식 2가 true일때 수행
		   	 }else{
		   		 조건식 1이 false이고 조건식 2가 false일때 수행
		   	 }
		   	 }
		int a1 = -1; 
		if(a1<0){
			System.out.println("a는 음수이다");
		} else if(a1>0) {
			System.out.println("a는 양수이다");
		} else{
			System.out.println("a는 0이다");
		}			
		   	
		
		 
		     int result515 = (int)(Math.random()*17+1);
		     System.out.
		     
		     println(result515);
		     // Math<- 자바 내의 클레스 , random <- 매써드 0<= Math.random() < 1 [double 타입] 
		     //형태 =  (int)(math.ramdon()*(랜덤값-1)+1(시작값))
		     
		     //주사위 1~6  
		     //포함 ~ 미포함 -> 1~7
		     //뒤- 앞 = 6
		     //시작    = 1
		       
		//중첩 if문
		int a2 = (int)(Math.random() * (101) + 0 ); // 
		System.out.println(a2);
		if (a2 >= 90){
			System.out.print("A");  //println(에서 ln = line을 바꾸라는 말이다.) 
			if(a2 > 95){
				System.out.println("+");
			} else  {
				System.out.println("-");
			}
		} else if (a2 >= 80){
			System.out.print("B");
			if(a2>85){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if (a2 >= 70){
			System.out.print("C");
			if( a2 > 75) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}	
		} else if (a2 >= 60) {
     			System.out.print("D");
			if( a2 > 65){
				System.out.println("+");
			} else {
				System.out.println("-");	
			}
		} else{
			System.out.println("나가");
		}
		/*
		 
		 switch-case  
		 -조건의 수가 많을때는 if문 보다는 switch문을 많이 사용한다.
		 -구조 
		  switch(값,연산결과){
		  	  case 값1 : 
		  	  	  조건식 == 값1을 수행
		  	  	  break;
		  	  case 값2 :
		  	  	  조건식 == 값2을 수행
		  	  	  break;
		  	  case 값3 : 
		  	        조건식 == 값3을 수행 // default 위의 식은 break를 생략해도 된다.
		  	  default : 
		  	      조건식과 만족하는 값이 없을때 수행
		 
		
		int a3 = 3;
		switch(a3){
		case 1 :
			System.out.println("a3는 1이다");
			break;
		case 2 :
			System.out.println("a3는 2이다");
			break;
		case 3 :
			System.out.println("a3는 3이다");
			break;
		default : 
			System.out.println("a3는 1,2,3이 아니다");
		}
		
		
		int a4 = (int)(Math.random()*5 + 1);
		System.out.println(a4);
		
		switch(a4){
		case 1 :
			System.out.println("영민빌딩 내놔");
			break;
		case 2 :
			System.out.println("200만원대 자전거 당첨");
			break;
		case 3 : 
			System.out.println("포르쉐 파나메라 당첨");
			break;
		case 4 :
			System.out.println("강남에 24평 아파트 당첨");
			break;
		default : 
			System.out.println("강남에 36평 아파트 당첨");
		}
		*/
		int a3 = (int)(Math.random() * (101) + 0 ); 
		System.out.println(a3);
		switch( a3 / 10) {
			case 10 : 	case 9 :
				System.out.print("A");
				break;
			case 8 :
				System.out.println("B");
				break;
			case 7 :
				System.out.println("C");
				break;
			case 6 :
				System.out.println("D");
				break;
			default : 
				System.out.println("나가");
		}
	}
}


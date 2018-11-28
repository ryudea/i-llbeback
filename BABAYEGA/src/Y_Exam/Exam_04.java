package Y_Exam;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exam_04 {
	public static void main(String[]args){
	
		

		/*	[4-1] 다음의 문장들을 조건식으로 표현하라.
	1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
	int x =(int)(Math.random() * (30) + 0);	
	System.out.println(x);
		if( 10 < x && x < 20) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}	
	}
	

	
		
	2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식

	char ch = 'd';
		if( ch == ' ' || ch == '	'){
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}

	
	
	//3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식

		char ch = 'X';
		if( ch == 'x' || ch == 'X'){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

		
/*		
	//4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
	char ch = 'A';
		if ('0' <= ch && ch <= '9'){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	
	}
}
		
	//5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
	
		char ch = 'A';
		if('A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z' ){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}

	6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 true인 조건식

 		int year = 400;
 
		if ( year%400 == 0 || year % 100 != 0 && year % 4 == 0){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
		
		
	//7. boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn != false;

	}
}

	
	//8. 문자열 참조변수 str이 “yes”일 때 true인 조건식

	String str = "YES";
		if (str.equals("yes")){
			System.out.println("ture");
		} else {
			System.out.println("false");
		} 	
	}
}
	
	
	
	
	
		[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
	
	int sum = 0;
		for(int i = 1; i<21 ; i++){ //->1~20까지의 정수
			if( i%2 != 0 && i%3 != 0){ // -> 2~3배수
					sum += i;
			}			
		}
		System.out.println("1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합은 " + sum);
	}

/*
	}
}

*/	//[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.1+3+6+10 = 20
		

		// 1 + ( 변수 x + (x+y) + (x+y) ) + ( (x + y) + (x+y) + (x+y))
	// x가 순차적으로 증가하는 식, 증가된 x에 더해주는 y값(for문이 두개 중첩된 형태)
	// for문이 시작되면 여는 괄호를 출력하고, 끝나면 닫는 괄호를 출력한다.
//string
/*
	int sum = 0;		
	  for( int i = 1 ; i < 11 ; i++){
		  	if(i!=1){
		  	System.out.print("(");
		  }
		  for (int j = 1; j < i+1 ; j++){
			 sum += j;
			 System.out.print(j);
			 if(j != i){
				 System.out.print("+");
			 }
		  }
		  if(i!=1){
			  if(i!=10){
				  System.out.print(") +");
			  } else{
				  System.out.println(") = " + sum);
			  }
		  } else {
			  System.out.print("+");
		  }
	  }
	}
/*
		
		
		
		
		
		
		
		
*/	
		
/*		int sum = 0;		
		int sum2 = 0;
		String y = "";
		for (int i = 1; i < 11 ; i++){
			sum += i;  //1 , 3 , 6, 10, 15
			sum2 += sum;// 1 , 4 , 10 , 20 , 35
			System.out.println("( ");
			for(int j=1; j < j+i ; j++){
				if(j<i){
					System.out.println(j + "+");
				} else if (j==i){
					System.out.println(j + "");
				}
			}
			if(i != 10){
				System.out.println( ") + ");
			}else{
				System.out.println(")");
			}
		System.out.println(" = " + sum2); 
		}
	}
	
	
	
	
	
//	[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//	100이상이 되는지 구하시오.
/*
	int y = 200;//식을 몇번 반복할지를 입력하시오.
	int sum = 0;//합 
	int cut = 0;//식을 카운팅하는 
		for (int i = 1 ; i < y ; i++){	
			if(i%2 == 0){
				System.out.printf("( - %d )",i);
				sum -= i;
			} else{
				System.out.printf(" %d ",i);
				sum += i;
			}
			
			cut += 1;
			
			if(cut+1 < y){
				System.out.print("+");
			} else {
				System.out.printf(" = %d%n",sum);
			}
		
		}
			
		if(sum == 100){
			System.out.println();
			System.out.printf("%d번째 식부터 총합이 100 이상이 됩니다.",cut);				
		}
	}
}

	int sum = 0;
	int count = 0;
	while(sum < 100){ // 100보다 작을때 끄시오
		count++;
		if(count%2 ==1 ){ //count= 1, 2 , 3, 4, 5, 6, 7
			sum += count;
		}else{
			sum -= count;
		}
	}
	System.out.println(count + "번째 수부터 100 이상이 됩니다.");
	}

/*
//		[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//		100이상이 되는지 구하시오.
		int i = 1 ;
		int sum = 0;
		int cut = 0;
		while(sum <100){
			if(i%2 != 0){
				sum += i;
				System.out.print(i);
				i++;
			} else{
				sum -= i;
				System.out.print("( - " + i + " ) ");
				i++;
			}
			if(sum<99){
				System.out.print("+");				
			}		
			cut++;
		}
		System.out.println("="+ sum);
		System.out.println();
		System.out.println(cut + "번째 값을 더했을때 100 이상이 됩니다.");			
		
	}
	
		


	
	
//[4-5] 다음의 for문을 while문으로 변경하시오.  ????
//	[연습문제]/ch4/Exercise4_5.java
//	public class Exercise4_5 {
//	public static void main(String[] args) {
	
	
	int i = 1;
	while(i<=11){
		int j = 1;//j의 값을 초기화한다.
			while(j<=i){
				System.out.print((char)'*');//j는 i의 수보다 크지 않은 범위 내에서 반복한다.
				j++;//j의 값을 초기값부터 순차적으로 증가시킨다.
			}
			System.out.println();//j의 연산이 끝날때마다 한칸 내린다.
	i++;//j의 연산이 끝나면  i의 값을 증가시킨다.
	}

	}

	
	
//	[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
//로그램을 작성하시오.
16 Java의 정석定石 3판 - 연습문제 풀이
	
		for (int i = 1 ; i < 7 ; i++){ //1~6
			for(int j = 1; j <7 ; j++){
			 	if((i+j)%6 == 0){//1~6
				System.out.printf("[ %d , %d ]", i ,j);//
				}
				
			}
		}
	}




	
	
	
//	[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
//	코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
//	[연습문제]/ch4/Exercise4_7.java
//	class Exercise4_7 {
 /* 	public static void main(String[] args) {

	int value = (int)(Math.random()*6)+1;// 1~6사이의 임의의 정수 , 초기값: 1, 포함 1, 미포함 수 7, (int)(Math.random()*(미포함 - 포함) + 초기값);
	System.out.println("value:"+value);
	}
}
	
	
	
	[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
	0<=x<=10, 0<=y<=10 이다.
/*	
	int z = 10;
		for(int x = 0 ; x < 11; x++){
			for(int y = 0; y < 11 ; y++){
				int sum = (2 * x) + (4 * y); 
				if(sum == 10){
					System.out.printf("%d + %d = %d%n",2 * x,4*y,z);
				}
			}
				
		}
	}
}

	
	[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
	드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
	어야 한다. (1)에 알맞은 코드를 넣으시오.
	[Hint] String클래스의 charAt(int i)을 사용
	[연습문제]/ch4/Exercise4_9.java
	class Exercise4_9 {
	public static void main(String[] args) {

	String str = "12345";//5
	int sum = 0;
		for(int i=0; i < str.length(); i++) {
			sum += str.charAt(i)-48; 
		}                                   ////(정답) str.charAt(1) = '1' = 49, str.charAt(2) = '2' = 50, 이기때문에 -48을 하면 고른 수열이 나온다.
		System.out.println("sum="+sum);
	}//str.length() , str.charAt()

/*	[실행결과]
	15	
	

  [4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
	완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
	에 알맞은 코드를 넣으시오.
	[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
	[연습문제]/ch4/Exercise4_10.java
	class Exercise4_10 {
	public static void main(String[] args) {
	
	
	int num = 12345;
	int sum = 0;
		while(num > 0){		
			sum += num%10;
			num/=10;
		}	
		System.out.println("sum="+sum);
	}

/*	[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
	는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
	1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
	시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
	[연습문제]/ch4/Exercise4_11.java
	public class Exercise4_11 {
	public static void main(String[] args) {
	// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
 

	int num1 = 1;
	int num2 = 1;
	int num3 = 0; // 세번째 값
	System.out.print(num1+","+num2);//1  ,1
		for (int i = 0 ; i < 8 ; i++ ) {// i = 1~7 
			num3 = num1 + num2;
			num1 = num2;//num3 = 2, num1 = 1 , num2 = 2 , num3 = 3 
			num2 = num3; //     num2 = 2, num2 = 3 
			System.out.print("," + num3);
		}
	System.out.println("\n피보나치 수열의 10번째 수는" + num3 + "입니다.");
	}
			



	[4-12] 구구단의 일부분을 다음과 같이 출력하시오.


		for(int i = 2 ; i < 9; i +=3  ){ // 단수->2 , 5 , 8
			for(int j = 1; j < 4; j++){  // 곱셈->1, 2, 3
				for(int k = 0; k < 3 ;  k++ ){ //단수의 증가 0, 1, 2
					if( i + k == 10){  
							System.out.print("");
					}
					else {
							System.out.printf(i+k + " x " + j + " = " + (i+k)*j+"	");//2+0 x 1 = (2+0) x 1 (tap)
					}						
				}
				System.out.println(); // for문이 끝나면 한칸 띄우시오 (곱셈 1,2,3 \n 1,2,3) 											
			}
			System.out.println();// for2가 끝나면 줄 바꾸기 // i=2, j=2(반복), i=2, j=3(반복)(for2 종료) // 단수가 끝나면 한칸 띄우시오
 		}
	}

/*
	
	[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
	은 코드를 넣어서 프로그램을 완성하시오.
	[연습문제]/ch4/Exercise4_13.java//??
*/	String value = "1234";
	char ch = ' ';
	boolean isNumber = true;
	// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
	// 하나씩 읽어서 검사한다.
	// ppt 2장. 글자 100자 이내, 6장
		ch = '0';
		for(int i=0; i < value.length() ;i++) { //value,length = 5;
			isNumber = (ch <= value.charAt(i) && value.charAt(i)<= '9'); 
			if(isNumber = false){
				break;
			}
		}
		if (isNumber) {
					System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
	}
	// end of main
 // end of class
/*	
	
	[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
	해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
	신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
	게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
	로그램을 완성하시오.
	[연습문제]/ch4/Exercise4_14.java
	class Exercise4_14
	{
	public static void main(String[] args)
	{
	// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
	int answer = (int)(Math.random()*100)+1 ; // 1~100 , 포함1 미포함 101 101 - 1 
	int input = 0; // 사용자입력을 저장할 공간
	int count = 0; // 시도횟수를 세기위한 변수
	// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
	java.util.Scanner s = new java.util.Scanner(System.in);
	do {
	count++;
	System.out.print("1과 100사이의 값을 입력하세요 :");
	input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
		if(answer < input ){
			System.out.println(input +"보다 적은 수를 입력하세요");
			continue;
		}
		if(answer > input){
			System.out.println(input + "보다 큰 수를 입력하세요");
			continue;
		}
		if(answer == input ){
			System.out.println("정답입니다!!	"+ "\n답은" + input + "이었습니다!"+"\n시도횟수는" + count + "입니다.");

			break;
		}

	} while(true); // 무한반복문
	} // end of main
	 // end of class HighLow
	[실행결과]
	1과 100사이의 값을 입력하세요 :50
	더 큰 수를 입력하세요.
	1과 100사이의 값을 입력하세요 :75
	더 큰 수를 입력하세요.
	1과 100사이의 값을 입력하세요 :87
	더 작은 수를 입력하세요.
	1과 100사이의 값을 입력하세요 :80
	더 작은 수를 입력하세요.
	1과 100사이의 값을 입력하세요 :77
	더 작은 수를 입력하세요.
	1과 100사이의 값을 입력하세요 :76
	맞췄습니다.
	시도횟수는 6번입니다.
	20 Java의 정석定石 3판 - 연습문제 풀이
	
	
	
	
	[4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
	어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
	다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
	[Hint] 나머지 연산자를 이용하시오.
	[연습문제]/ch4/Exercise4_15.java
	class Exercise4_15
	{
	public static void main(String[] args)

	int number = 32123; // reuslt = 123//1223, 3221
	int tmp = number; // number 값 저장. 
	int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
		while(tmp!=0){
			result *= 10; // 0  10 120
			result = tmp%10+result; //0 120 + 3  
			tmp /= 10;		//321 32 3
		}
		if(number == result){
			System.out.println(number + "는 회문수 입니다.");
		}else{
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}
	*/	
}
		

	



	
	



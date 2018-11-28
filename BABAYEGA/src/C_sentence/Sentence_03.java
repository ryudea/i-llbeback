package C_sentence;

import java.util.Scanner;

public class Sentence_03 {
	public static void main(String[] args) {
	}
}
		
		/*구구단
		int j = 2; 
		for(int i=1; i < 10; i++){
			System.out.printf("%d x %d",i,j,);
		}
	}

	int a = 2;
	int b = 1;
	System.out.printf("%d x %d	= %d%n",a,b,a*b);// b의 증감식 , 출력값.
	b += 1;
	System.out.printf("%d x %d	= %d%n",a,b,a*b);
	b += 1;
	System.out.printf("%d x %d	= %d%n",a,b,a*b);
	b += 1;
	System.out.printf("%d x %d	= %d%n",a,b,a*b);
	b += 1;
	System.out.printf("%d x %d	= %d%n",a,b,a*b);
	b += 1;
	System.out.printf("%d x %d	= %d%n",a,b,a*b);
	b += 1;
	System.out.printf("%d x %d	= %d%n",a,b,a*b);
	b += 1;
	System.out.printf("%d x %d	= %d%n",a,b,a*b);
	b += 1;
	System.out.printf("%d x %d	= %d%n",a,b,a*b);

	
		
		
	for (int i = 2; i< 10 ; i++ ){
		for (int j = 1 ; j < 10 ; j++){
		  //System.out.printf("%d x %d = %d%n",i,j,i*j); 
			System.out.println(i + " x " + j + " = " + i*j); 
		}System.out.println();
	}
	
	for (int i = 2; i< 10 ; i++ ){
		for (int j = 1 ; j < 10 ; j++){
			if(i%3 != 0 && j%2 != 0 ){ 
				{// i%2를 하면 홀수 구구단이 나오고  i%3을 하면 짝수 구구단이 나온다. 
				System.out.printf("%d x %d = %d%n",i,j,i*j); // 9단.
				//System.out.println( i + "x " + j + "=" + i*j);
				}
			}

		}System.out.println();
	}
}


	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력하시오");
	int result = sc.nextInt();
	for (int i = result; i< result + 1 ; i++ ){
		for (int j = 1 ; j < 10 ; j++){
				System.out.printf("%d x %d = %d%n",i,j,i*j); // 2단만 나오게 하려면 i값을 2로 고정시키면 된다. == int i = 2; 를 넣으면 된다.
		}
		System.out.println();
	}
	 11월 6일 숙제

	for( ; ;){
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		System.out.println("사칙연산을 입력하시오");
		System.out.println("숫자를 입력하시오");
		
		int result = sc.nextInt();
		String str = sc2.next();
		int result2 = sc3.nextInt();

		if(str.equals("X")||(str.equals("x"))){
			if(str.equals("+")){
				System.out.println(result+ "+" + result2 + "=" + (result + result2));
			}else if(str.equals("-")){
				System.out.println(result + "-" + result2 + "=" + (result - result2));
			}else if(str.equals("*")){
				System.out.println(result  + "*" + result2 + "=" + (result * result2));
			}else if(str.equals("/")){
				System.out.println(result + "/" + result2+ "=" +((float)result / result2));
			}
		}break;
	}
	}		
}
	*/
		
		
	




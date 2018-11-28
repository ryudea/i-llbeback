package E_OOP;

public class RecursiveCall {
	public static void main(String[] args) {
		
//		int num2 = 4;
//		int sum = 1;
//		for (int i = num2; i > 0; i--) { 
//			System.out.println(sum *= i);			
//		}		
//		System.out.println(sum);
		
		
		
		long result = factorial(4);
		System.out.println(result);

	}

	static long factorial(int num) {
		long result = 0L;
		if (num == 1) {
			result = 1;
		} else {
			result = num * factorial(num - 1);// 매서드 내에서 내 매서드를 다시 부른다.
		}
		return result;
	}

}

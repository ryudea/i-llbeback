package Test;


class TvTest3{
	public static void main(String[] args) {
		int [] a = new int[]{};
		System.out.println(a);
		System.out.println(Test.math(new int[]{}));
	}
}

 
class Test{
	static int math(int[]a){
		int result=0;
		if(a.length == 0){
			result = -9999;
		}
		return result;
	}
}
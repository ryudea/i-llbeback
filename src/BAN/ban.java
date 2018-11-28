package BAN;

public class ban {
	public static void main (String[] arge){
			byte a = 10;
			byte b = 20;
			int c = a + b; //byte=> int
			char ch = 'A';
			//++ch;  // char 두번째 방법
			//++ch;

			float f = (float)3 / 2;//float
			long l = (long)3000 * 3000 * 3000;//(long)
			float f2 = 0.1f;  // double f2 = 0.1f;
			double d = 0.1f; //double d = 0.1f , float d = 0.1f;
			boolean result = d==f2;
			int a3 = 67;
			
			System.out.println("c="+c);
			System.out.println("ch=" + (char)((char)ch + 2));  // <- char 값 첫번째 방법 
			System.out.println("f="+f);
			System.out.println("l="+l);
			System.out.println("result="+result);
			}
}
package D_array;

public class Array_04 {
	public static void main(String[] args) {

		String[] str = { "현웅", "상엽", "은우", "대웅", "재은", "진경" };
		String[] str2 = { "국", "영", "수", "사", "과", "java", "오라클" };
		// 랜덤한 값을 배열안에 저장.
		int[][] a = new int[str.length][str2.length];// int[사람이름.length][과목.length]
		for (int i = 0; i < str.length; i++) { // 6
			for (int j = 0; j < a[i].length; j++) { // 7
				a[i][j] = (int) (Math.random() * 101);
			}
		}
		// 사람별 과목점수 합계
		int[] sum = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				sum[i] += a[i][j];
			}
		}
		// 사람별 과목평균
		float[] avr = new float[str.length];
		for (int i = 0; i < avr.length; i++) {
			avr[i] = (int) (((float) sum[i] / str2.length) * 100 + 0.5f) / 100f;
		}
		// 과목별 합계.
		int[] ss = new int[str2.length];
		for (int i = 0; i < str2.length; i++) {// 6
			for (int j = 0; j < str.length; j++) {// 7
				ss[i] += a[j][i];
			}
		}
		// 과목별 평균.
		float[] savr = new float[str2.length];
		for (int i = 0; i < str2.length; i++) {
			savr[i] = (int) (((float) ss[i] / str.length) * 100 + 0.5f) / 100f;
		}
		// 사람별 석차.
		int lank[] = new int[str.length]; // 6
		for (int i = 0; i < str.length; i++) {// 6
			lank[i]++;
			for (int j = 0; j < str.length; j++) {// 6
				if (sum[i] < sum[j]) {
					lank[i]++;
				}
			}
		}
		// 정렬 - 이차 배열의 i값을 저장하는 식.
		int[] b = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < lank.length; j++) {
				if (i == lank[j] - 1) {
					b[i] = j;
					continue;
				}
			}
		}
		// 과목출력 + 합계 + 평균
		for (int i = 0; i < str2.length; i++) {
			System.out.print("	" + str2[i] + " ");
		}
		System.out.print("	" + "합계" + "	" + "평균" + "	" + "석차" + "	");
		System.out.println();
		// 점수
		for (int i = 0; i < str.length; i++) { // 사람이름 + 과목점수
			System.out.print(str[b[i]] + ":	");
			for (int j = 0; j < str2.length; j++) {
				System.out.print(a[b[i]][j] + "	");
			}
			System.out.print(sum[b[i]] + "	" + avr[b[i]] + "	" + lank[b[i]]);
			System.out.println();
		}
		System.out.print("과목합계:");
		for (int i = 0; i < str2.length; i++) {
			System.out.print("	" + ss[i]);
		}
		System.out.println();
		System.out.print("과목평균 :");
		for (int i = 0; i < str2.length; i++) {
			System.out.print("	" + savr[i]);
		}
		System.out.println();
	}
}
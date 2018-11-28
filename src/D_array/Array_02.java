package D_array;

public class Array_02 {
	public static void main(String[] args) {

		// 1. 정렬(sort)
		// -어떤 데이터를 빠르고 쉽게 찾기 위해 순서대로 데이터들을 가지런히 나열하는 작업
		// -버블정렬, 삽입정렬, 선택정렬
		//
		// 2. 버블정렬(bubble sort)
		// -인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
		// -회전이 진행됨에 따라 가장 큰 값이 뒤로 보내진다.
		// 출력 문제.
		// //
//		int[] x = new int[] { 5, 2, 3, 1, 4 };
//		for (int j = 0; j < x.length - 1; j++) { // 5번 반복
//			System.out.print((j + 1) + "번째 회전" + " : ");
//			for (int i = 0; i < x.length - 1 - j; i++) {
//				// 버블정렬 : x.length - 1 = 4
//				if (x[i] > x[i + 1]) { // 2 1 3 4
//					int y = x[i + 1];
//					x[i + 1] = x[i];
//					x[i] = y;
//				}
//				for (int k = 0; k < x.length; k++) {
//					System.out.print(x[k]);
//					if (k != 4) {
//						System.out.print(",");
//					}
//				}
//				System.out.print("	");
//			}
//			System.out.println();
//		}

		// 3.선택정렬(select sort)
		// -정렬의 대상에서 최솟값을 찾아서 맨앞의 내용과 교체하는 방식이다.
		// -회전이 진행됨에 따라 가장 작은 값이 앞에 확정된다.
		// -0번째 방 ex) a[0] 을 기준으로 최솟값이 있는 방 번호를 찾는다.(한바퀴 다 돌아서 값을 비교한다.)
		// -찾아낸 최솟값 방이랑 0번 방이랑 자리를 바꿉니다.
		// -1번째 방을 기준으로 최솟값이 있는 방 번호를 찾는다.(여기서 0번방은 확정되었기 때문에 무시)
		// -찾아낸 최솟값 방이랑 1번 방이랑 자리를 바꿉니다.(그 자신이면 변경없이)
		// - 이하 반복.
		// int arr [] = {1,4,2,6,5,8,7,3};
		// for(int i = 0 ; i<arr.length-1 ; i++){
		// int min = arr[i];
		// int box = i;
		// for(int j = i+1; j < arr.length; j++){
		// if(min > arr[j]){//2
		// min = arr[j];
		// box = j; // 2
		// }
		// }
		// int tmp = arr[i];//4
		// arr[i] = arr[box];//4 == 2
		// arr[box] = tmp;//2 == 4
		// for(int k = 0; k < arr.length ; k++){
		// System.out.print(arr[k]);
		// }
		// System.out.println();
		// }
		//
		//
		// //로또
		int[] x = new int[6]; // 1.랜덤값을 6개의 방에 넣는다. 2. 중복된 값이 생성되면 1부터 다시 시작한다.
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[j] = (int) (Math.random() * 6 + 1); // 방에 6개의 값을 넣는다.
				for (int y = 0; y < j; y++) { // 방을 비교한다.0 - 안함. -1 0 , 2 - 01
					if (x[j] == x[y]) {
						j--;
						break;
					}
				}
			}
			for (int k = 0; k < x.length; k++) {
				System.out.print(x[k]);
				if (k != (x.length - 1)) {
					System.out.print(",");
				} else {
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}

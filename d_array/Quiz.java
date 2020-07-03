package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		// quiz1(); //거스름돈 동전 갯수
		// quiz2(); //그래프 그리기
		// quiz3(); //같은 숫자는 싫어
		quiz4(); // 나누어 떨어지는 숫자 배열
	}

	private static void quiz4() {
		int[] arr = new int[100];
		int[] arr2 = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		int na = (int) (Math.random() * 5) + 1;
		do {
			na = (int) (Math.random() * 5) + 1;
		} while (na == 1);
		System.out.println(na);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % na == 0) {
				arr2[i] = arr[i];
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr2[i] != 0) {
				count++;
			}
		}

		int[] arr3 = new int[count];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr2[j] != 0){
					arr3[i] = arr2[j];
					arr2[j] = 0;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(count);
		/*
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 */

	}

	private static void quiz3() {
		int[] arr = new int[10];
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				num++;
			}
		}
		int[] arr2 = new int[num];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] != 0) {
					arr2[i] = arr[j];
					arr[j] = 0;
					break;
				}
			}
		}
		System.out.println(num + Arrays.toString(arr2));
	}

	private static void quiz2() {
		int[] arr = new int[20];
		int[] arr2 = { 0, 0, 0, 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == j + 1) {
					arr2[j]++;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			int x = arr2[i];
			System.out.print(i + 1 + " : ");
			do {
				System.out.print("*");
				x--;
			} while (x != 0);
			System.out.println(" " + arr2[i]);
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

	private static void quiz1() {
		int money = (int) (Math.random() * 500) * 10;
		int[] coin = { 500, 100, 50, 10 };

		System.out.println("거스름돈 : " + money);
		for (int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원 : " + money / coin[i] + "개");
			money %= coin[i];
		}
	}

}

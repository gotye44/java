package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
//		quiz1(); //거스름돈 동전 갯수
		quiz2(); //그래프 그리기

	}

	private static void quiz2() {
		int[] arr = new int[20];
		int[] arr2 = { 0, 0, 0, 0, 0 };
		int[] arr3 = { 1, 2, 3, 4, 5 };
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
			System.out.print(i+1 + " : ");
			do{System.out.print("*");
			x--;	
			}while(x != 0);
			System.out.println(" " + arr2[i]);
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

	private static void quiz1() {
		int money = (int)(Math.random() * 500) * 10;
		int[] coin = { 500, 100, 50, 10 };
		
		System.out.println("거스름돈 : " + money);
		for(int i=0; i < coin.length; i++){
			System.out.println(coin[i] + "원 : " + money / coin[i] + "개");
			money %= coin[i];
			}
	}

}

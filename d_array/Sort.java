package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 정렬
		 *  - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 *  - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식 
		 *  - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 *  - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 */

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));

//		printRank(arr); // 석차 구하기
		selectSort(arr); // 선택정렬
//		bubbleSort(arr); // 버블정렬
//		insertSort(arr); // 삽입정렬
		System.out.println(Arrays.toString(arr));
	}

	private static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			int j = 0;
			for (j = i - 1; j >= 0; j--) {
				if (x < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}arr[j+1] =x;

		}

	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean changed = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int x = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = x;
					changed = true;
				}

			}System.out.println(changed);
			if (!changed) {
				break;

			}

		}

	}

	private static void selectSort(int[] arr) {
		
		for(int i = 0; i < arr.length-1; i++){
			int min = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[min]){
				min = j;}
			}
			int x = arr[i];
			arr[i]	= arr[min];
			arr[min] = x;
		}
		
	}

	private static void printRank(int[] arr) {

		int[] arr2 = new int[10]; // 새로운 배열생성
		int[] arr3 = new int[10];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 1;

		} // 새로운 배열에 모든값에 1추가
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++)
				if (arr[i] < arr[j]) {
					arr2[i]++;
				}
		}System.out.println(Arrays.toString(arr2));
//		for (int i = 0; i < arr2.length; i++) {
//			arr3[arr2[i] - 1] = arr[i];
//		}
//		for (int i = 1; i < arr2.length; i++) {
//			System.out.println(arr3[i-1] + "--" + i + "등 입니다.");
//		}

	}

}

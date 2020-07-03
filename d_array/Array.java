package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열 - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다. - 참조형 타입이다. - 인덱스로 값을 구분한다. - 길이를
		 * 변경 할 수 있다.
		 */

		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		// 배열 초기화시 기본값이 저장된다. 기본값 = 초기화시 기본적으로 설정되는 값 정수, 실수 타입의 경우 0, 불린 타입은
		// false, 캐릭터 타입은 0이지만 문자
		// 참조형 타입의 기본값은 null

		array = new int[] { 1, 2, 3, 4, 5 };

		// array = {1, 2, 3, 4, 5};
		// 선언과 초기화를 동시에 해야한다.
		int[] array2 = { 1, 2, 3, 4, 5 };

		System.out.println(array[0]); // 인덱스는 0부터 시작 즉 array[0]= 1
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("합계 : " + sum);

		// 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] array3 = new int[10];
		// 배열의 모든 인덱스에 1~100사이의 랜덤함 값을 저장해주세요.
		// 배열에 저장된 모든 값을 합계와 평균을 구해주세요.
		for (int i = 0; i < array3.length; i++) {
			array3[i] = (int) (Math.random() * 100) + 1;
			sum += array3[i];

		}
		System.out.println(Arrays.toString(array3)); // array 한번에 보기
		System.out.println("합계 : " + sum + " 평균 : " + (double) sum / 10);

		// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		int min = array3[0];
		int max = array3[0];
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] < min) {
				min = array3[i];
			}
			if (array3[i] > max) {
				max = array3[i];
			}
		}
		System.out.println(min + "+" + max);

		int[] shuffle = new int[10];
		int k = 0;

		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}

		for (int i = 0; i < shuffle.length; i++) {
			int j = (int) (Math.random() * shuffle.length);
			k = shuffle[0];
			shuffle[0] = shuffle[j];
			shuffle[j] = k;
		}
		// 1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] count = new int[10];
		for (int i = 0; i < 500; i++) {
			int random = (int)(Math.random()*10)+1;
			for (int j = 0; j < 10; j++) {
				if(random == j+1){count[j]++;
				}
			}
		}System.out.println("+"+Arrays.toString(count));
		
		
		//위 문제의 최솟값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("설정할 최솟값을 입력해주세요>");
		min = Integer.parseInt(sc.nextLine());
		System.out.println("설정할 최대값을 입력해주세요>");
		max = Integer.parseInt(sc.nextLine());
		System.out.println("설정할 반복횟수를 입력해주세요>");
		int sh = Integer.parseInt(sc.nextLine());
	
		int random;
		int[] na = new int[max-min+1];
	
		for (int i = 0; i < sh; i++) {
			do{random = (int)(Math.random()*max)+1;
			}while(random < min);			
			
			for (int j = 0; j < na.length; j++) {
				if(random == min+j){na[j]++;
				}
			}
		}
		System.out.println(Arrays.toString(na));
	
		int random2;
		int[] counts = new int[max-min+1];
		for(int i = 0; i < sh; i++){
			do{random2 = (int)(Math.random()*max)+1;
			}while(random2 < min);
			
			counts[random2-min]++;
			}
			
	
		for(int i = 0; i < counts.length; i++){
			System.out.println(i+1 + "의 반복횟수는 : " + counts[i]);	
		}
		

	}

}

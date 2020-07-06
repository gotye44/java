package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를 0~100까지 랜덤으로 생성해주시고, 아래와
		 * 같이 출력해주세요.
		 * 
		 * 국어 영어 수학 사회 과학 Oracle Java 합계 평균 석차 홍길동 90 90 90 90 90 90 90 630 90.0
		 * 1 홍길동 90 90 90 90 90 90 90 630 90.0 1 홍길동 90 90 90 90 90 90 90 630
		 * 90.0 1 홍길동 90 90 90 90 90 90 90 630 90.0 1 홍길동 90 90 90 90 90 90 90
		 * 630 90.0 1 과목합계 450 450 450 450 450 450 450 과목평균 90.00 90.00 90.00
		 * 90.00 90.00 90.00 90.00
		 */
		int[][] arr = new int[25][7];
		int[] sum = new int[25];
		double[] avg = new double[25];
		int[] rank = new int[25];
		int[] alsum = new int[7];
		double[] alavg = new double[7];
		int[][] arr2 = new int[25][10];
		String[] name = { "강지원", "김동민", "김동희", "김민지", "김용진", "김인혁", "김진용",
				"박범영", "박병규", "배현태", "심민규", "여인욱", "이나정","이승민", "이영섭", "이윤혜", "이지향",
				"임정혁", "임형묵", "장성보", "정선영", "정회립", "차경석", "최준영", "허지영" };
		
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 101);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
			avg[i] = Math.round(sum[i] / (double) arr[i].length * 100) / 100.0;
		}
		for (int i = 0; i < avg.length; i++) {
			for (int j = 0; j < avg.length; j++) {
				if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < avg.length; i++) {
			for (int j = 0; j < avg.length - 1; j++) {
				if (rank[i] < rank[j]) {
				 int temp = rank[i];
				 rank[i] = rank[j];
				 rank[j] = temp;
				 double temp2 = avg[i];
				 avg[i] = avg[j];
				 avg[j] = temp2;
				 int temp3 = sum[i];
				 sum[i] = sum[j];
				 sum[j] = temp3;
				 String temp4 = name[i];
					name[i] = name[j];
					name[j] = temp4;
				int[] temp5 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp5;
			}
		}}
		System.out.println("\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(sum[i] + "\t" + avg[i] + "\t" + rank[i]);
		}
		for (int i = 0; i < alsum.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				alsum[i] += arr[j][i];
			}
			alavg[i] = Math.round(alsum[i] / (double) name.length * 100) / 100.0;
		}
		System.out.print("과목합계\t");
		for (int i = 0; i < alsum.length; i++) {
			System.out.print(alsum[i] + "\t");
		}
		System.out.print("\n과목평균\t");
		for (int i = 0; i < alsum.length; i++) {
			System.out.print(alavg[i] + "\t");
		}
		System.out.println();

	}

}

package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		int b = 0;
		int o = 0;
		int num1 = (int) (Math.random() * 9) + 1;
		int num2 = (int) (Math.random() * 9) + 1;
		int num3 = (int) (Math.random() * 9) + 1;
		if (num1 == num2) {
			num2 = (int) (Math.random() * 9) + 1;
		}
		if (num1 == num3 || num2 == num3) {
			num3 = (int) (Math.random() * 9) + 1;
		}
		do {
			// System.out.println(num1 + "" + num2 + "" + num3);
			System.out.println("첫번째 숫자를 입력해주세요>>");
			int ans1 = Integer.parseInt(sc.nextLine());
			if (ans1 > 10) {
				do {
					System.out.println("!!한자리 숫자만 입력해주세요>");
					ans1 = Integer.parseInt(sc.nextLine());
				} while (ans1 > 10);
			}
			System.out.println("두번째 숫자를 입력해주세요>>");
			int ans2 = Integer.parseInt(sc.nextLine());
			if (ans1 == ans2) {
				do {
					System.out.println("!!중복된 숫자입니다. 다시 입력해주세요>");
					ans2 = Integer.parseInt(sc.nextLine());
				} while (ans1 == ans2 || ans2 > 10);
			} else if (ans2 > 10) {
				do {
					System.out.println("!!한자리 숫자만 입력해주세요>");
					ans2 = Integer.parseInt(sc.nextLine());
				} while (ans2 > 10);
			}
			System.out.println("세번째 숫자를 입력해주세요>>");
			int ans3 = Integer.parseInt(sc.nextLine());
			if (ans3 == ans1 || ans3 == ans2) {
				do {
					System.out.println("!!중복된 숫자입니다. 다시 입력해주세요>");
					ans2 = Integer.parseInt(sc.nextLine());
				} while (ans3 == ans2 || ans3 == ans1 || ans3 > 10);
			} else if (ans3 > 10) {
				do {
					System.out.println("!!한자리 숫자만 입력해주세요>");
					ans3 = Integer.parseInt(sc.nextLine());
				} while (ans3 > 10);
			}
			if (ans1 == num1) {
				s++;
			} else if (ans1 == num2 || ans1 == num3) {
				b++;
			} else {
				o++;
			}
			if (ans2 == num2) {
				s++;
			} else if (ans2 == num1 || ans2 == num3) {
				b++;
			} else {
				o++;
			}
			if (ans3 == num3) {
				s++;
			} else if (ans3 == num2 || ans3 == num1) {
				b++;
			} else {
				o++;
			}
			if (s == 3) {
				System.out.println("정답입니다!! 정답은 " + num1 + "" + num2 + ""
						+ num3 + "입니다.");
				break;
			} else {
				System.out.println(s + "S" + b + "B" + o + "O");
			}
			s = 0;
			b = 0;
			o = 0;
		} while (s != 3);

	}
}

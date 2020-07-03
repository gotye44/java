package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요(사칙연산)
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요>");
		int A = Integer.parseInt(sc.nextLine());
		System.out.println("연산자를 입력해주세요>");
		String B = sc.nextLine();
		System.out.println("숫자를 입력해주세요>");
		int C = Integer.parseInt(sc.nextLine());
		System.out.println((B.equals("+")  ? A + C : 
			(B.equals("-") ? A - C : 
				(B.equals("*") ? A * C :
					( B.equals("/") ? (double)A / C : "Error")))));

	}

}

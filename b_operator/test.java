package b_operator;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자>");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("연산자>");
		String op = sc.nextLine();
		System.out.println("두번째 숫자>");
		int y = Integer.parseInt(sc.nextLine());
		
		int result = op.equals("+") ? x + y
					: op.equals("-") ? x - y
							: op.equals("*") ? x * y
									: x / y;
		System.out.println(x + " " + op + " " + y  + " = " + result);
	}

}

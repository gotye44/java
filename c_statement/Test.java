package c_statement;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		int in1 = (int) (Math.random() * 9) + 1;
		int in2;
		int in3;
		do {
			in2 = (int) (Math.random()* 9) + 1;
		} while (in1 == in2);
		do {
			in3 = (int) (Math.random() * 9) + 1;
		} while (in3 == in2 || in3 == in1);
		System.out.println(in1 + "" + in2 + "" + in3);
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 숫자를 입력해주세요>");
		int count = 0;
		while(true){ int ans = Integer.parseInt(sc.nextLine());
		int a3 = ans%10;
		ans /=10;
		int a2 = ans%10;
		ans /=10;
		int a1 = ans;
		int s = 0;
		int b = 0;
		int o = 0;
		
		if(a1 == in1){s++;}
		if(a2 == in2){s++;}
		if(a3 == in3){s++;}
		if(a1 == in2 || a1 == in3){b++;}
		if(a2 == in1 || a2 == in3){b++;}
		if(a3 == in2 || a3 == in1){b++;}
		o = 3 - s - b;
		System.out.println(++count + "차 시도" + s + "S" + b + "B" + o + "O");
		if(s==3){System.out.println("정답입니다!!");
				break;}}
		}

}

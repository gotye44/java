package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문 - if문 - switch문
		 * 
		 * if문 - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. - else if(조건식){} :
		 * 다수의 조건이 필요할때 if 뒤에 추가한다. - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해
		 * 추가한다.
		 */

		int a = 1;

		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a == 0) {
			System.out.println("조건식의 연산결과가 false면 수행되지 않는다.");
		}

		if (a == 1) {
			System.out.println("a가 1인 경우에 하고싶은 것");
		} else if (a == 2) {
			System.out.println("a가 2인 경우에 하고싶은 것");
		} else if (a == 3) {
			System.out.println("a가 3인 경우에 하고싶은 것");
		} else {
			System.out.println("이외의 경우에 하고싶은 것");
		}

		// 조건을 한묶음으로 사용하기 위해서는 반드시 else if 를 사용해야 한다.
		if (a < 10) {
			System.out.println("a가 10보다 작다.");
		} else if (a < 20) {
			System.out.println("a가 20보다 작다.");
		}

		// 시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 60;
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 성적에 등급을 부여하는 프록그램을 작성해주세요.
		score = 80;
		String grade = null;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else if (score >= 50) {
			grade = "E";
		} else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");

		score = 87;
		grade = null;
		// 정렬 : Ctrl + Shift + f
		if (100 < score) {
			grade = "error";
		} else if (90 <= score) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (80 <= score) {
			grade = "B";
			if (87 <= score) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (70 <= score) {
			grade = "C";
			if (77 <= score) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (60 <= score) {
			grade = "D";
			if (67 <= score) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else if (50 <= score) {
			grade = "E";
			if (57 <= score) {
				grade += "+";
			} else if (score <= 53) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");

		/*
		 * switch문 - switch(int/String){case 1: break;} - 조건식의 결과는 정수와
		 * 문자열만(JDK1.7부터 문자열 허용) 허용한다. - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */

		a = 29;
		switch (a) {
		case 30:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고싶은 것");
			break;
		case 29:
			System.out.println("a가 3인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("a가 1, 2, 3이 아닌 경우에 하고싶은 것");
		}

		String b = "c";
		switch (b) {
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은것");
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은것");
			break;
		default:
			System.out.println("b가\"a\",\"b\"가 아닌 경우에 하고싶은것");
		}

		// 주어진 월에 해당하는 계절을 출력해봅시다.

		int month = 1;

		String season = null;

		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은 " + season + "입니다.");

		score = 100;
		grade = null;
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default:
			grade = "F";
		}
		System.out.println(score + "점에 대한 등급은 " + grade + "입니다.");
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		Scanner s = new Scanner(System.in);
		
//		System.out.println("숫자입력>");
//		int input = Integer.parseInt(s.nextLine());
//		if(input == 0){
//			System.out.println("0 입니다.");
//		}else{
//			System.out.println("0이 아닙니다.");
//		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
//		if(input % 2 == 0){
//			System.out.println("짝수입니다.");
//		}else{
//			System.out.println("홀수입니다.");
//		}
//		
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		
//		System.out.println("숫자입력>");
//		int one = Integer.parseInt(s.nextLine());
//		System.out.println("숫자입력>");
//		int two = Integer.parseInt(s.nextLine());
//		System.out.println("숫자입력>");
//		int thr = Integer.parseInt(s.nextLine());
//		
//		int sum = one + two + thr;
//		double avg = sum / 3.0;
//		String abc = null;
//				
//		if (100 < avg) {
//			abc = "error";
//		} else if (90 <= avg) {
//			abc = "A";
//			if (97 <= avg) {
//				abc += "+";
//			} else if (avg <= 93) {
//				abc += "-";
//			}
//		} else if (80 <= avg) {
//			abc = "B";
//			if (87 <= avg) {
//				abc += "+";
//			} else if (avg <= 83) {
//				abc += "-";
//			}
//		} else if (70 <= avg) {
//			abc = "C";
//			if (77 <= avg) {
//				abc += "+";
//			} else if (avg <= 73) {
//				abc += "-";
//			}
//		} else if (60 <= avg) {
//			abc = "D";
//			if (67 <= avg) {
//				abc += "+";
//			} else if (avg <= 63) {
//				abc += "-";
//			}
//		} else if (50 <= avg) {
//			abc = "E";
//			if (57 <= avg) {
//				abc += "+";
//			} else if (avg <= 53) {
//				abc += "-";
//			}
//		} else {
//			abc = "F";
//		}
//		System.out.println("당신의 점수 합계 : " + sum + " 평균 : "+ avg + " 등급 : " + abc + " 입니다.");
//		
		
		//숫자 3개를 입력받아 오름차순으로 출력해주세요.
		
		System.out.println("숫자입력>");
		int num1 = Integer.parseInt(s.nextLine());
		System.out.println("숫자입력>");
		int num2 = Integer.parseInt(s.nextLine());
		System.out.println("숫자입력>");
		int num3 = Integer.parseInt(s.nextLine());
		
		if(num1 > num2){
			int temp = num1; 
			num1 = num2; 
			num2 = temp; 
		}
		if(num1 > num3){
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2 > num3){
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}System.out.println(num1 + "<" + num2 + "<" + num3);
	}

}

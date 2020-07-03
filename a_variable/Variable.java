package a_variable;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		//클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.
		
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용한다.)
		
		//한줄 주석 : Ctrl + Shift + c
		/*범위 주석 : Ctrl + Shift + /(해제 : \)*/
		
		/*
		 * 데이터의 종류
		 * - 정수 : 10, -5
		 * - 실수 : 3.14, -1.5
		 * - 문자 : 'a', '3'
		 * - 논리 : true, false
		 * 
		 * 프로그래밍 언어의 기준으로 데이터의 종류를 나눠 놓은것  : 자료형(data type)
		 * 
		 * 기본형 타입
		 * - 정수 : byte(1), short(2), int(4), long(8)
		 * - 실수 : float(4), double(8)  실수는 근사치를 표현 double이 좀더 정확하기 때문에 double을 많이 사용한다.
		 * - 문자 : char(2)
		 * - 논리 : boolean(1)
		 * 
		 * 변수를 만들때 타입을 사용한다.
		 * 데이터를 다룰때 일반적으로 변수라는 그릇에 담아서 사용한다.
		 */
		
		//변수 : 하나의 데이터를 담을 수 있는 그릇
		int name; //변수 선언 : 변수를 만드는 것
		double name2; //한 블럭안에서 변수의 이름은 중복될 수 없다.
		//다른 블럭 안에서는 같은 이름을 사용할 수 있다. 중괄호 ({})= 블럭
		
		//=(대입연산자) : 오른쯕의 값을 왼쪽의 변수에 저장
		name = 10; //초기화 : 변수에 처음으로 값을 저장하는 것
		name2 = 2.5; //변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30; //보통 선언과 초기화를 동시에 한다.
		long ㅣ = 40L; //접미사 L을 붙여야 long타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다.
		char c = '한'; //따옴표안에 한글자만 넣어야 한다.
		boolean b = true; //true | false만 저장할 수 있다.
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		byte _byte = 10;
		short _short = 20;
		int _int = 30;
		long _long = 40L;
		float _float = 3.14f;
		double _double = 3.14;
		char _char = 'A';
		boolean _boolean = false;
		
		System.out.println(name);
		//실행 : Ctrl + F11
		
		name = 100; //변수에는 하나의 값만 저장할 수 있다. 새로운 값 잆력시 새로운 값만을 저장한다.
		System.out.println(name);
		
		//위에서 만든 8개의 변수에 새로운 값을 저장하고 출력해주새요.
		_byte = 20;
		_short = 10;
		_int = 40;
		_long = 30L;
		_float = 4.13f;
		_double = 4.13;
		_char = 'B';
		_boolean = true;
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);
		
		/*
		 * 타입의 선택 기준
		 * 
		 * 정수
		 * - byte(-128~127), short(-30000~30000) : 메모리를 절약해야 할때
		 * - int(-20억~20억) : 기본(컴퓨터 연산시 기본적으로 4byte를 가지고 연산을 함. 다른 타입으로 진행시 int로 변환해서 사용하기 때문에  int가 속도가 가장빠르다.)
		 * - long(약 900경) : int의 범위를 벗어날 때
		 * 
		 * 실수
		 * - float(앞에서부터 7자리의 숫자까지만 정확) : 메모리를 절약해야 할때
		 * - double(앞에서부터 15자리의 숫자까지만 정확) : 기본
		 */
		
		//문자열
		String str = "문자 여러개...";
		System.out.println(str);
		
		//형변환
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환(type casting)이라 한다.
		int small = 10;
		long big = 10L;
		
		small = (int)big; //형변환 int괄호를 넣어줘야함
		big = small; //표현범위가 작은쪽에서 큰쪽으로의 형변환은 생략이 가능하다.
		
		/*
		 * 명명규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어(=진한글씨, keyword)는 사용할 수 없다.
		 * - [변수와 메소드는 낙타식 표기법을 사용한다.(mySampleVariable)] 변수의 앞글자는 소문자가 들어가고 단어가 여러개인경우 뒷단어의 첫번째 문자만 대문자로 표기한다. 
		 * - [클래스명의 첫글자는 대문자로 한다.(MySampleClass)]
		 */
		/*
		 * 상수
		 * - 처음 담긴 값을 변경 할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 * - 변수에 final을 붙여 주면 상수가된다
		 * - 상수라는걸 알기위해 상수의 이름을 붙여줄땐 대문자로만 붙여준다.
		 * - 단어사이 구분은 _를 이용한다.
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; 상수에 다른 값을 부여하려고 할 시 컴파일 에러 발생
		
		//출력
		System.out.print("줄바꿈을 하지 않는다.\n"); //println은 출력후 줄바꿈을 한다. (\n 을 넣어주면 줄바꿈을 할 수 있다.)
		System.out.print("줄바꿈을 하\t지 않는다."); //(\t는 탭을 한다.)
		System.out.println("줄바꿈을 한다." + name); //내용을 추가하고 싶을때 '+'를 사용한다.
		System.out.printf("문자열 : %s, 숫자 : %d","Hello", 10); //출력 포맷을 지정한다.
		//%s = 문자열, %d = 숫자
		System.out.println("/n가나다");
		
		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
//		//import 단축키 : Ctrl + Shift + o
		System.out.println("\n아무거나 입력해주세요>");
		String str2 = sc.nextLine();
		System.out.println(str2);
		//입력을 받게되면 사용자가 입력 할 때까지 프로그램이 멈추게 된다.
		//내용을 입력 후 엔터를 치면 입력이 종료되고 프로그램이 다시 진행된다.
		
//		int nextInt = sc.nextInt();
//		double nextDouble = sc.nextDouble();
		//이런것들이 있지만 버그로 인해 사용하지 않는다.
		
//		System.out.println("int 입력>");
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
//		System.out.println("문자열 입력>");
//		String nextLine = sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력 끝!");
		
		System.out.println("int 입력>");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println(number);
		
		//자신의 이름을 저장할 변수를 선언해주세요.
		System.out.println("자신의 이름을 적어주세요>");
		String myName= sc.nextLine();
		
		//자신의 나이를 저장할 변수를 선언해주세요.
		System.out.println("자신의 나이를 적어주세요>");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름 : " + myName + " / 나이 : " + age);
	}

}
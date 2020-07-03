package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int te1 = 0;
		System.out.println("때로는 이미 배가 찼는데도 밥, 빵 과자 등을 계속 먹는다. Y/N");
		String te2 = sc.nextLine();
		
		if(te2.equals("Y")){te1++;
		}
		System.out.println("사촌 이내 친척 중 비만, 고혈압, 당뇨병, 심장병을 앓는 분이 있다. Y/N");
		te2 = sc.nextLine();
		
		if(te2.equals("Y")){te1++;
		}
		System.out.println("스트레스를 받으면 자꾸 무언가 먹고 싶어진다. Y/N");
		te2 = sc.nextLine();
		
		if(te2.equals("Y")){te1++;
		}
		System.out.println("커피믹스를 하루 한 잔 이상 타서 먹는다. Y/N");
		te2 = sc.nextLine();
		
		if(te2.equals("Y")){te1++;
		}
		System.out.println("커피에 설탕이나 시럽을 꼭 넣어 먹는다. Y/N");
		te2 = sc.nextLine();
		
		if(te2.equals("Y")){te1++;
		}
		System.out.println("현미 밥보다 흰쌀 밥을 더 좋아한다. Y/N");
		te2 = sc.nextLine();
		
		if(te2.equals("Y")){te1++;
		}
		System.out.println("술자리에서 냉면이나 된짱지개+밥 등 식사를 따로 시킨다. Y/N");
		te2 = sc.nextLine();
		
		if(te2.equals("Y")){te1++;
		}
		System.out.println("야식을 주 3회 이상 먹는다. Y/N");
		te2 = sc.nextLine();
		
		if(te2.equals("Y")){te1++;
		}
		System.out.println("식사한 뒤 디저트를 먹는다. Y/N");
		te2 = sc.nextLine();
		
		if(te2.equals("Y")){te1++;
		}
		System.out.println("집밥을 먹기보다 외식을 하는 편이다. Y/N");
		te2 = sc.nextLine();
		if(te2.equals("Y")){te1++;
		}
		
		if(te1 > 7){
			System.out.println("탄수화물 중독으로 볼 수 있음");
		}else if(te1 > 3){
			System.out.println("탄수화물 중독 위험");
		}else{
			System.out.println("탄수화물 중독에 걸릴 위험이 있는정도");
		}

	}

}

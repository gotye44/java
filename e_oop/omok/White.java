package e_oop.omok;

import e_oop.ScanUtil;

public class White {
	Pan pan = new Pan();
	void white(){
		int x;
		int y;
		do{System.out.println("백돌 차례입니다.");
		do{System.out.println("X좌표를 입력해주세요(0~8)>");
		x = ScanUtil.nextInt();}
		while(x < 0 || x > 9);
		do{System.out.println("Y좌표를 입력해주세요>(0~9)");
		y = ScanUtil.nextInt();}
		while(y < 0 || y > 8);}
		while(pan.pan[y][x] == "○ " || pan.pan[y][x] == "● " );
		pan.pan[y][x] = "○ ";
	}
	
}

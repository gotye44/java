package e_oop.omok;

public class Omok {

	public static void main(String[] args) {
		Pan pan = new Pan();
		Black black = new Black();
		White white = new White();
		Check check = new Check();
		
		
		pan.showPan();
		while(true){
		black.black();
		pan.showPan();
		check.blackCheck();
		if(check.bkwin == true){
			System.out.println("흑돌이 이겼습니다!!");
			break;
		}
		white.white();
		pan.showPan();
		
		}
	}

}

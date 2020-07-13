package e_oop.omok;

public class Check {
	Pan pan = new Pan();
	String bk = "● ";
	boolean bkwin;
	void blackCheck(){
		for(int i = 0; i < pan.pan.length; i++){
			int ck = 0;
		for(int j = 0; j < pan.pan[i].length; j++){
			if(pan.pan[i][j] == bk){
				ck++;
				System.out.println(ck);
			}else{ck = 0;}
			if(ck > 2){
				bkwin = true;
				break;
			}
		}
		
	}
		for(int i = 0; i < pan.pan[i].length; i++){
			int ck = 0;
		for(int j = 0; j < pan.pan.length; j++){
			if(pan.pan[j][i] == bk){
				ck++;
				System.out.println(ck);
			}else{ck = 0;}
			if(ck > 2){
				bkwin = true;
				break;
			}
		}
		
	}
		
	}	
	}

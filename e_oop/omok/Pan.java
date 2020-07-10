package e_oop.omok;

public class Pan {

	public static void main(String[] args) {
//		System.out.println("X 0 1 2 3 4 5 6 7 8 9 Y");
//		System.out.print("  ┌ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┐");
//		System.out.println(" 0");
//		System.out.print("  | ┼ ┼ ┼ ┼ ┼ ┼ ┼ ┼ |");
//		System.out.println(" 1");
//		System.out.print("  | ┼ ┼ ┼ ┼ ┼ ┼ ┼ ┼ |");
//		System.out.println(" 2");
//		System.out.print("  | ┼ ┼ ┼ ┼ ┼ ┼ ┼ ┼ |");
//		System.out.println(" 3");
//		System.out.print("  | ┼ ┼ ┼ ┼ ┼ ┼ ┼ ┼ |");
//		System.out.println(" 4");
//		System.out.print("  | ┼ ┼ ┼ ┼ ┼ ┼ ┼ ┼ |");
//		System.out.println(" 5");
//		System.out.print("  | ┼ ┼ ┼ ┼ ┼ ┼ ┼ ┼ |");
//		System.out.println(" 6");
//		System.out.print("  | ┼ ┼ ┼ ┼ ┼ ┼ ┼ ┼ |");
//		System.out.println(" 7");
//		System.out.print("  └ ┴ ┴ ┴ ┴ ┴ ┴ ┴ ┴ ┘");
//		System.out.println(" 8");
		
		Pan pa = new Pan();
		pa.black();
	
	
	}
	String[][] pan;
	Pan() {
		pan[0][0] = "  ┌ ";
		pan[0][9] = "┐";
		pan[8][0] = "  └ ";
		pan[8][9] = "┘";
		for (int i = 1; i < pan.length; i++) {
			pan[0][i] = "┬ ";
		}
		for (int i = 1; i < pan.length; i++) {
			pan[8][i] = "┴ ";
		}

		for (int i = 1; i < pan.length - 1; i++) {
			for (int j = 0; j < pan[i].length; j++) {
				if(j == 0){
					pan[i][j] = "  | ";
				}
				else if(j == 9){
					pan[i][j] = "| ";
				}
				else{
					pan[i][j] = "┼ ";
				}
			}
		}
	}

	void black() {
		for (int i = 0; i < pan.length; i++) {
			for (int j = 0; j < pan[i].length; j++) {
				System.out.print(pan[i][j]);
			}
			System.out.println();
		}
	}

	void white() {

	}

}

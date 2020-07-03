package d_array;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] aa= new int[10];
		for(int i = 0; i < aa.length; i++){
			aa[i] = (int)(Math.random()*100)+1;
		}System.out.println(Arrays.toString(aa));
		
		for(int i = 0; i < aa.length-1; i++){
			boolean ch = false;
			for(int j = 1; j < aa.length -i-1; j++){
				if(aa[j-1] > aa[j]){
					int x = aa[j-1];
					aa[j-1] = aa[j];
					aa[j] = x;
					ch = true;
				}
				}System.out.println(ch);
				if(!ch){
					break;
			}
		}System.out.println(Arrays.toString(aa));
		
		
		
		
		
//		private static void bubbleSort(int[] arr) {
//			for (int i = 0; i < arr.length - 1; i++) {
//				boolean changed = false;
//				for (int j = 0; j < arr.length - i - 1; j++) {
//					if (arr[j] > arr[j + 1]) {
//						int x = arr[j];
//						arr[j] = arr[j + 1];
//						arr[j + 1] = x;
//						changed = true;
//					}
//
//				}System.out.println(changed);
//				if (!changed) {
//					break;

					}

}

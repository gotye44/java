package d_array;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[20];
		int[] temp = new int[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			boolean dupl = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == temp[j]) {
					dupl = true;
				}
			}
			if(!dupl){
				temp[count++] = arr[i];
				}
			}
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
	}

}

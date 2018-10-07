package app.array.sort;

import app.util.logic.ArrayUtil;

public class InsertionSortLogic {
	public static void main(String[] args) {
		int[] numArray = {3, 9, 4, 7, 2, 5, 1 ,8 ,0, 6 };
		System.out.println(ArrayUtil.toString(numArray));
		insertionSort(numArray);
		System.out.println(ArrayUtil.toString(numArray));
	}
	
	private static void insertionSort(int[] numArray) {
		for(int j=1;j<numArray.length;j++) {
			int key = numArray[j];
			int i = j -1;
			while(i>=0 && numArray[i]>key) {
//				ArrayUtil.printIndexNumberString(numArray,i);
				numArray[i+1]= numArray[i];
				i--;
//				System.out.println(ArrayUtil.toString(numArray));
			}
			numArray[i+1] = key;
//			ArrayUtil.printIndexNumberString(numArray, i+1);
		}
	}

}

package app.array.sort;

import app.util.logic.*;

/*バブルソートって何者？
 * 簡単に言うと、ある配列の末尾と末尾−１の数を比較しソートしていくアルゴリズムです。
 * 
 */
public class BubbleSortLogic {
	public static void main(String[] args) {
		String line="93 88 96 74 76 32 46 90 37 54";
		int[] numArray = ArrayUtil.parseInt(ArrayUtil.getSplitLine(line));
//		for(int i=0;i<numArray.length;i++) {
//			System.out.println(numArray[i]);
//		}
		System.out.println(ArrayUtil.toString(numArray));
		bubbleSort(numArray);
		System.out.println(ArrayUtil.toString(numArray));
	}
	/*
	 * 整数配列を照準に並べ換える
	 */
	private static void bubbleSort(int[] numArray) {
		int count = 0;
		for (int i=0;i<numArray.length-1;i++) {
//			System.out.println("ラウンド:i="+i);
			for(int j = numArray.length-1;j>i;j--) {
//				System.out.println("ラウンドi:"+i+"のjループ"+(numArray.length-j-1)+"回目");
				if(numArray[j-1]>numArray[j]) {
//					System.out.println("numArray["+(j-1)+"]>numArray["+j+"]なので交換");
					int tmpNum = numArray[j-1];
					numArray[j-1] = numArray[j];
					numArray[j]= tmpNum;
//					System.out.println("numArray["+j+"]は"+numArray[j]+"に、"
//							+ "numArray["+(j-1)+"]は"+numArray[j-1]+"に");
					count++;
				}
			}
//			System.out.println("ラウンド"+i+"終了.変更後の配列は"+toString(numArray));
		}
	}
}

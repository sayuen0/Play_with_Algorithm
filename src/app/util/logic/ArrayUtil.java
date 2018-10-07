package app.util.logic;
/*
 * 配列を作ったり型変換したり操作したりするユーティリティクラスです
 */
public class ArrayUtil {
	//空白の空いた文字列から配列を作る
	public static String[] getSplitLine(String line) {
		return line.split("\\s");
	}
	
	//文字列の配列からintの配列を作る
	public static int[] parseInt(String[] line) {
		int[] numArray = new int[line.length];
		for(int i =0; i<line.length;i++) {
			numArray[i] = Integer.parseInt(line[i]);
		}
		return numArray;
	}
	
	/*
	 *整数の配列を受け取って、その要素を横に並べた文字列を返す
	 */
	public static String toString(int[] numArray) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i=0;i<numArray.length;i++) {
			stringBuffer.append(numArray[i]+" ");
		}
		return stringBuffer.toString();
		
	}

	/*
	 * 配列とインデックスを受け取ったら、"numArray[index] = 値"の文字列を表示する
	 */
	public static void printIndexNumberString(int[] numArray, int index) {
		System.out.println("numArray["+index+"]="+numArray[index]); ;
	}
}

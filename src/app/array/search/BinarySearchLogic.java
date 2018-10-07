package app.array.search;

public class BinarySearchLogic {
	public static int binarySearch(int[] array, int key) {
		int pLeft = 0;
		int pRight = array.length - 1;

		do {
			int center = (pLeft + pRight) / 2;

			if (array[center] == key) {
				System.out.println("keyは["+center+"]にあります");
				return center;
			} else if (array[center] < key){
				pLeft = center + 1; //真ん中の一つ右側を左端とする
			} else {
				pRight = center - 1;
			}
		} while (pLeft <= pRight);

		return -1;
	}
	public static void main(String[] args) {
		int[] array = {1,4,27,64,1225,46656,823543,16777216};
		
		System.out.println("対象の配列は以下のとおりです");
		for(int i=0;i<array.length;i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ",");
			} else {
				System.out.println(array[i]);
			}
		}
		binarySearch(array, 1225);
	}

}
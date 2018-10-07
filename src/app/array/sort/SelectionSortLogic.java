package app.array.sort;
/*
 * 選択ソートとは
 * 
 */
public class SelectionSortLogic {
	
	
	public static void main(String[] args) {
	    int[] n = {3, 9, 4, 7, 2, 5, 1, 8, 0, 6};
       selectionSort(n);
     //   sort(new int[]{5,3,9,8,5});
	}
	
	 private static void selectionSort(int[] n) {
		 System.out.println("最初の配列");
		 printArray(n);
	        for(int i = 0; i < n.length-1; i++) {
	            int index = i;
//	            System.out.println("i=index="+i);
//	            System.out.println("n["+index+"]:"+n[index]+"を軸に考える");
	            for(int j = i + 1; j < n.length; j++) {
//	            	 System.out.println("jループ"+j+"回目,n["+j+"]="+n[j]);
	                if(n[j] < n[index]) {
//	                	System.out.println("n["+j+"],つまり現状の配列の最小値はインデックス"+j+"番目の"+n[j]);
	                	index = j;  	
	              //TODO いらなかったら消す  System.out.println("n[index],つまり元の配列の"+index+"番目は"+n[index]);
		              
	                }
	               
	            }
//	            System.out.println((i+1)+"ラウンド目のjループ終了,最小値のあるインデックス:"+index);
	     
	            if(i != index) {
	                int tmp = n[index];
	                n[index] = n[i];
	                n[i] = tmp;
//	                System.out.println("i="+i+",最小のindex="+index+"の、値の交換が起こって、"
//	                		+ "n["+i+"]は"+n[i]+"に、n["+index+"]は"+n[index]+"になった");
	            }else {
//	            	System.out.println("ラウンド番号i:"+i+"と最小インデックス:"+index+"が同じなので交換がスルーされた");
	            }
//	            System.out.println((i+1)+"ラウンド目の交換後の配列の中身");
				printArray(n);
	        }
	    }
	
	private static void printArray(int[] n) {
        for(int i: n) System.out.print(i + " ");
        System.out.println();
    }

}

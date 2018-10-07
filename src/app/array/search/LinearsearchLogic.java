package app.array.search;
import java.util.*;
public class LinearsearchLogic {

	public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	        int a[] = {66,2,10,43,45,52,73,65,12,39,97,76,83,11,57,63};
	        System.out.print("データを入力して下さい: ");
	        int x  = sc.nextInt();
	        int pos = -1;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == x) {
	                pos = i;
	                break;
	            }
	        }
	        if (pos < 0) {
	            System.out.println("見つかりません");
	        } else {
	            System.out.println(x + "は" + pos + "番目です");
	        }
	    }

}

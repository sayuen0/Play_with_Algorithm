package app.array.sort;

public class HeapSortLogic {
	  public int[] heap;		// データの配列
	  public int num;		// 現在の要素数
	  int target;			// 現在の着目ライン
	  
	  public static void main(String[] args) {
		
	}

	  /*
	   * 挿入
	   */
	  public void insert(int a){
	    heap[num++]=a;
	    int i=num,j=i/2;
	    while(i>1 && heap[i-1]<heap[j-1]){
	      int t=heap[i-1];
	      heap[i-1]=heap[j-1];
	      heap[j-1]=t;
	      i=j;
	      j=i/2;
	    }
	  }

	  /*
	   * 先頭の要素を取り除き、返す
	   */
	  public int deletemin(){
	    int r=heap[0];
	    heap[0]=heap[--num];
	    int i=1,j=i*2;
	    while(j<=num){
	      if(j+1<=num && heap[j-1]>heap[j]) j++;
	      if(heap[i-1]>heap[j-1]){
		int t=heap[i-1];
		heap[i-1]=heap[j-1];
		heap[j-1]=t;
	      }
	      i=j;
	      j=i*2;
	    }
	    return r;
	  }

	  /*
	   * ソート
	   */
	  public void sort(int[] a){

	    // 必要なヒープ用配列を確保します
	    heap=new int[a.length];
	    num=0;

	    // ヒープに要素を追加します
	    for(target=0;target<a.length;target++)
	      insert(a[target]);

	    // ヒープから取り出しながら配列に格納します。
	    for(target=0;num>0;target++)
	      a[target]=deletemin();
	  }
}

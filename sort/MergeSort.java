package sort;

/**
 * 
 * @author NJ
 * 自顶向上->化整为零
 *sort()的作用在于安排多次merge()调用的正确顺序
 *稳定
 *任何情况下，T（N）=O（NlogN）
 */
/**public class MergeSort{
    private static int[] aux;                                    //所需的辅助数组
    public void sort(int[] arr) {                         //一次性分配空间
        aux = new int[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int lo, int hi) {
    	if(lo==hi)
    		return;
    	if(lo < hi){
        	int mid = (lo+hi)/2;
        	sort(arr,lo,mid);                             //将左半边排序
        	sort(arr,mid+1,hi);                           //将右半边排序
        	merge(arr,lo,mid,hi);                         //归并排序
        }
    }

    public void merge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (a[i] <= a[j])
                aux[k++] = a[i++];
            else
                aux[k++] = a[j++];
        }

        while (i <= mid)
            aux[k++] = a[i++];

        while (j <= high)
            aux[k++] = a[j++];

        for (i = low; i <= high; i++) {
            a[i] = aux[i];
        }
    }
    public static void main(String[] args){
    	MergeSort ms = new MergeSort();
    	int[] a = {6,2,5,8,7,3,4,1};
    	ms.sort(a);
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" ");
    	}
    }
}
*/
/**
 * 自底向下->循序渐进
 * 比较适合链表，并且能将链表原地排序（无需创建新的链表节点）
 */
public class MergeSort{
	private static int[] aux;           //归并所需的辅助数组
	
	private static void sort(int[] a){
		int len = a.length;
		aux = new int[len];
		for(int sz=1;sz<len;sz+=sz){    //sz子数组的大小
			for(int lo=0;lo<len-sz;lo+=sz+sz)
				merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1, len-1));
			
		}
	}

	private static void merge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (a[i] <= a[j])
                aux[k++] = a[i++];
            else
                aux[k++] = a[j++];
        }

        while (i <= mid)
            aux[k++] = a[i++];

        while (j <= high)
            aux[k++] = a[j++];

        for (i = low; i <= high; i++) {
            a[i] = aux[i];
        }
    }
	public static void main(String[] args){
    	int[] a = {6,2,5,8,7,3,4,1};
    	sort(a);
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" ");
    	}
	}
}

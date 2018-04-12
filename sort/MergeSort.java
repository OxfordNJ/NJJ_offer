package sort;

/**
 * 
 * @author NJ
 * �Զ�����->����Ϊ��
 *sort()���������ڰ��Ŷ��merge()���õ���ȷ˳��
 *�ȶ�
 *�κ�����£�T��N��=O��NlogN��
 */
/**public class MergeSort{
    private static int[] aux;                                    //����ĸ�������
    public void sort(int[] arr) {                         //һ���Է���ռ�
        aux = new int[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int lo, int hi) {
    	if(lo==hi)
    		return;
    	if(lo < hi){
        	int mid = (lo+hi)/2;
        	sort(arr,lo,mid);                             //����������
        	sort(arr,mid+1,hi);                           //���Ұ������
        	merge(arr,lo,mid,hi);                         //�鲢����
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
 * �Ե�����->ѭ�򽥽�
 * �Ƚ��ʺ����������ܽ�����ԭ���������贴���µ�����ڵ㣩
 */
public class MergeSort{
	private static int[] aux;           //�鲢����ĸ�������
	
	private static void sort(int[] a){
		int len = a.length;
		aux = new int[len];
		for(int sz=1;sz<len;sz+=sz){    //sz������Ĵ�С
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

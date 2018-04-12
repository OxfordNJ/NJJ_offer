package sort;

public class QuickSort {

	public static void quickSort(int[] arr){
	    qsort(arr, 0, arr.length-1);
	}
	private static void qsort(int[] arr, int low, int high){
	    if (low < high){
	        int pivot=partition(arr, low, high);        //�������Ϊ������
	        qsort(arr, low, pivot-1);                   //�ݹ�������������
	        qsort(arr, pivot+1, high);                  //�ݹ�������������
	    }
	}
	private static int partition(int[] arr, int low, int high){
	    int pivot = arr[low];     //�����¼
	    while (low<high){
	        while (low<high && arr[high]>=pivot) --high;
	        arr[low]=arr[high];             //����������С�ļ�¼�����
	        while (low<high && arr[low]<=pivot) ++low;
	        arr[high] = arr[low];           //����������С�ļ�¼���Ҷ�
	    }
	    //ɨ����ɣ����ᵽλ
	    arr[low] = pivot;
	    //���ص��������λ��
	    return low;
	}
	
	
	public static void main(String[] args){
		int a[] = new int[] {6,2,5,8,7,3,4,1};
	    quickSort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}

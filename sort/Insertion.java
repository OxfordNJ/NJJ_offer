package sort;

/**
 * ��n���������Ԫ�ؿ���Ϊһ��������һ���������ʼʱ�������ֻ����1��Ԫ�أ�
 * ������а�����n-1��Ԫ�أ����������ÿ�δ��������ȡ����һ��Ԫ�أ�
 * �������뵽������е��ʵ�λ�ã�ʹ֮��Ϊ�µ������
 * �ظ�n-1�ο����������̡�
 * ��������Ҫ�� N��/2 �αȽϺ͡� N��/2 �ν����� ����������Ҫ N-1�αȽϺ� 0 �ν�����
 * 
 * @author NJ
 *
 */

/**public class Insertion {
	public static void sort(Comparable[] a){
		int len = a.length;
		for(int i=1;i<len;i++){      //��a[i]���뵽a[i-1],a[i-2],a[i-3],...��ȥ
			for(int j=i;j>0&&less(a[j],a[j-1]);j--){
				exch(a,j,j-1);
			}
		}
	}
	public static boolean less(Comparable v,Comparable w){
		return v.compareTo(w) < 0;
	}
	public static void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void main(String[] args){
		String[] a = {"e","g","a","m"};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
*/
public class Insertion {
	public static void sort(Comparable<Integer>[] a){
		int len = a.length;
		for(int i=1;i<len;i++){      //��a[i]���뵽a[i-1],a[i-2],a[i-3],...��ȥ
			for(int j=i;j>0&&less(a[j],a[j-1]);j--){
				exch(a,j,j-1);
			}
		}
	}
	public static boolean less(Comparable v,Comparable w){
		return v.compareTo(w) < 0;
	}
	public static void exch(Comparable<Integer>[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void main(String[] args){
		Integer[] a = {3,6,1,5,7,0,7};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
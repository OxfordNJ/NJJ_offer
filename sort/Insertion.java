package sort;

/**
 * 把n个待排序的元素看成为一个有序表和一个无序表。开始时有序表中只包含1个元素，
 * 无序表中包含有n-1个元素，排序过程中每次从无序表中取出第一个元素，
 * 将它插入到有序表中的适当位置，使之成为新的有序表，
 * 重复n-1次可完成排序过程。
 * 最坏情况下需要～ N方/2 次比较和～ N方/2 次交换， 最好情况下需要 N-1次比较和 0 次交换。
 * 
 * @author NJ
 *
 */

/**public class Insertion {
	public static void sort(Comparable[] a){
		int len = a.length;
		for(int i=1;i<len;i++){      //将a[i]插入到a[i-1],a[i-2],a[i-3],...中去
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
		for(int i=1;i<len;i++){      //将a[i]插入到a[i-1],a[i-2],a[i-3],...中去
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
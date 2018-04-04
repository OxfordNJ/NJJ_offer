package sort;

/**
 * 
 * @author NJ
 * 
 *0-N-1的任意i都会进行一次交换和N-i-1次比较，
 *因此总共有 N次交换以及 (N-1)+(N-2)+...+2+1=N(N-1)/2 ～ N方/2 次比较
 */

/**public class Selection {
	public static void sort(Comparable<Integer>[] a){
		int len = a.length;
		for(int i=0;i<len;i++){
			int min = i;
			for(int j=i+1;j<len;j++){
				if(less(a[j],a[min]))
					min = j;
			}
			exch(a,i,min);
		}
	}
	public static boolean less(Comparable<Integer> v,Comparable<Integer> w){
		return v.compareTo((Integer) w)<0;
	}
	public static void exch(Comparable<Integer>[] a,int i,int j){
		Integer t = (Integer) a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void show(Integer[] a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args){
		Integer[] a = {3,6,1,5,7,0,7};
		sort(a);
		show(a);
	}

}
*/
public class Selection{
	public static void sort(int[] a){
		int len = a.length;
		for(int i=0;i<len;i++){
			int min = i;
			for(int j=i+1;j<len;j++){
				if(a[j]<a[min]){
					int t = a[min];
					a[min] = a[j];
					a[j] = t;
				}
			}
		}
	}
	public static void main(String[] args){
		int[] a = {3,6,1,5,7,0,7};
		sort(a);
	    for(int i=0;i<a.length;i++){
	    	System.out.print(a[i]+" ");
	    }
	}
}

package sort;

public class QuickSort {
	
	/**
	 * ����
	 * @param a
	 * @param start
	 * @param end
	 */
	public static void sort(int[] a, int start, int end){
		if(start > end){
			//���ֻ��һ��Ԫ�أ��Ͳ���������ȥ��
			return;
		} 
		else{
			//�����ֹһ��Ԫ�أ������������ߵݹ�������ȥ
			int partition = divide(a, start, end);
			sort(a, start, partition-1);
			sort(a, partition+1, end);
		}
			
	}
	


	
	/**
	 * �������ĳһ��Ԫ�ؽ��л��֣�С������ߣ�������ұ�
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	public static int divide(int[] a, int start, int end){
		//ÿ�ζ������ұߵ�Ԫ����Ϊ��׼ֵ
		int base = a[end];
		//startһ������end����˵����������ָ��ϲ�����ͬһλ�ã����Խ�������ѭ����
		while(start < end){
			while(start < end && a[start] <= base)
				//����߿�ʼ����������Ȼ�׼ֵС���ͼ���������
				start++;
			//�����whileѭ������ʱ����˵����ǰ��a[start]��ֵ�Ȼ�׼ֵ��Ӧ���׼ֵ���н���
			if(start < end){
				//����
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				//�����󣬴�ʱ���Ǹ���������ֵҲͬʱ��������ȷ��λ��(��׼ֵ�ұ�)������ұ�ҲҪͬʱ��ǰ�ƶ�һλ
				end--;
			}	
			while(start < end && a[end] >= base)
				//���ұ߿�ʼ����������Ȼ�׼ֵ�󣬾ͼ���������
				end--;
			//�����whileѭ������ʱ����˵����ǰ��a[end]��ֵ�Ȼ�׼ֵС��Ӧ���׼ֵ���н���
			if(start < end){
				//����
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				//�����󣬴�ʱ���Ǹ���������ֵҲͬʱ��������ȷ��λ��(��׼ֵ���)��������ҲҪͬʱ����ƶ�һλ
				start++;
			}	
			
		}
		//���ﷵ��start����end�Կɣ���ʱ��start��end��Ϊ��׼ֵ���ڵ�λ��
		return end;
	}

	
	
	public static void main(String[] args){
		int a[] = new int[] {6,2,5,8,7,3,4,1};
		int lo = 0;
		int hi = a.length-1;
	    sort(a,lo,hi);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}

package SystemDemo;

import java.util.Arrays;

/* *
 * ������ public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 *		��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
 */
public class SystemDemo2 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 11, 22, 33, 44, 55 };
		int[] arr2 = { 6, 7, 8, 9, 10 };

		System.arraycopy(arr, 1, arr2, 2, 2);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}

package com.company.sorted;

/**
 * 从任意数组中获取总和等于某一个值的所有数
 * 
 * @author Dell
 *
 */
public class FindSum {

	public static void sum(int[] num, int sum) {
		int begin = 0;
		int end = num.length - 1;
		sort(num, begin, end);
		while (begin < end) {
			int tmp = num[begin] + num[end];
			if (tmp < sum) {
				begin++;
			} else if (tmp > sum) {
				end--;
			} else {
				System.out.println(sum + "=" + num[begin] + "+" + num[end]);
				begin++;
				end--;
			}
		}

	}

	// 排序
	public static void sort(int[] num, int left, int right) {

		if (left > right) {
			return;
		}

		int i = left;
		int j = right;
		int tmp = num[left];// 存放临时比较数据
		while (i != j) {

		
			//顺序很重要，要先从右边开始找 
			while (i < j && num[j] >= tmp) {
				j--;
			}
			//再找左边的 
			while (i < j && num[i] <= tmp) {
				i++;
			}
			
			if (i < j) {
				int change = num[i];
				num[i] = num[j];
				num[j] = change;
			}

		}
		// 中间定位
		num[left] = num[i];
		num[i] = tmp;
		
		
		sort(num, left, i - 1);
		sort(num, i + 1, right);
		
	}

	public static void main(String[] args) {
		int[] n = { 11,7, 19,2,34,6,6,31,12,5,0,54,1,4,9};
		//FindSum.sort(n, 0, n.length-1);
		FindSum.sum(n, 10);
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+",");
		}
	}
}

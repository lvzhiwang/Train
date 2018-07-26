package com.company.sorted;

/**
 * 快速排序
 * 
 * @author Dell
 *
 */
public class QuickSort {

	public static void quickSort(int num[], int left, int right) {

		if (left >= right) {
			return;
		}

		int tmp = num[left];

		int i = left;
		int j = right;

		while (i != j) {
			//先从右边找，顺序很重要
			while (i < j && num[j] < tmp) {// 尾指针移动
				j--;
			}
			
			while (i < j && num[i] < tmp) {// 头指针移动
				i++;
			}

			if (i > j) {// 数据交换
				int a = num[i];
				num[i] = num[j];
				num[j] = a;
			}

		}

		// 最终将基准数归位
		num[left] = num[i];
		num[i] = tmp;

		quickSort(num, left, i - 1);// 继续处理左边的，这里是一个递归的过程
		quickSort(num, i + 1, right);// 继续处理右边的 ，这里是一个递归的过程

	}

}

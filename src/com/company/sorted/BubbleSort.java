package com.company.sorted;

/**
 * 冒泡排序算法
 * @author Dell
 *
 */
public class BubbleSort {
	
	public static void BubbleSorted(int [] num){
		
		int len = num.length;
		int tmp;
		for(int i=0;i<len-1;i++){//将第i个数下沉
			for(int j=0;j<len-i-1;j++){
				if(num[j]>num[j+1]){
					tmp = num[j];
					num[j]= num[j+1];
					num[j+1]=tmp;
				}
			}
		}
		
		for(int k=0;k<len-1;k++){
			System.out.println(num[k]);
		}
	}
	
	public static void main(String[] args) {
		int num[] ={36,25,48,12,25,65,43,57};
		BubbleSort.BubbleSorted(num);
	}
}

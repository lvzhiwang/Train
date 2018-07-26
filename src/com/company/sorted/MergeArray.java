package com.company.sorted;

/**
 * 合并两个有序数组
 * @author Dell
 *
 */
public class MergeArray {
	
	public static int[] merge(int[] a,int[] b){
		int lenA = a.length;
		int lenB = b.length;
		int[] result = new int[lenA+lenB];
		int i=0;
		int j=0;
		int k=0;	
		
		//遍历比较
		while(i<lenA && j<lenB){
			if(a[i]<=b[j]){
				result[k++]=a[i++];
			}else if(a[i]>b[j]){
				result[k++] = b[j++];
			}
		}
		
		//末尾合并
		while(i<lenA){//合并a
			result[k++] = a[i++];
		}
		
		while(j<lenB){
			result[k++] = b[j++];
		}
		
		return result;
	} 

	public static void main(String[] args) {
		
		int[] a = {2,3,4,5,6,7,100};
		int[] b = {3,4,5,7,8,9,91};
		int [] res = MergeArray.merge(a, b);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+",");
			
		}
	}
}

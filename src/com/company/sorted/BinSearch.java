package com.company.sorted;

/**
 * 二分查找算法
 * @author Dell
 *
 */
public class BinSearch {

	
	//获取所要查询key在数组中的下标
	public static int binSearch(int key,int[] num,int left,int right) {
		int result = -1;
		int len = right-left;
		if(len==0){
			if(key==num[left]){
				return left;
			}else{
				return -1;
			}
		}
		
		//在左侧时
		int tmp = left+len/2;
		if(num[tmp]>key){
			right = tmp-1;
			result = binSearch(key, num, left, right);
		}else if(num[tmp]<key){
			left = tmp+1;
			result = binSearch(key, num, left, right);
		}else{
			return tmp;
		}
		return result;
	}
	
	public static int binSearchByXH(int key,int[] num,int left,int right){
		
		while(right-left>=0){
			int tmp = left+(right-left)/2;
			if(num[tmp]>key){
				right = tmp-1;
			}else if(num[tmp]<key){
				left = tmp+1;
			}else{
				return tmp;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int key = 110;
		int[] num ={1,2,3,4,5,7,8,9,18,19,20,22,23,24,25,26,27,110};
		System.out.println("方法1在数组长度为："+num.length+"中，"+key+"下标为："+BinSearch.binSearch(key, num, 0, num.length-1));
		System.out.println("方法2在数组长度为："+num.length+"中，"+key+"下标为："+BinSearch.binSearchByXH(key, num, 0, num.length-1));
	}
}

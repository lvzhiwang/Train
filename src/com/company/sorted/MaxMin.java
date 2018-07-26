package com.company.sorted;

public class MaxMin {

	public static void getMaxAndMin(int num[]){
		int len = num.length;
		if(len==0){
			System.out.println("数组为空不合法");
		}
		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<len;i++ ){
			if(num[i]>max){
				max=num[i];
			}
			if(min>num[i]){
				min=num[i];
			}
		}
		System.out.println("min:"+min);
		System.out.println("max:"+max);
	}
	
	public static void main(String[] args) {
		int [] num = {2,4,5,223,23355,1215,6,7,4764,1,2,35,3,353,3,2131232,0};
		MaxMin.getMaxAndMin(num);
	}
}

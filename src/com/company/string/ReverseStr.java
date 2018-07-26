package com.company.string;

/**
 * 字符串反转
 * @author Dell
 *
 */
public class ReverseStr {

	/**
	 * how are you 转换为 you are how
	 * @param str
	 * @return
	 */
	public static String reverseStr(String str){
		
		if(str==null) return null;
		
		String[] split = str.split(" ");
		StringBuffer sbf = new StringBuffer();
		for(int i=split.length-1;i>=0;i--){
			sbf.append(" ");
			sbf.append(split[i]);
		}
		return sbf.toString();
	}
	
	/**
	 * 数据交换方法
	 * @param ch
	 * @param begin
	 * @param end
	 */
	public void swap(char[] ch,int begin,int end){
		while(begin<end){
			char tmp = ch[end];
			ch[end] = ch[begin];
			ch[begin] = tmp;
			begin++;
			end--;
		}
		
	}
	
	
	public String swapWord(String str){
		char[] ch = str.toCharArray();
		int end = ch.length-1;
		//对整个字符串进行反转
		swap(ch, 0, end);
		
		//对单个单词进行反转
		int begin = 0;
		for(int i=0;i<end;i++){
			if(ch[i]==' '){
				swap(ch, begin, i-1);
				begin = i+1;
			}
		}
		swap(ch, begin, end-1);
		return new String(ch);
	}
	
	
	public static void main(String[] args) {
		
		String str = ReverseStr.reverseStr("how are you");
		System.out.println(str.substring(1));
	}

}

package com.company.sorted;

import java.util.HashMap;
import java.util.Map;
/**
 * 获取频次最大的
 * @author Dell
 *
 */
public class FindMostFrequentInArray {

	public static void FindMostFrequent(int[] num) {
		int len = num.length;
		if (len == 0)
			System.out.println("数组长度为0");

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < len; i++) {
			if (map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i]) + 1);
			} else {
				map.put(num[i], 1);
			}
		}
		int most = 0;
		// 遍历map

		// 第三种：推荐，尤其是容量大时
		System.out.println("第三种：通过Map.entrySet遍历key和value");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}

	}
}

package com.company.pattern.factory.b;

import com.company.pattern.factory.RouJiaMo;

public abstract class RoujiaMoStore
{
	public abstract RouJiaMo createRouJiaMo(String type);

	/**
	 * 根据传入类型卖不同的肉夹馍
	 * @param type
	 * @return
	 */

	public RouJiaMo sellRouJiaMo(String type)

	{

		RouJiaMo rouJiaMo = createRouJiaMo(type);

		rouJiaMo.prepare();

		rouJiaMo.fire();

		rouJiaMo.pack();

		return rouJiaMo;

	}

 

}

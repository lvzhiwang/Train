package com.company.pattern.factory;

public abstract class RoujiaMoStore
{
 
	/**
	 * 根据传入类型卖不同的肉夹馍
	 * 
	 * @param type
	 * @return
	 */
	public RouJiaMo sellRouJiaMo(String type)
	{
		RouJiaMo rouJiaMo = null;
		
		if (type.equals("Suan"))
		{
			rouJiaMo = new SuanRouJiaMo();
 
		} else if (type.equals("Tian"))
		{
			rouJiaMo = new TianRouJiaMo();
		} else if (type.equals("La"))
		{
			rouJiaMo = new LaRouJiaMo();
		}
		
		rouJiaMo.prepare();
		rouJiaMo.fire();
		rouJiaMo.pack();
		return rouJiaMo;
	}
 
}

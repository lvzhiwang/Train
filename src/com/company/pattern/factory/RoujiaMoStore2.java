package com.company.pattern.factory;


/**
 * 
 * @author Dell
 * 简单工厂模式
 *
 */
public class RoujiaMoStore2
{
	private SimpleRouJiaMoFactroy factroy;
 
	public RoujiaMoStore2(SimpleRouJiaMoFactroy factroy)
	{
		this.factroy = factroy;
	}
 
	/**
	 * 根据传入类型卖不同的肉夹馍
	 * 
	 * @param type
	 * @return
	 */
	public RouJiaMo sellRouJiaMo(String type)
	{
		RouJiaMo rouJiaMo = factroy.createRouJiaMo(type);
		rouJiaMo.prepare();
		rouJiaMo.fire();
		rouJiaMo.pack();
		return rouJiaMo;
	}
 
}
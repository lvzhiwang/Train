package com.company.pattern.factory.b;

import com.company.pattern.factory.RouJiaMo;

/**
 * 西安肉夹馍店
 */

public class XianRouJiaMoStore extends RoujiaMoStore

{
	@Override
	public RouJiaMo createRouJiaMo(String type){
		RouJiaMo rouJiaMo = null;
		if (type.equals("Suan"))
		{
			rouJiaMo = new XianSuanRouJiaMo();

		} else if (type.equals("Tian"))
		{
			rouJiaMo = new XianTianRouJiaMo();
		} else if (type.equals("La"))
		{
			rouJiaMo = new XianLaRouJiaMo();
		}
		return rouJiaMo;

	}

}

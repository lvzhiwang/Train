package com.company.pattern.strategy;

public class DefendTBS implements IDefendBehavior
{
 
	@Override
	public void defend()
	{
		System.out.println("铁布衫");
	}
 
}
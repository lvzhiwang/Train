package com.company.pattern.strategy;

public class Test
{
	public static void main(String[] args)
	{
 
		Role roleA = new RoleA("A");
 
		roleA.setAttackBehavior(new AttackJY());
		roleA.setDefendBehavior(new DefendTBS());
		roleA.setRunBehavior(new RunJCTQ());
		System.out.println(roleA.name + ":");
		roleA.run();
		roleA.attack();
		roleA.defend();
		roleA.display();
	}
}
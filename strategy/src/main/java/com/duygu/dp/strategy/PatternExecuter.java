package com.duygu.dp.strategy;


public class PatternExecuter {

	public static void main(String[] args) {
		PatternExecuter executer = new PatternExecuter();
		executer.executeStrategyPattern();
	}

	public void executeStrategyPattern() {
		
		CharacterClass fighter = new Fighter();
		CharacterClass mage = new Mage();
		CharacterClass ranger = new Ranger();

		System.out.println("Fighter fights the monster:");
		fighter.fight();
		
		System.out.println("Mage fights the monster:");
		mage.fight();
		
		System.out.println("Ranger fights the monster:");
		ranger.fight();
	}
	
}

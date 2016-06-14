package com.duygu.dp.strategy;

public class CharacterClass {

	private WeaponBehavior weapon;

	public void fight() {
		getWeapon().useWeapon();
	}

	public WeaponBehavior getWeapon() {
		return weapon;
	}

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}

}
